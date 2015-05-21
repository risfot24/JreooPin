package oop04.abstraction;

public class TvInfo extends ProductInfo {

	protected String inchInfo;
	protected String screenRatioInfo;
	
	@Override
	public void displayProductInfo() {
		System.out.println("����ȸ�� : "+this.productCompany);
		System.out.println("��ǰ�� : "+this.prouctName);
		System.out.println("��ǰID : "+this.productSerialID);
		System.out.println("ȭ������� : "+this.inchInfo);
		System.out.println("ȭ�� ���� : "+this.screenRatioInfo);
		
		
	}
	public void setTvInfo(String productCompany, String productName, 
			String productSerialID, String inchInfo, String screenRatioInfo){
		this.inchInfo = inchInfo;
		this.screenRatioInfo = screenRatioInfo;
		super.setProductInfo(productCompany, productName, productSerialID);
		
	}

}
