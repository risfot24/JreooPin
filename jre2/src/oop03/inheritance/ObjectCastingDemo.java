package oop03.inheritance;

public class ObjectCastingDemo {

	public static void main(String[] args) {
		// �Ϲ����� ��ü ����
		//Aclass a = new Aclass();
		//Bclass b = new Bclass();
		 
		// �θ� Ÿ�� = new �ڽ� Ÿ��
		
		Aclass a2 = new Bclass();  
		//* ������ ��! Ư�� �޼ҵ� ����!! 
		//* �׷���           //Ŭ������ �ƴϿ��� �����ڿ��� �޼ҵ��̿���.....
		
		a2.over(1);
		//*�ڽ� Ŭ���� �� �θ� Ŭ������ �޼ҵ尡 ���ٸ� �ڽ�Ŭ������ �޼ҵ带 �ֿ켱���� ����..
		
		// �������̵��� �ڽ� Ŭ���� �޼ҵ� �켱 ���
		a2.over(1);
		// �������̵� ���� ������ �θ�Ŭ���� �켱 ȣ��
		a2.noOver(1);
		
		
		// �θ�Ŭ���� Ÿ���� �ڽ�Ŭ������ ���� ����ȯ
		Bclass b2 = (Bclass) a2;
		b2.over(1);
        b2.noOver("AAAA"); 	
        
       // Bclass bc = new Aclass();
        
		
		
	}

}

class Aclass{
	void over(int i){
		System.out.println("Aclass-over() : "+ (i*10));
		
	}
	void noOver(int i){
		System.out.println("Aclass-noOver() : "+i);
	}
	
	   
	
	 
}

class Bclass extends Aclass{
	/*
	public Bclass() {
		//�����ڴ� Ư���� ������ �޼ҵ� ����!!
	    //�����ڿ��� ���⼭ �ٸ� �޼ҵ带 ȣ������������ ������ ���ݾƿ�!!
		
	
	
	}
	*/

	void over(int i){
		System.out.println("Bclass-over() : "+(i*10000) );
	}
  
    void noOver(String s){
    	System.out.println("Bclass-over() : "+s);
    	
    }
    void onlyB(){
    	System.out.println("onlyB()");
    }
   
 
}