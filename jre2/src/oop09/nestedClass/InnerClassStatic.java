package oop09.nestedClass;

public class InnerClassStatic {
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	public static class Inner{
		static int d = 1000;
		public void printData(){
			//System.out.println("�⺯ a : "+a); //Cannot make a static reference to the non-static field a
		    //System.out.println("�����̺� b : "+b); //static ������ static�� ȣ���� �����ϴ�.
			/*
			 a �� b���� ������ ���°���...
			 static ����Ŭ������ ��� ���̻��� ����Ŭ������ �ƴϴ�.
			 ���� �ܺ�Ŭ������ ������ �ʰ� ������ �� �ִ�.
			 ���� top level class ��� �Ͽ� �ֻ��� Ŭ������ �Ѵ�.
			 ��¿�� ���� ����Ŭ������ static ���� �����ؾ� �ϴ� ��찡 �ִ�.
			 �װ� �ٷ� ���� Ŭ������ ����� �� �ϳ���
			 static ����� ���� ����̴�.
			
			//�ڵ����� usim Ĩ ������..
			* */
			System.out.println("����ƽ c :"+c);
			System.out.println("����ƽ d : "+d);
		
		}
	}

}
