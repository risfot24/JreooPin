package oop05.polymorphism;

public class AppleImp1 implements FruitInterface {
	
	@Override
	public void display(String s) {
		
		System.out.println(s+"사과 입니다.");
		
	}

}
