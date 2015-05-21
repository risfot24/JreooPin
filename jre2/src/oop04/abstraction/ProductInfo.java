package oop04.abstraction;

public abstract class ProductInfo {
    protected String productCompany;
    protected String prouctName;
    protected String productSerialID;
    
    public void setProductInfo(String productCompany, 
    		                   String productName,
    		                   String productSerialID){
    	this.productCompany = productCompany;
    	this.prouctName = productName;
    	this.productSerialID = productSerialID;
    	
    }
    public abstract void displayProductInfo();
    
	
}
