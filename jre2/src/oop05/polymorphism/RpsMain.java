package oop05.polymorphism;

import java.util.Scanner;

import oop02.encapsule.GameRpsService;

public class RpsMain {

	public static void main(String[] args) {
		System.out.println("����,����,��, ������ �����մϴ�.");
		System.out.println("1.����,2.����,3.��  ���Է��ϼ���.");  //��ĳ�ʰ� �־�� �ٳ�?
		Scanner scan = new Scanner(System.in); 
		int playerValue = scan.nextInt();
		
		//���������� �������� �ڿ������� �϶�..
		
		//1GameRpsService service = new GameRpsService();
		
		//�������̽� ���� = new Ŭ����();
		RpsService01 serviceimp = new RpsServiceImp1(); 
		
		
	    // serviceimp.showRpsValue(playerValue);
		System.out.println("�����"+ serviceimp.showRpsValue(playerValue) +"�� �½��ϴ�.");
		
		//int comValue = service.displayComValue();
		
		
		System.out.println("��ǻ�ʹ�"+serviceimp.displayComVal() +"�� �½��ϴ�.");
		
		String winner = serviceimp.showWinner(playerValue, 1);
		System.out.println(winner+"�� �̰���ϴ�.");

	}

}
