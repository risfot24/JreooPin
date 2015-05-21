package oop04.abstraction;

public class ProductClassController {

	public static void main(String[] args) {
		 ComputerInfoClass ci = new ComputerInfoClass();
		 ci.setInfo("삼성 ", "센스", "A-1234", "듀얼코어", "2GB", "500GB"); 
		 
		 /*
		 TvInfoClass ti = new TvInfoClass();
		 ti.setInfo("LG", "x캔버스","lg-1234","42인치","LCD"); 
		 */
		 
		 ProductInterface[] pi = new ProductInterface[1];
		 pi[0] = ci;
		 //pi[1]= ti;
		 
		 for(int i=0 ; i<pi.length ;i++){
			 pi[i].display();
		
		 //만약 배열의 크기만큼 어떠한 데이터값을 입력하지않으면 절대로 null
		 }
         
		
	}

}
