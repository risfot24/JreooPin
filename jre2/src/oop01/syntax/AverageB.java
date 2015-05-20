package oop01.syntax;

public class AverageB {
	String name;
	int kor;
	int eng;
	/*메소드를 여기에 정의하세요 .!선언 말고요!*/
	/*메소드의 객체화를 해주세요. */
    void Input(String name, int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
    	
	}
	
    int Tot(){
    int Tot = 0;
    Tot = this.kor + this.eng;
	return Tot;
    }
    
    double Avg(){
    double Avg = 0;
    Avg = Tot()/2 ;
    return Avg;	
    }
    
	
	public static void main(String[] args) {
		AverageB Hulk = new AverageB();
		AverageB iron = new AverageB();
		AverageB Thor = new AverageB();
		
		
		//Hulk.i 안된다..
		Hulk.Input("헐크",100,70);
	
		
		
		
		
		System.out.println("===" + Hulk.name + "의 성적표 ===");
		System.out.println("국어 : " + Hulk.kor);
		System.out.println("영어 : " + Hulk.eng);
		System.out.println("총점 : " + Hulk.Tot());
		System.out.println("평균 : " + Hulk.Avg());
		System.out.println("============");

		
		/*
		iron.name = "아이언맨";
		iron.kor = 95;
		iron.eng = 100;
		Tot = iron.kor + iron.eng;
		Avg = Tot / 2;   //(double) (tot/2) ; //하드 코딩 
		                 //double avg = tot/2d;
		System.out.println("===" + iron.name + "의 성적표 ===");
		System.out.println("국어 : " + iron.kor);
		System.out.println("영어 : " + iron.eng);
		System.out.println("총점 : " + Tot);
		System.out.println("평균 : " + Avg);
		System.out.println("============");

		Thor.name = "토르";
		Thor.kor = 100;
		Thor.eng = 70;
		Tot = Thor.kor + Thor.eng;
		Avg = Tot / 2;
		System.out.println("===" + Thor.name + "의 성적표 ===");
		System.out.println("국어 : " + Thor.kor);
		System.out.println("영어 : " + Thor.eng);
		System.out.println("총점 : " + Tot);
		System.out.println("평균 : " + Avg);
		System.out.println("============");

		*/
	}
	


}
