package oop09.nestedClass;
/*
 내부클래스(Inner class) 첫번째 형태.
   - 인스턴스 내부 클래스
   - 멤버메소드를 클래스 내부에 선언함. 
* */
public class InnerClassInstance {
     int a = 10;                  //인스턴스 내부 클래스
     private int b = 100;
     static int c = 200;
     
     public class Inner{            //같이 움직이기 때문입니다..
    	public void printData(){
    		 System.out.println("멤버변수 a :"+a);
    		 System.out.println("프라이빗변수 b :" +b);
    		 System.out.println("스테틱변수 b :" +c);
    	}
     }
	
}








/*  여기에서 
  멤변이 3개이냐 , 메소드가 1000개이든 비준 은 똑같다..
  왜냐하면 주소값은 일정하기 때문입니다.. 
 
 * */
