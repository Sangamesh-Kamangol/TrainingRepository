package com.capgemini;

public class Human {
		int humanid;
		String firstname;
		String lastname;
		public void displaydetails() {
		System.out.println(humanid + " "+ firstname + " "+ lastname);
		}
		public Human(int humanid, String firstname, String lastname) {
			super();
			this.humanid = humanid;
			this.firstname = firstname;
			this.lastname = lastname;
		}
		
}
