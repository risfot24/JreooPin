package oop05.polymorphism;

import java.util.Scanner;

public class NumberMain {

	public static void main(String[] args) {
		NumberMatchService ns = new NumberService();
		int playVal;
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("총 3회만 입력가능합니다. ");
		
		for(int i = 0 ; i < 3 ; i++){
		   System.out.print("유저 입력의 수 : ");
		   playVal = scan.nextInt();
		   int comVal = ns.makeComVal();
		     if( ns.match(playVal, comVal) ){
		    // System.out.println("컴퓨터의 숫자 : "+ns.makeComVal());
		     System.out.println("결과 : "+ns.display());
		     }else{
		    	System.out.println("결과 : 플레이어 패배");
		     }
			
		}
       System.out.println("끝났습니다.");
		
	}

}
