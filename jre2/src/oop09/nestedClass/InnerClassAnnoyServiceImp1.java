package oop09.nestedClass;

public class InnerClassAnnoyServiceImp1 {
    //implements InnerClassAnonyService  //������.
	 String data = "Hello Anonymous !!";
	
     public void print(){
    	/*
    	 new InnerClassAnnoyServiceImp1() {

		 
    		 
    	 };
    	 */
    	 new InnerClassAnonyService() { //�޼ҵ� ���·� ���ּ� �ν��Ͻ������� �ȿö󰣴�..//
			
			@Override
			public void printData() {
				System.out.println("�͸� ����Ŭ���� ��� : "+data);
				
			}
		}.printData();   //.printData(); //����??
     }

}
