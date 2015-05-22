package oop05.polymorphism;

public class NumberService implements NumberMatchService {
    
	//private boolean bolmatch;
	
	@Override
	public int makeComVal() {
		int comVal = (int)(Math.random() * 2); 
		return comVal;
	}

	@Override
	public boolean match(int playVal, int comVal) {
		NumberVO VO = new NumberVO();
		VO.setPlayerVal(playVal); 
		VO.setComVal(comVal);
		 comVal =  makeComVal();
		if(playVal == comVal){
			return true;
		}else{
			return false;	
		}
		
	}

	@Override
	public String display() {
	   		
		return"플레이어 승리 ";
	}
	

}
