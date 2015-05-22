package oop05.polymorphism;

import java.util.Scanner;

public class KaupMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("키를 입력하세요: ");
        double height = scan.nextDouble();
       
        System.out.print("몸무게를 입력하세요: ");
	    double weight = scan.nextDouble();
	    //KaupVO1 kapvo = new KaupVO1(height,weight);
	     KaupServiceImp1 kase = new KaupServiceImp1(height, weight);
	     //그러면 생성자에 입력하는 역활 하면 안되게끔 해야하나?
	     //pl이 왜 인덱스가 안보여? 하면은 이렇게 하라..
	     //kase.getKaupIndex(height,weight);
	     
	     
	     
	     //System.out.println(ka);
	   //kase.getKaupIndex(height, weight);
	    System.out.println(kase.getResultMsg());
	    
	     
	    
	}

}
