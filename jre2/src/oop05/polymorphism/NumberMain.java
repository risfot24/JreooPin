package oop05.polymorphism;

import java.util.Scanner;

public class NumberMain {

	public static void main(String[] args) {
		NumberMatchService ns = new NumberService();
		int playVal;
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("�� 3ȸ�� �Է°����մϴ�. ");
		
		for(int i = 0 ; i < 3 ; i++){
		   System.out.print("���� �Է��� �� : ");
		   playVal = scan.nextInt();
		   int comVal = ns.makeComVal();
		     if( ns.match(playVal, comVal) ){
		    // System.out.println("��ǻ���� ���� : "+ns.makeComVal());
		     System.out.println("��� : "+ns.display());
		     }else{
		    	System.out.println("��� : �÷��̾� �й�");
		     }
			
		}
       System.out.println("�������ϴ�.");
		
	}

}
