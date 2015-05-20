package oop02.encapsule;

import java.util.Scanner;

public class PayController {
 
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	PayService Service = new PayService();
	String name;  //네임 과 샐러리 만 입력 받는다..
	int salary;     //상수는 대문자로 

	   /*
	    * income = salary - tax
	    * PayController : 입출력
	    * PayService : 계산로직
	    * PayVO  : GETTER, SETTER 
	    * 세개 로 분할 하세요.
	    * 이름과 급여는 입력받아서
	    * 세율 뺀 실 소득을 구하는 로직입니다.
	    */
	
	  System.out.print("성명 :  ");
	  name = scan.next(); 
	  System.out.print("본봉 : ");
	  salary = scan.nextInt(); 
	  Service.exe(name, salary);   //exe -> calculateIncome
	  //Service.output();
	  System.out.println("==== 급여 내역 ====");
	  System.out.print("성명 : "+Service.name()+"\n");
	  System.out.print("본봉: "+Service.Salary()+"\n");
	  System.out.print("월급 : "+Service.income()+"\n");
	  System.out.print("세금 : "+Service.taxcalc());
	  
	  
	  
	  //System.out.println("실수령액 : ");
     // System.out.print(Service.name());
	  //System.out.print(Service.VO.getName());	
      
	
	
	}

}
