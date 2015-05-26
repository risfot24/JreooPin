package oop09.nestedClass;

public class InnerClassAnnoyServiceImp1 {
    //implements InnerClassAnonyService  //지웠다.
	 String data = "Hello Anonymous !!";
	
     public void print(){
    	/*
    	 new InnerClassAnnoyServiceImp1() {

		 
    		 
    	 };
    	 */
    	 new InnerClassAnonyService() { //메소드 상태로 나둬서 인스턴스영역에 안올라간다..//
			
			@Override
			public void printData() {
				System.out.println("익명 내부클래스 출력 : "+data);
				
			}
		}.printData();   //.printData(); //왜지??
     }

}
