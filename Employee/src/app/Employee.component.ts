import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { EmployeeService } from './Employee.service';

interface Employee {
  employeeId: number | null;
  name: string;
  position: string;
  salary: number;
}

@Component({
  selector: 'app-employee-root',
  templateUrl: './Employee.component.html',
  styleUrls: ['./Employee.component.scss'],
})
export class EmployeeComponent implements OnInit {
  title = 'Employees';
  employees: Employee[] = [];

  employeeToUpdate: Employee = {
    employeeId: null,
    name: '',
    position: '',
    salary: 0,
  };

  constructor(private employeeService: EmployeeService) {}

  ngOnInit(): void {
    this.getEmployees();
  }

  addEmployee(employeeForm: NgForm): void {
    const newEmployee = {
      name: employeeForm.value.name,
      position: employeeForm.value.position,
      salary: employeeForm.value.salary,
    };

    this.employeeService.addEmployee(newEmployee).subscribe(
      () => {
        console.log('Employee added successfully.');
        employeeForm.reset();
        this.getEmployees();
      },
      (error) => console.error('Error adding employee:', error)
    );
  }

  getEmployees(): void {
    this.employeeService.getEmployees().subscribe(
      (response: any) => {
        if (Array.isArray(response)) {
          this.employees = response.map((employee: any) => ({
            employeeId: employee.employeeId,
            name: employee.name || '',
            position: employee.position || '',
            salary: employee.salary || 0,
          }));
        } else {
          console.error('Unexpected response structure:', response);
          this.employees = [];
        }
      },
      (error) => console.error('Error fetching employees:', error)
    );
  }

  deleteEmployee(employee: Employee): void {
    if (!employee.employeeId) {
      alert('Error: Employee ID is missing. Cannot delete.');
      return;
    }

    this.employeeService.deleteEmployee(employee.employeeId).subscribe(
      () => {
        console.log('Employee deleted successfully.');
        this.getEmployees();
      },
      (error) => {
        console.error('Error deleting employee:', error);
        alert('Error deleting employee');
      }
    );
  }

  edit(employee: Employee): void {
    this.employeeToUpdate = { ...employee };
  }

  updateEmployee(): void {
    if (!this.employeeToUpdate.employeeId) {
      alert('Error: Employee ID is missing. Cannot update.');
      return;
    }

    this.employeeService.updateEmployee(this.employeeToUpdate).subscribe(
      () => {
        console.log('Employee updated successfully.');
        this.getEmployees();
        this.resetEmployeeToUpdate();
      },
      (error) => {
        console.error('Error updating employee:', error);
        alert('Error updating employee');
      }
    );
  }

  private resetEmployeeToUpdate(): void {
    this.employeeToUpdate = {
      employeeId: null,
      name: '',
      position: '',
      salary: 0,
    };
  }
}
