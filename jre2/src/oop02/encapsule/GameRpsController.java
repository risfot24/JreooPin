package oop02.encapsule;

import java.util.Scanner;

public class GameRpsController {

	public static void main(String[] args) {
		
		System.out.println("가위,바위,보, 게임을 시작합니다.");
		System.out.println("1.가위,2.바위,3.보  를입력하세요.");  //스캐너가 있어야 겟네?
		Scanner scan = new Scanner(System.in);
		int playerValue = scan.nextInt();
		
		GameRpsService service = new GameRpsService();
		//service.showRpsValue(playerValue);
		System.out.println("당신은"+service.showRpsValue(playerValue) +"를 냈습니다.");
		
		//int comValue = service.displayComValue();
		
		System.out.println("컴퓨터는"+service.displayComValue() +"를 냈습니다.");
		
		String winner = service.showWinner();
		System.out.println(winner+"가 이겼습니다.");
		
	}

}
