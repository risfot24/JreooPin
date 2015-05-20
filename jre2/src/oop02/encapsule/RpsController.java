package oop02.encapsule;

import java.util.Scanner;

public class RpsController {

	public static void main(String[] args) {
	  RpsService service = new RpsService();
	  
	  System.out.println("가위바위보 게임을 시작합니다.");
	  System.out.println("1.가위 , 2.바위 , 3.보자기 를 입력하세요.");
	  Scanner scan =new Scanner(System.in);
    
	  int playerVal = scan.nextInt();
	  if(playerVal < 1 || playerVal > 3 )
	  {
	  service.check(playerVal);
	  }else{
	       System.out.println("플레이어는"+ service.showRpsVal(playerVal) +"냈습니다.");
	       int comVal = service.displayComVal(); 
	       service.comtext(comVal);
	       System.out.println("컴퓨터는 "+ service.comtext(comVal) +"냈습니다. ");
	       String winner = service.showWinner(playerVal, comVal);
	       System.out.println(winner + ""+"가 이겼습니다.");
	  }
	}

}
