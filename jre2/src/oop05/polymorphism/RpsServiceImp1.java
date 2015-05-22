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
			   result = "����";
			break;

		case 2:
			result = "����";
			break;
		
	    
	    case 3:
	    	result = "��";
	        break;
	    default : result = "�ٽ� �Է��ϼ���."; break;
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
		//(Math.abs(playerVal - comVal))  //���⼭ ���� �ȵȴ�..
		   String msi = "";
			switch (result) {
			case -2:
			case 1:
				msi = "����";
				break;

			case 0:
				msi = "���� �� �� ��";
				break;
	   
				
			case -1:
			case 2:
				msi = "��ǻ��";
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
			result = "����";
			VO.setScissors(playerVal);
			VO.setRpsValue(result);
			break;

		case 2:
			result = "����";
			VO.setRock(playerVal);
			VO.setRpsValue(result);
			break;

		case 3:
			result = "��";
			VO.setPaper(playerVal);
			VO.setRpsValue(result);
			break;
		default:
			result = "�ٽ� ������� ";
			break;
		}

		return result;

		
		
	}
	
	
	

}
