package com.oops.bll;

public class Author {
    private String firstname;
    private String lastname;
    private String bookname;
    Author(){
       
     }
     public Author(String firstname, String lastName)
     {
       this.firstname=firstname;
       
       this.lastname=lastName;
     }
     //setters
     public void setFirstName(String firstName) {
    	 this.firstname=firstName;
     	 
     }
     public void setLastName(String lastName, String lastname) {
    	this.lastname=lastname; 
     }
     public void setbookname (String bookname) {
        this.bookname=bookname;
      
     }
     //getters
     public String getFirstName() {
    	 return firstname;
     }
      public String getLastName () {
    	  return lastname;
      }
      public String getBookName () {
    	  return bookname;
      }
    	  
     @Override
      public String toString() {
    	 String firstName = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("");
		stringBuilder.append("Author's Name :");
		stringBuilder.append(firstName);
		stringBuilder.append(" ");
		stringBuilder.append(lastname);
		stringBuilder.append(" ");
		stringBuilder.append("\nBook Name:");
		return stringBuilder.toString();
    			 
     }
}
     
