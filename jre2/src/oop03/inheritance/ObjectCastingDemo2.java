package oop03.inheritance;

public class ObjectCastingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// �Ϲ����� ��ü ����
			//Aclass a = new Aclass();
			//Bclass b = new Bclass();
			 
			// �θ� Ÿ�� = new �ڽ� Ÿ��
			
			Aclass1 a2 = new Bclass1(); 
			// �������̵��� �ڽ� Ŭ���� �޼ҵ� �켱 ���
			a2.iover(1);
			// �������̵� ���� ������ �θ�Ŭ���� �켱 ȣ��
			a2.inoOver(1);
			
			
			// �θ�Ŭ���� Ÿ���� �ڽ�Ŭ������ ���� ����ȯ
			
			Bclass1 b2 = (Bclass1) a2;
			//b2.over(1);
	        //b2.noOver("AAAA"); 	
	        
	       // Bclass bc = new Aclass();
	        
			
			
		}

	}

	class Aclass1{
		void iover(int i){ 
			System.out.println("Aclass-over() : "+ (i*10));
			
		}
		void inoOver(int i){
			System.out.println("Aclass-noOver() : "+i);
		}
		
		   
		
		 
	}

	class Bclass1 extends Aclass1 {
		
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
