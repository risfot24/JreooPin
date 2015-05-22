package oop05.polymorphism;

public class OrangeImp1 implements FruitInterface {

	@Override
	public void display(String s) {
        System.out.println( s+"오렌지 입니다.");
        
	}
	public int setCount(){
		return 1000;
	}
	

}
