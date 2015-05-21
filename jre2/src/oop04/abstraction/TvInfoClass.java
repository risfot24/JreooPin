package oop04.abstraction;

public class TvInfoClass extends ProductInfoClass {
	private String screenSize;
	private String screenRatioInfo;
	@Override
	public void setInfo(String productCompany, String prouctName,
			String productSerialID) {
		
		super.setInfo(productCompany, prouctName, productSerialID);
	   this.screenSize = screenSize;
	   this.screenRatioInfo = prouctName;
	
	}

	
	
	

	

}
