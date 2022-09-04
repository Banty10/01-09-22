package com.oops.bll;

public class invoiceltem {
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	public void InvoiceItem() {
		
	}
	public void InvoiceItem(String id,String desc,int qty,double unitPrice) {
		
	       this.id=id;
	       this.desc=desc;
	       this.qty=qty;
	       this.unitPrice=unitPrice;
	    	   
	       }
	
	       public String getId()
	       {
	    	   return id;
	       }
	       public String getDesc()
	       {
	    	   return desc;
	    
	       }
	       public int getqty() {
	    	   return qty;
	    	   
	       }
	       public void setQty(int qty) {
	    	   this.qty=qty;
	    	   
	       }
	       public double getUnitprice()
	       {
	    	   return getUnitprice();
	       }
	       public void setunitprice(double unitPrice) {
	    	   this.unitPrice =unitPrice;
	    	}
	       public double getTotal() {
	    	   return unitPrice*qty;
	       }
	    	   
	       
	       @Override
	       public String toString() {
	    	   
	       
	    	return "Invoice Item: "+"\nID: "+id+"\ndesc: "+desc+"\nqty: "+qty+"\nunit price: "+unitPrice;
	    	{
	    	   }
	    	 
	       
	
	


