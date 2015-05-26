package oop09.nestedClass;

public class InnerClassAnonyHello {
         interface GreetingService{
        	    public void great(String name);
        	 
         }
	     public void sayHello(){
	    	 /*
	    	  * 내부클래스 인터페이스 구현 방법
	    	  */
	    	 class EnglishGreetingServiceImp1 implements GreetingService {

				@Override
				public void great(String name) {
					System.out.println("Hello "+ name);
					
				}
				
	    	 
	    	 }
	    	 
	    	 GreetingService eng = new EnglishGreetingServiceImp1();
	    	 /*
	    	  * 내부클래스 인터페이스 구현방법 2
	    	  */
	    	 GreetingService kor = new GreetingService(){

				@Override
				public void great(String name) {
					System.out.println("안녕하세요 ."+name);
					
				}
	    		 
	    	 };
	    	 //GreetingService jap = new GreetingService(){
	    		 
	    	 //}
	    	 eng.great("Tom");
	    	 eng.great("음");
	     }
         public static void main(String[] args) {
			InnerClassAnonyHello great = new InnerClassAnonyHello();
			great.sayHello();
        	 
		}
	     
	     
}
