package oop04.abstraction;

/*
Date :
Author :
Desc : �߻�Ŭ���� ����

* */

/*
 String ��ü�� ������ ���� ����
     - String ��ü�� ��ü������ ���������� Call By Reference �� ����ϳ�
     - ���ڿ� �Ҵ� ���� ���۽� ������ Call By Value ������� �۵��Ѵ�.
* */
public class AbsDemo {
   
	public static void main(String[] args) {
		Sum01 sum01 = new Sum01();
		System.out.println(sum01.sum(10, 20));
		System.out.println( sum01.toString() );
		
		Sum02 sum02 = new Sum02();
		System.out.println(sum02.sum(20, 30));
		System.out.println(sum02.toString());
		
		AbsSum abs = new Sum01();
		System.out.println(abs.toString());
		
		
		
		
	}
	
}

abstract class AbsSum{
	// �ʼ������� �������� �ִ� �޼ҵ�
	public abstract String toString();
	public String sum(int i, int k){
		  int sum = i + k ;
		  return ""+sum;
		  //int ������ String ��ȯ �� �ִ� ���
		 //ĳ������  �Ǵ� ����..
	
	}
	
}

class Sum01 extends AbsSum{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
	
		return "class Sum01 extends AbsSum";
	}
	
}

class Sum02 extends AbsSum{

	@Override
	public String toString() {
		
		return "class Sum02 extends AbsSum";
	}
	
	
}