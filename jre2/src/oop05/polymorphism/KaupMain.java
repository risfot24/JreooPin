package oop05.polymorphism;

import java.util.Scanner;

public class KaupMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��ϼ���: ");
        double height = scan.nextDouble();
       
        System.out.print("�����Ը� �Է��ϼ���: ");
	    double weight = scan.nextDouble();
	    //KaupVO1 kapvo = new KaupVO1(height,weight);
	     KaupServiceImp1 kase = new KaupServiceImp1(height, weight);
	     //�׷��� �����ڿ� �Է��ϴ� ��Ȱ �ϸ� �ȵǰԲ� �ؾ��ϳ�?
	     //pl�� �� �ε����� �Ⱥ���? �ϸ��� �̷��� �϶�..
	     //kase.getKaupIndex(height,weight);
	     
	     
	     
	     //System.out.println(ka);
	   //kase.getKaupIndex(height, weight);
	    System.out.println(kase.getResultMsg());
	    
	     
	    
	}

}
