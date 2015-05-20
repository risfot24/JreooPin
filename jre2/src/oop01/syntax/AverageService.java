package oop01.syntax;

public class AverageService {
     // VO 에 있던 avg(), tot() 메소드 를
	 // 서비스에서 처리하도록 해주세요.
	 private AverageDVO dvo = new AverageDVO();
	
	public void Input(String name, int kor, int eng) {
		
		dvo.setName(name); 
		dvo.setKor(kor);
		dvo.setEng(eng);
		
		
	}
	
	public int getTotal(){
		return dvo.getKor() + dvo.getEng();
	}
	public double getAverage(){
		return getTotal() / 2d;
	}
	
	
}
