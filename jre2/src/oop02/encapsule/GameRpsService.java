package oop02.encapsule;

//
/*
Date :2015년 5월 15일 
Author : 이석보 
Description : 가위 , 바위 , 보 게임 놀이
 1은 가위고 2는 바위 3은 보
 
  
  
 */

public class GameRpsService {

	
	/*
	 숫자 값에 따른 가위, 바위, 보 결정 로직  
	 
	 */
	public String showRpsValue(int playerValue) {
		//int key = playerValue;
		
		String result = "";
		switch (playerValue ) {
		case 1:
		      
			   result ="가위";
			break;

		case 2:
			  result = "바위";
			break;
		
		case 3:
			result = "보";
			break;
		default : result ="다시 적어보세요 ";
		 break;
		}
		
		return result;
		
		
	}
	/*
	 컴퓨터가 랜덤으로 발생시킨 수 1~3 까지
	 */

	public String displayComValue() {
	    int comValue =  (int)(Math.random() * 3)+1 ;
	    String result= " ";
	    
	    switch (comValue) {
		case 1:
			   result = "가위";
			break;

		case 2:
			result = "바위";
			break;
		
	    
	    case 3:
	    	result = "보";
	        break;
	    default : result = "다시 입력하세요."; break;
	    }
		
		return result ;
	}

	public String showWinner() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
