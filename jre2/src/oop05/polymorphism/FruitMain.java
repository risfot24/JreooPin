package oop05.polymorphism;

public class FruitMain {

	public static void main(String[] args) {
		// 인터페이스는 객체를 만들수 없다.
		// 즉, FruitInterface fi = new FruitInterface();
		// 에러를 발생한다.
		FruitInterface apple = new AppleImp1();
		FruitInterface banana ;
		//FruitInterface 타입의 참조변수를 선언. 
		banana = new BananaImp1();
		// 클래스 BananaImp1 의 객체를 생성하여
		// banana 에 할당. (대입,)
		
		FruitInterface orange = new OrangeImp1();
		
		apple.display("맛있는 ");
		banana.display("오래된 ");
		orange.display("비싼 ");
		
		//orange.getCount() ;
		//에러 나는 이유 : 인터페이스에서 선언된 메소드만 호출이 가능하다.

	}

}
