package org.employee;

import or.san.client;

public class EmployeeDetails {

	private void empName() {
		
		System.out.println("Employee Name : Saravanan");
	}
	
     private void empMobile() {
		
		System.out.println("Employee Mobile : 9791849575");
		
     }
	

	public static void main(String[] args) {
		
		
		EmployeeDetails e = new EmployeeDetails ();
		
		e.empName ();
		
		e.empMobile ();
		
   Company com = new Company();
		
		com.comName();
		com.comId();
		
		client cl = new client();	
		
		cl.clName();
		cl.clLocation();
		
		

	}

}
