package com.capgemini;

	public class Person extends Human{
		public String personidentity;
		public void displaydetails() {
			super.displaydetails();
			System.out.println(personidentity);
			
	}
		public Person(int humanid, String firstname, String lastname, String personidentity) {
			super(humanid, firstname, lastname);
			this.personidentity = personidentity;
		}
}
