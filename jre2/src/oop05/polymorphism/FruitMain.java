package oop05.polymorphism;

public class FruitMain {

	public static void main(String[] args) {
		// �������̽��� ��ü�� ����� ����.
		// ��, FruitInterface fi = new FruitInterface();
		// ������ �߻��Ѵ�.
		FruitInterface apple = new AppleImp1();
		FruitInterface banana ;
		//FruitInterface Ÿ���� ���������� ����. 
		banana = new BananaImp1();
		// Ŭ���� BananaImp1 �� ��ü�� �����Ͽ�
		// banana �� �Ҵ�. (����,)
		
		FruitInterface orange = new OrangeImp1();
		
		apple.display("���ִ� ");
		banana.display("������ ");
		orange.display("��� ");
		
		//orange.getCount() ;
		//���� ���� ���� : �������̽����� ����� �޼ҵ常 ȣ���� �����ϴ�.

	}

}
