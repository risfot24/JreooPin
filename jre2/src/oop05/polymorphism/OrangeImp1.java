package oop05.polymorphism;

public class OrangeImp1 implements FruitInterface {

	@Override
	public void display(String s) {
        System.out.println( s+"������ �Դϴ�.");
        
	}
	public int setCount(){
		return 1000;
	}
	

}
