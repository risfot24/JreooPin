package oop05.polymorphism;



public class RpsServiceImp1 implements RpsService01 {
	public int ComValuem(){
		return (int)(Math.random() * 3)+1 ;
		
	}
	
	
	@Override
	public String displayComVal() {
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

	@Override
	public String showView() {
		
		return null;
	}
	

	@Override
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
		
	}
			return msi;
	}

	@Override
	public String showRpsValue(int playerVal) {

		RpsVO01 VO = new RpsVO01();
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
	
	
	

}
