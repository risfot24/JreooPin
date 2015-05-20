package oop02.encapsule;

public class PayVO {
	static final double tax = 0.1;// ½ºÅÂÆ½ º¯¼ö?
	private int salary ;
	private String name;
	private double income ;
	/*
	  
	
	
    * */
	//
	public void setSalary(int salary) {
	this.salary = salary;
    }
	
	public int getSalary() {
		return salary;
	} 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public static double getTax() {
		return tax;
	}
	
	
	

	


	
	
}
