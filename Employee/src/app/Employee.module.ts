import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { EmployeeComponent } from './Employee.component';
import { EmployeeService } from './Employee.service';

@NgModule({
  declarations: [EmployeeComponent],
  imports: [BrowserModule, FormsModule, HttpClientModule],
  providers: [EmployeeService],
  bootstrap: [EmployeeComponent],
})
export class AppModule {}
