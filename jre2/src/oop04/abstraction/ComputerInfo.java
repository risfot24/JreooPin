package oop04.abstraction;

public class ComputerInfo extends ProductInfo {
	protected String cpuInfo;
	protected String ramInfo;
	protected String hddInfo;
	
	//마우스 클릭하여 이클립스가 확인 하게 끔 하라~~
	//ctrl + space 는 하지마라..
	
	@Override
	public void displayProductInfo() {
	    System.out.println("제조회사 : "+super.productCompany);
	    System.out.println("제품명 : "+super.prouctName);
	    System.out.println("cpu 정보 : "+this.cpuInfo);
	    System.out.println("메인메모리 정보 : "+this.ramInfo);
	    System.out.println("하드디스크 정보 : "+this.hddInfo);
		
		
		
	}
	public void setComputerInfo(String productCompany,String productName, String productSerialID, 
			        String cpuInfo,String ramInfo,String hddInfo){
	     this.cpuInfo = cpuInfo;
	     this.ramInfo = ramInfo;
	     this.hddInfo = hddInfo;
	     //this.productCompany  
	     super.setProductInfo(productCompany, productName, productSerialID);
	      
		   
	       
	       
		
	}
	
	
}
