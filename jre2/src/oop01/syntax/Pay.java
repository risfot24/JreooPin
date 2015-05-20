package oop01.syntax;

import java.util.Scanner;

public class Pay {
  private String name;
  private int salary;
  static final double TAX = 0.1;
  //필드에서는 멤변 추가하시지마시고 메인 메소드에서 출력하게끔 하세요..
  //get ,set 도 없습니다. ! 갑자기 getter, setter 추가하래네~~ 나는 안한다.. ! 스캐너도 쓰지 마라..
  // 참조 변수를 만들어서 접근할수 있지 않아요?? 참조 변수 만들어라..
  //그냥 하드 코딩해라
  
  /*
  paRefy(String name, int salary){
	  
  }
  */
  
  
	public static void main(String[] args) {
	   System.out.println("===헐크의 5월달 상급여는 300만원 입니다.");	
	   System.out.println("===아이언맨의 5월달 상급여는 500만원 입니다.");	
	   System.out.println("===토르의 5월달 상급여는 100만원 입니다.");	
	   
	   System.out.println("==================================");
  
	   int income = 0 ;
	   
	   Pay paRef = new Pay();  //참조변수를 선언하는 방법
	    
	   //Pay hulk = new Pay();
	   //Pay iron = new Pay();
	   //Pay thor = new Pay();
	    
	   //명확히 할려면 : hulk.name , hulk.salary,  
	   
	    paRef.name = "헐크";
	    paRef.salary = 3000000;
	    income = (int) ( paRef.salary -( paRef.salary *(1-paRef.TAX) ) );
	    //(int)((1-Pay.TAX)*pay.salary) // Pay.TAX -> TAX
	    
	    
	    System.out.println(paRef.name +"5월달 상급여는 및 세금 : " +paRef.salary+" , "+income );
	    
	    paRef.name = "아이언맨";
	    paRef.salary = 5000000;
	    
	    income = (int) ( paRef.salary -( paRef.salary *(1-paRef.TAX) ) );
	    
        System.out.println(paRef.name +"5월달 상급여는 및 세금 : " +paRef.salary+" , "+income );
	    
	    
	    paRef.name = "토르";
	    paRef.salary = 1000000;
        income = (int) ( paRef.salary -( paRef.salary *(1-paRef.TAX) ) );
	    
         System.out.println(paRef.name +"5월달 상급여는 및 세금 : " +paRef.salary+" , "+income );
	    
	
	}
	
	

	
	
}
