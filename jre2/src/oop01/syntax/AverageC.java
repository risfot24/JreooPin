package oop01.syntax;

import java.io.ObjectInputStream.GetField;

public class AverageC {
	  
	 public int Tot(int kor,int eng){
	  int Tot ;//= kor + eng ;
	  return Tot = kor + eng ;
		 
	 }
	public void Avg(double Avg ) {
		AverageC C = new AverageC();
		
		//C.Tot(Hulk.getKor(),Hulk.getEng());
			
		}
	 
	 
	 
	

	public static void main(String[] args) {
		
		AverageC C = new AverageC(); //내부적으로 참조 변수를 만든다음에..
		
		AverageVO Hulk = new AverageVO();
		AverageVO Iron = new AverageVO();
		AverageVO Thor = new AverageVO();
		
		// Hulk. getter, setter 또는 public 된 메소드가 없으면 나오지 않는다..
		Hulk.setName("헐크");
		Hulk.setKor(100);
		Hulk.setEng(85);
		
		
		
	int Tot =C.Tot(Hulk.getKor(),Hulk.getEng());
		C.Avg(Tot);
		
	

	}





	

}
