package oop09.nestedClass;

public class InnerClassStatic {
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	public static class Inner{
		static int d = 1000;
		public void printData(){
			//System.out.println("멤변 a : "+a); //Cannot make a static reference to the non-static field a
		    //System.out.println("프라이빗 b : "+b); //static 에서는 static만 호출이 가능하다.
			/*
			 a 와 b값이 에러가 나는것은...
			 static 내부클래스는 사실 더이상의 내부클래스가 아니다.
			 또한 외부클래스를 가지지 않고도 접근할 수 있다.
			 따라서 top level class 라고 하여 최상위 클래스라 한다.
			 어쩔수 없이 내부클래스를 static 으로 선언해야 하는 경우가 있다.
			 그건 바로 내부 클래스의 멤버들 중 하나라도
			 static 멤버가 있을 경우이다.
			
			//핸드폰의 usim 칩 같은거..
			* */
			System.out.println("스태틱 c :"+c);
			System.out.println("스태틱 d : "+d);
		
		}
	}

}
