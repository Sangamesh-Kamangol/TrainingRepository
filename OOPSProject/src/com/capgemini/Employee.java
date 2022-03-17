package com.capgemini;

public class Employee {
	/*	int EmployeeId;
		String EmployeeName;



		public Employee(int empid, String empname ) {
		EmployeeId=empid;
		EmployeeName=empname;
		}



		public void acceptdetails() {
		// method to accept the details of employee
		}
		public void displaydetails() {
		System.out.println(EmployeeId);
		System.out.println(EmployeeName);

		}
	*/
	
		int employeeid;
		String employeename;
		Address address;



		public Employee(int employeeid, String employeename, Address address) {
		this.employeeid=employeeid;
		this.employeename=employeename;
		this.address=address;

		}
		public void acceptdetails() {
		// method to accept the details of employee
		}
		public void displaydetails() {
		System.out.println(employeeid);
		System.out.println(employeename);
		System.out.println(address.addressid);
		System.out.println(address.address1);
		System.out.println(address.address2);
		System.out.println(address.city);

		}
		}

