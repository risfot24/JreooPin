package oop01.syntax;

public class AverageA {
	String name;
	int kor;
	int eng;
	

	public static void main(String[] args) {
		// tot, avg 지역변수를 선언하시고
        // 아래와 같이 출력 되도록 해주세요. // 점수는 하드코딩으로 넣어도 된다.
		/*
		   System.out.println("===헐크의 성적표 ===");
		   System.out.println("국어 : 100점");
		   System.out.println("영어 : 70점");
		   System.out.println("총점 : 170점");
		   System.out.println("평균 : 85점");
		   System.out.println("============");
		*/
		  // 아이언
		  // 토르
		System.out.println("===============================");
		
		AverageA Hulk = new AverageA();
		AverageA iron = new AverageA();
		AverageA Thor = new AverageA();
		
		int Tot = 0; 
		double Avg = 0 ;
		
		Hulk.name = "헐크";
		Hulk.kor = 100;
		Hulk.eng = 70;
		Tot = Hulk.kor + Hulk.eng;
		Avg = Tot / 2;
		System.out.println("===" + Hulk.name + "의 성적표 ===");
		System.out.println("국어 : " + Hulk.kor);
		System.out.println("영어 : " + Hulk.eng);
		System.out.println("총점 : " + Tot);
		System.out.println("평균 : " + Avg);
		System.out.println("============");

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

	}

}
