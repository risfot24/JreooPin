package oop04.abstraction;

public class ProductInfoClass implements ProductInterface{
	private String productCompany;
    private String prouctName;
    private String productSerialID;
    
    
   // public abstract void setInfo();


	public void setInfo(String company, String name, String sid){
		this.productCompany = company;
		this.prouctName = name;
		this.productSerialID = sid;
	}
	



@Override
public void display() {
	System.out.println("회사 :"+this.productCompany);
	System.out.println("이름 : "+this.prouctName);
	System.out.println("id :" +this.productSerialID);
	
}





}