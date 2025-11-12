import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class EmployeeService {
  API = 'http://localhost:8085'; // Base API URL

  constructor(private http: HttpClient) {}

  addEmployee(employeeData: any) {
    return this.http.post(`${this.API}/employee`, employeeData);
  }

  getEmployees() {
    return this.http.get(`${this.API}/employee`);
  }

  deleteEmployee(employeeId: number) {
    return this.http.delete(`${this.API}/employee/${employeeId}`);
  }

  updateEmployee(employee: any) {
    const employeeId = employee.employeeId;
    if (!employeeId) {
      throw new Error('Employee ID is required for updating employee data.');
    }
    return this.http.put(`${this.API}/employee/${employeeId}`, employee);
  }
}
