package oop09.nestedClass;

public class InnerClassAnonyHello {
         interface GreetingService{
        	    public void great(String name);
        	 
         }
	     public void sayHello(){
	    	 /*
	    	  * ����Ŭ���� �������̽� ���� ���
	    	  */
	    	 class EnglishGreetingServiceImp1 implements GreetingService {

				@Override
				public void great(String name) {
					System.out.println("Hello "+ name);
					
				}
				
	    	 
	    	 }
	    	 
	    	 GreetingService eng = new EnglishGreetingServiceImp1();
	    	 /*
	    	  * ����Ŭ���� �������̽� ������� 2
	    	  */
	    	 GreetingService kor = new GreetingService(){

				@Override
				public void great(String name) {
					System.out.println("�ȳ��ϼ��� ."+name);
					
				}
	    		 
	    	 };
	    	 //GreetingService jap = new GreetingService(){
	    		 
	    	 //}
	    	 eng.great("Tom");
	    	 eng.great("��");
	     }
         public static void main(String[] args) {
			InnerClassAnonyHello great = new InnerClassAnonyHello();
			great.sayHello();
        	 
		}
	     
	     
}
