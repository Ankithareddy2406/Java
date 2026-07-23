package com.constructor;

public class EmployeeProcessor {

	public static void main(String[] args) {
		Employee e=new Employee(201,"Bob","Developer",50000.0,5);
		e.getempid();
		e.getname();
		e.getdesignation();
		e.getsalary();
		e.getperformanceRating();
		e.promoteEmployee();
		e.setdesignation("Senior");
		e.setsalary(60000.0);	

	}

}
