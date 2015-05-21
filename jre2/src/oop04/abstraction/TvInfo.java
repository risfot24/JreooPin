package oop04.abstraction;

public class TvInfo extends ProductInfo {

	protected String inchInfo;
	protected String screenRatioInfo;
	
	@Override
	public void displayProductInfo() {
		System.out.println("제조회사 : "+this.productCompany);
		System.out.println("제품명 : "+this.prouctName);
		System.out.println("제품ID : "+this.productSerialID);
		System.out.println("화면사이즈 : "+this.inchInfo);
		System.out.println("화면 비율 : "+this.screenRatioInfo);
		
		
	}
	public void setTvInfo(String productCompany, String productName, 
			String productSerialID, String inchInfo, String screenRatioInfo){
		this.inchInfo = inchInfo;
		this.screenRatioInfo = screenRatioInfo;
		super.setProductInfo(productCompany, productName, productSerialID);
		
	}

}
