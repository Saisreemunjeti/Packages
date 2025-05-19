package com.company.app;

import com.company.hr.Employee;
import com.company.admin.Department;

public class CompanyApp {

	    public static void main(String [] args){
	       Employee employee=new Employee();
	          employee.setId(101);
	          employee.setName("Sai Sree");
	          employee.setSalary(430000);
	       Department department=new Department();
	          department.setDeptId(201);
	          department.setDeptName("IT");  
	        employee.showEmployeeDetails();
	  		System.out.println();
	  	    department.showDepartmentDetails();
	}
	   }

