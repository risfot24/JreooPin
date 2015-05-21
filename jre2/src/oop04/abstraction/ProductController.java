package oop04.abstraction;

public class ProductController {

	public static void main(String[] args) {
		ComputerInfo ci = new ComputerInfo();
		
		ci.setComputerInfo("삼성", "센스", 
				     "a-1234-4567", "dual-core", "8G", "500MB");
		ci.displayProductInfo();
		System.out.println();
		
		TvInfo ti = new TvInfo();
		//set 메소드 호출
		//TV 정보는
		//
		
		ti.setTvInfo("LG","X캔버스","X-12345","42인치","16:9");
		
		
		ti.displayProductInfo();
		

	}

}
