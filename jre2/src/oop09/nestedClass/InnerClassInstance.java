package oop09.nestedClass;
/*
 ����Ŭ����(Inner class) ù��° ����.
   - �ν��Ͻ� ���� Ŭ����
   - ����޼ҵ带 Ŭ���� ���ο� ������. 
* */
public class InnerClassInstance {
     int a = 10;                  //�ν��Ͻ� ���� Ŭ����
     private int b = 100;
     static int c = 200;
     
     public class Inner{            //���� �����̱� �����Դϴ�..
    	public void printData(){
    		 System.out.println("������� a :"+a);
    		 System.out.println("�����̺����� b :" +b);
    		 System.out.println("����ƽ���� b :" +c);
    	}
     }
	
}








/*  ���⿡�� 
  �⺯�� 3���̳� , �޼ҵ尡 1000���̵� ���� �� �Ȱ���..
  �ֳ��ϸ� �ּҰ��� �����ϱ� �����Դϴ�.. 
 
 * */
