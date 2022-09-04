package com.oops.bll;

public class TestEmployee {
	public static void main(String[] args) {
		Employee E1 = new Employee(01, "Banty", "Mishra", 50000);
	      System.out.println(E1);  // toString();

	      //  Setters and Getters
	      E1.setSalary(1000);
	      System.out.println(E1);  // toString();
	      System.out.println("id is: " + E1.getId());
	      System.out.println("firstname is: " + E1.getFirstName());
	      System.out.println("lastname is: " + E1.getLastName());
	      System.out.println("salary is: " + E1.getSalary());

	      System.out.println("name is: " + E1.getName());
	      System.out.println("annual salary is: " + E1.getAnnualSalary()); // Test method

	      //  raiseSalary()
	      System.out.println(E1.getraiseSalary(10));
	      System.out.println(E1);
	   }

	}
	

	
	


