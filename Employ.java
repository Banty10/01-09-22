package com.oops.bll;

public class Employ {
	private int id;
	private String firstname;
	private String lastname;
	private double salary;
	
    void Employee() //Default constructor
	{
	}
	void Employee(int id, String firstName, String lastName,double salary)
	{
		this.id=id;
		this.firstname=firstName;
		this.salary=salary;
		 
	}
	    public int getId()
	    {
	    	return id;
	    }
	    public String getfirstname()
	    {
	    	return firstname;
	    }
	    public String getlastName() {
	    	return lastname;
	    }
	    public double getsalary() {
	         return salary;
	    }
	     public void setsalary(double salary) {
	    	 this.salary=salary;
	     }
	     public double getannualSalary() {
	          return salary*12;
	     }
	     public double getraiseSalary(int percent) {
	    	 return salary*12+(salary*12*(percent/100F));
	     }
	     
	    	 
	    	 @Override 
	    	public String toString() {
	    		 return""+"Employee id:"+id+"Name:"+firstname+" "+lastname+"Salary:"+salary;
	    		 {
	    			 
	    		 }
	     
	    	 
	     
	    
	    
	    


