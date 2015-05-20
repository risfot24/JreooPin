package cmm04.array;

import java.util.Scanner;

public class No03_ForLoopArrayDemo {

	public static void main(String[] args) {
		
		No03_ForLoopArrayVO fvo = new No03_ForLoopArrayVO();
		fvo.input();
		//메인 메소드 에 스캐너 장착!!
		/*
		 * 입력 받은 다섯개의 숫자의 합을 구하세요.
		 * 
		 */
		No03_ForLoopArrayVO02 fvo2 = new No03_ForLoopArrayVO02();
		Scanner scan = new Scanner(System.in);
		
		//int arr[] = new int[5];
		fvo2.run(); 
		
		

	}

}
