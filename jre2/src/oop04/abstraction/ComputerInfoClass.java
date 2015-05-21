package oop04.abstraction;

public class ComputerInfoClass extends ProductInfoClass {
    private String cpu;
    private String ram;
    private String hdd;
	
	/*
	  * ProudctInfoClass 에 있는
	  * 멤변이 private 이므로 접근이 불가능합니다.
	  * 예전 추상클래스는 protected ㅇ서
	  * 접근 가능했는데 이제는 private 으로 막혀있져.
	  * 그래서 멤변에 대한 접근자체도 부모에 있는
	  * displayInfo() 를 호출해서 처리합니다.
	  */
    
    //구현 해야함
	

	public void setInfo(String productCompany, String prouctName, String productSerialID,
			String cpu, String ram, String hdd) {
		super.setInfo(productCompany, prouctName, productSerialID);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
		
		
	} 
	
    /*
	  * 파라미터로 넘어온 값들도 바로  super를
	  * 통해 부모 메소드의 파라미터로 던져서
	  * 바고 set합니다.
	  * 즉.. 멤변의 공유가 부모자식 관계에서
	  * 성립하므로, 부모의 멤변에 대한 접근
	  * 역시 가능해 졌습니다.
	  */
   
    	//구현
	@Override
	public void display() {
		
		super.display();
	 System.out.println("cpu 정보 : "+this.cpu);
	 System.out.println("메인메모리 정보 :"+this.ram);
	 System.out.println("하드디스크 정보 : "+this.hdd);
	}

  
    		            

}
