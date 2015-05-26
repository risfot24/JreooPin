package oop09.nestedClass;

/*
 ����Ŭ������ ù��° ����
 

* */

/* �׷��� static �޼ҵ�ȿ� �ִ� int �� ���������� �ƴϴ�..
       �׸��� Ŭ������ �޼ҵ�ȭ �ϰ� �ִ°��� �ǹ��ϸ� 
      ��ü������ 10�� �Ұ� 1�� �ϰ� �ȴ� ,  Ŭ���� ��ü�� ������ǹ̷μ� ������ �ְ� �����μ��� �ǹ̷� ������ �ִ�..
  
  
 **/
import oop09.nestedClass.InnerClassInstance.Inner;

public class InnerClassMain {
	 public static void main(String[] args) {
	 
		 InnerClassMain m = new InnerClassMain();  //�ν��Ͻ��� ���°� �ƴ϶� ������ �޼ҵ� //��ü�����Ѵٰ��ؼ� �ٷ� �ν��Ͻ� ������ �޼ҵ�� ���°��� �ƴϴ�.
		 m.getInnerClassInstance();
		 //m.getInnerClassInstance();
			
		              //Inner inn2 = new InnerClassInstance().new Inner();
		 
		  //InnerClassInstance.Inner inn = new InnerClassInstance().new Inner();
	      //inn.printData();	 //alt + shift + m
		 
		 
		 
			   //inn.p //No Default Proposals
			   //Type mismatch: cannot convert from InnerClassInstance.Inner to InnerClassInstance
			   //system.out.println(); //���õ�,.....
			
	       //InnerClassLocal outer = new InnerClassLocal();
		   //outer.innerTest(1000);  //��� �ΰ��� ���´�!
			
		
		m.getInnerClassLocal();  //���������� �ּҰ����� ������ �һ����� ������Եȴ�..
 	    
		     //���� Ŭ������ Ŭ���� �� ��ġ ���� �Ϻ� ���� ���� �ν��Ͻ��� ������ �ִ�..
		     //�׷��� ���� �� Ŭ������ ȣ���ϰ� ���� ���� ���� ���� ȣ�� ���ص��ȴ�..
		     //�ڵ��� ���� ������ ��� �������� �ϴϱ� static class �����۴� ��ö��� �ϴϱ� ���� �ʿ��Ҷ��� ȣ��
	//------------------------���߿�---------------------------------------------------
		// InnerClassStatic.Inner inn = new InnerClassStatic.Inner(); //Ŭ������ �ٷ� ���� Ŭ����.
		 //inn.printData();                                           //Ŭ���� ������ �����ڷ� ����
	     
		 //getInnerClassStatic();                                           
	 m.getInnerClassStatic();
	 
	 //--------------------------------
	 //InnerClassAnnoyServiceImp1 inn = new InnerClassAnnoyServiceImp1();
	 //inn.print();
	 
	 //getInnerClassAnonyServiceImp1();
	 m.getInnerClassAnonyServiceImp1();
	 
	 }
	public void getInnerClassAnonyServiceImp1() {
		InnerClassAnnoyServiceImp1 inn = new InnerClassAnnoyServiceImp1();
		 inn.print();
	}
	public void getInnerClassStatic() {
		InnerClassStatic.Inner inn = new InnerClassStatic.Inner(); 
		 inn.printData();
	}
	//private static
	public void getInnerClassLocal() {
		InnerClassLocal outer = new InnerClassLocal();
			outer.innerTest(1000);  //��� �ΰ��� ���´�!
	}
	//ALT + Shift + m �޼ҵ� ���� ����Ű
	// �����丵
	   //���� ������ ���� ���� �޼ҵ�� ���� ���� ��ü ����

	//��� ����� �������� �� �޼ҵ�ȭ ��Ű�� ���̴�..
	public void getInnerClassInstance() {
		InnerClassInstance.Inner inn = new InnerClassInstance().new Inner(); // �����ڷ� �ٷ� ����  //�ܺ� ������ �� ���ؼ� �ܺλ����ڷ� ����
	     inn.printData();                                                    // ���� ������ ����?
	}
	
	
}


