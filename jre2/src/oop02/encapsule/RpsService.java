package oop02.encapsule;

public class RpsService {
	
	//컴퓨터가 랜덤으로 발생시킨 수 1 ~3 까지
	public int displayComVal() {
		return (int) ((Math.random()*3)+1);
		 
	}
	
	
	
	//showWinner
	//승자를 보여주는 로직
	public String showWinner(int playerVal, int comVal) {
	int result = playerVal - comVal ;
	//(Math.abs(playerVal - comVal))  //여기서 쓰면 안된다..
	   String msi = "";
		switch (result) {
		case -2:
		case 1:
			msi = "유저";
			break;

		case 0:
			msi = "유저 와 컴 무";
			break;
   
			
		case -1:
		case 2:
			msi = "컴퓨터";
			break;

          /*default : msg = "플레이어가 졌습니다. " ; break;
		   
			
			*/
			
		}

		return msi;
	}
	
	
	//숫자에 할당된 가위,바위,바위보를 문자로 전환해서 보여주는 역활
	public String showRpsVal(int playerVal){
		
		RpsVO VO = new RpsVO();
		String result = "";
		switch (playerVal) {
		case 1:
			result = "가위";
			VO.setScissors(playerVal);
			VO.setRpsValue(result);
			break;

		case 2:
			result = "바위";
			VO.setRock(playerVal);
			VO.setRpsValue(result);
			break;

		case 3:
			result = "보";
			VO.setPaper(playerVal);
			VO.setRpsValue(result);
			break;
		default:
			result = "다시 적어보세요 ";
			break;
		}

		return result;

	}
	public void check(int playerVal){
		int a =1 , b = 3 ;
		RpsUtil util = new RpsUtil();
		  System.out.println(util.showRange(a, b)); 
		  System.out.println(util.showWrongType());
		
		
	}



	public String comtext(int comVal) {
		
		String result = "";
		switch (comVal) {
		case 1:
			result = "가위";
			
			break;

		case 2:
			result = "바위";
			
			break;

		case 3:
			result = "보";
			
			break;
		default:
			result = "다시 적어보세요 ";
			break;
		}

		return result;
		
		
	}



	



	

	

}
