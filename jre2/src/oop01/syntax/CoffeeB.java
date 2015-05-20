package oop01.syntax;

/*
 * 생성자는 인스턴스가 생성될때
 * 호출 되는 '인스턴스 초기화 메소드 ' 이다.
 * 
 */

class MilkCoffee{
	public int money;
	public boolean exist;
	
	public MilkCoffee(){
		//this(500);
		//this(200,true);
		System.out.println("돈을 넣다");
		
	}
	
	public MilkCoffee(int money){
		//this(); //답
		this(200,true);
		
		System.out.println(money + "원");
		
		
	}
	public MilkCoffee(int money, boolean exist){
		
		//this(200); //답
		this();
		System.out.println(
         "구매가능여부 : "+ (exist == true ? "커피종류선택" : "커피없음 "));
		
	}
	
	
}

public class CoffeeB {
	
	public static void main(String[] args) {
		
		//MilkCoffee milk = new MilkCoffee(500,true); //답
		
		//MilkCoffee milk2 = new MilkCoffee();	
	    //milk.money = 200;
		//milk.exist = false;
		//milk.exist = true;
	   
		//MilkCoffee milk2 = new MilkCoffee();	
	  // milk2.money = 300; 
	   //MilkCoffee milk3 = new MilkCoffee(400);
	
	 //인스턴스는 변하지 않는 주소값을 가진... 변하지 않는 주소를 가지고있다.
	}

}
