package oop04.abstraction;

public class ComputerInfo extends ProductInfo {
	protected String cpuInfo;
	protected String ramInfo;
	protected String hddInfo;
	
	//���콺 Ŭ���Ͽ� ��Ŭ������ Ȯ�� �ϰ� �� �϶�~~
	//ctrl + space �� ��������..
	
	@Override
	public void displayProductInfo() {
	    System.out.println("����ȸ�� : "+super.productCompany);
	    System.out.println("��ǰ�� : "+super.prouctName);
	    System.out.println("cpu ���� : "+this.cpuInfo);
	    System.out.println("���θ޸� ���� : "+this.ramInfo);
	    System.out.println("�ϵ��ũ ���� : "+this.hddInfo);
		
		
		
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
