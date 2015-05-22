package oop05.polymorphism;

import java.util.Scanner;

import oop02.encapsule.GameRpsService;

public class RpsMain {

	public static void main(String[] args) {
		System.out.println("가위,바위,보, 게임을 시작합니다.");
		System.out.println("1.가위,2.바위,3.보  를입력하세요.");  //스캐너가 있어야 겟네?
		Scanner scan = new Scanner(System.in); 
		int playerValue = scan.nextInt();
		
		//전투적으로 하지말고 자연스럽게 하라..
		
		//1GameRpsService service = new GameRpsService();
		
		//인터페이스 변수 = new 클래스();
		RpsService01 serviceimp = new RpsServiceImp1(); 
		
		
	    // serviceimp.showRpsValue(playerValue);
		System.out.println("당신은"+ serviceimp.showRpsValue(playerValue) +"를 냈습니다.");
		
		//int comValue = service.displayComValue();
		
		
		System.out.println("컴퓨터는"+serviceimp.displayComVal() +"를 냈습니다.");
		
		String winner = serviceimp.showWinner(playerValue, 1);
		System.out.println(winner+"가 이겼습니다.");

	}

}
