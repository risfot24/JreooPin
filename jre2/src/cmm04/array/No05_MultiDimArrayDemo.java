package cmm04.array;

/*
 * Java의 정석에 5-10
 * 
 
 */

public class No05_MultiDimArrayDemo {
   public static void main(String[] args) {
	int [][] score = {
			{90,90,90},
			{20,20,20},
			{30,30,30},
			{40,40,40},
			{50,50,50},		
          };
     int korTotal = 0;
     int engTotal = 0;
     int mathTotal = 0;
     int avgTotal = 0;
     int sumTotal = 0 ;
     
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("===================");
        
		
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];

			System.out.print(" " + (i + 1) + " ");

			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.print(score[i][j] + "  ");
			}
            sumTotal+=sum ;
			System.out.println(sum + "  " + sum / (float) score[i].length);
		}

     System.out.println("===================");
     //
    
     System.out.print("총점 : ");
     System.out.print(korTotal+" "+engTotal+" "+mathTotal+" "+sumTotal);
   
   } 

}
