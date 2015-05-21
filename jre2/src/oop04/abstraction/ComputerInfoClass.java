package oop04.abstraction;

public class ComputerInfoClass extends ProductInfoClass {
    private String cpu;
    private String ram;
    private String hdd;
	
	/*
	  * ProudctInfoClass �� �ִ�
	  * �⺯�� private �̹Ƿ� ������ �Ұ����մϴ�.
	  * ���� �߻�Ŭ������ protected ����
	  * ���� �����ߴµ� ������ private ���� ��������.
	  * �׷��� �⺯�� ���� ������ü�� �θ� �ִ�
	  * displayInfo() �� ȣ���ؼ� ó���մϴ�.
	  */
    
    //���� �ؾ���
	

	public void setInfo(String productCompany, String prouctName, String productSerialID,
			String cpu, String ram, String hdd) {
		super.setInfo(productCompany, prouctName, productSerialID);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
		
		
	} 
	
    /*
	  * �Ķ���ͷ� �Ѿ�� ���鵵 �ٷ�  super��
	  * ���� �θ� �޼ҵ��� �Ķ���ͷ� ������
	  * �ٰ� set�մϴ�.
	  * ��.. �⺯�� ������ �θ��ڽ� ���迡��
	  * �����ϹǷ�, �θ��� �⺯�� ���� ����
	  * ���� ������ �����ϴ�.
	  */
   
    	//����
	@Override
	public void display() {
		
		super.display();
	 System.out.println("cpu ���� : "+this.cpu);
	 System.out.println("���θ޸� ���� :"+this.ram);
	 System.out.println("�ϵ��ũ ���� : "+this.hdd);
	}

  
    		            

}
