package oop03.inheritance;

public class ObjectCastingDemo {

	public static void main(String[] args) {
		// 일반적인 객체 생성
		//Aclass a = new Aclass();
		//Bclass b = new Bclass();
		 
		// 부모 타입 = new 자식 타입
		
		Aclass a2 = new Bclass();  
		//* 생성자 즉! 특수 메소드 이죠!! 
		//* 그래서           //클래스가 아니에여 생성자에여 메소드이에요.....
		
		a2.over(1);
		//*자식 클래스 와 부모 클래스의 메소드가 같다면 자식클래스의 메소드를 최우선으로 쓴다..
		
		// 오버라이딩시 자식 클래스 메소드 우선 출력
		a2.over(1);
		// 오버라이딩 하지 않으면 부모클래스 우선 호출
		a2.noOver(1);
		
		
		// 부모클래스 타입을 자식클래스로 갖에 형변환
		Bclass b2 = (Bclass) a2;
		b2.over(1);
        b2.noOver("AAAA"); 	
        
       // Bclass bc = new Aclass();
        
		
		
	}

}

class Aclass{
	void over(int i){
		System.out.println("Aclass-over() : "+ (i*10));
		
	}
	void noOver(int i){
		System.out.println("Aclass-noOver() : "+i);
	}
	
	   
	
	 
}

class Bclass extends Aclass{
	/*
	public Bclass() {
		//생성자는 특수한 형태의 메소드 이죠!!
	    //생성자에서 여기서 다른 메소드를 호출하지않으면 쓸수가 없잖아요!!
		
	
	
	}
	*/

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