package oop03.inheritance;
/*

Date :
Author :
Desc : 메소드 상속
* */
/*
  △
 |  상속 
 Hcar <- new ( instantiate )
 //controler 와 service 는 사용하는 관계이다..
 //헤저 관계, 이주 관계
 
 * */

class Car2{
	  String name = "자동차";
	  public String gear(){
		  return "수동기어";
		  
	  }
}

class Hcar2 extends Car2{
	   String brand = "현대차";
	   public String autoGear(){
		   return "오토기어" ;
	   }
	
}


public class MethodExtendsDemo {

	public static void main(String[] args) {
       Hcar2 hcar2 = new Hcar2();
       
        System.out.println(hcar2.gear());
        System.out.println(hcar2.autoGear());
        
        Car2 car2 = new Car2();
        System.out.println(car2.gear());
       // System.out.println(car2.autoGear());
      //에러는 이유 : 상속하여 받을 수 있는 로직은 자식만 가능하다..

	}

}
