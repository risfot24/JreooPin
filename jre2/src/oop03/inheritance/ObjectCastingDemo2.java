package oop03.inheritance;

public class ObjectCastingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// 일반적인 객체 생성
			//Aclass a = new Aclass();
			//Bclass b = new Bclass();
			 
			// 부모 타입 = new 자식 타입
			
			Aclass1 a2 = new Bclass1(); 
			// 오버라이딩시 자식 클래스 메소드 우선 출력
			a2.iover(1);
			// 오버라이딩 하지 않으면 부모클래스 우선 호출
			a2.inoOver(1);
			
			
			// 부모클래스 타입을 자식클래스로 갖에 형변환
			
			Bclass1 b2 = (Bclass1) a2;
			//b2.over(1);
	        //b2.noOver("AAAA"); 	
	        
	       // Bclass bc = new Aclass();
	        
			
			
		}

	}

	class Aclass1{
		void iover(int i){ 
			System.out.println("Aclass-over() : "+ (i*10));
			
		}
		void inoOver(int i){
			System.out.println("Aclass-noOver() : "+i);
		}
		
		   
		
		 
	}

	class Bclass1 extends Aclass1 {
		
		void over(int i){
			System.out.println("Bclass-over() : "+(i*10000) );
		}
	  
	    void noOver(String s){
	    	System.out.println("Bclass-over() : "+s);
	    	
	    }
	    void onlyB(){
	    	System.out.println("onlyB()");
	    }
	   
	 
	}
