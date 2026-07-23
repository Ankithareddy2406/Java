package com.constructor;

public class Employee {
	int empid;
	String name;
	String designation;
	double salary;
	int performanceRating;
	Employee(int Employeeid,String Employeename,String Currentdesignation,double Employeesalary,int Ratingoutof5){
		empid=Employeeid;
		name=Employeename;
		designation=Currentdesignation;
		salary=Employeesalary;
		performanceRating=Ratingoutof5;
		
	}
	public void setdesignation(String Currentdesignation) {
		designation=Currentdesignation;
	}
		public void setsalary(double Employeesalary) {
			salary=Employeesalary;
		}
		public int getempid() {
		return empid;
		}
		public String getname() {
			return name;
		}
		public String getdesignation() {
			return designation;
		}
		public double getsalary() {
			return salary;
		}
		public int getperformanceRating() {
			return performanceRating;
		}
		
      public void promoteEmployee() {
    	  System.out.println("*****Before Promotion*****");
    	  System.out.println("EmployeeID:"+empid);
    	  System.out.println("Name:"+name);
    	  System.out.println("Designation:"+designation);
    	  System.out.println("Salary$:"+salary);
    	  System.out.println("Performance Rating:"+performanceRating);
    	 
    	  
    	  if(performanceRating>=4) {
    		  salary=salary+(salary*20/100);
    		  designation="senior"+designation;
    		  System.out.println("Employee Promoted");
    	  }
    	  else {
    		  System.out.println("Employee not promoted");
    	  }
    	  System.out.println("*****After Promotion*****");
    	  System.out.println("New Designation:"+designation);
    	  System.out.println("Developer updated");
          System.out.println("Salary$:salary");
    	  
      }
}
	

	
