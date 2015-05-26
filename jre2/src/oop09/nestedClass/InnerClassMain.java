package oop09.nestedClass;

/*
 내부클래스의 첫번째 형태
 

* */

/* 그러면 static 메소드안에 있는 int 는 지역변수가 아니다..
       그리고 클래스를 메소드화 하고 있는것을 의미하며 
      객체생성을 10번 할거 1번 하게 된다 ,  클래스 자체가 기능적의미로서 갈수도 있고 변수로서의 의미로 갈수가 있다..
  
  
 **/
import oop09.nestedClass.InnerClassInstance.Inner;

public class InnerClassMain {
	 public static void main(String[] args) {
	 
		 InnerClassMain m = new InnerClassMain();  //인스턴스로 가는게 아니라 생성자 메소드 //객체생성한다고해서 바로 인스턴스 영역에 메소드로 가는것은 아니다.
		 m.getInnerClassInstance();
		 //m.getInnerClassInstance();
			
		              //Inner inn2 = new InnerClassInstance().new Inner();
		 
		  //InnerClassInstance.Inner inn = new InnerClassInstance().new Inner();
	      //inn.printData();	 //alt + shift + m
		 
		 
		 
			   //inn.p //No Default Proposals
			   //Type mismatch: cannot convert from InnerClassInstance.Inner to InnerClassInstance
			   //system.out.println(); //관련된,.....
			
	       //InnerClassLocal outer = new InnerClassLocal();
		   //outer.innerTest(1000);  //결과 두개만 나온다!
			
		
		m.getInnerClassLocal();  //참조변수는 주소값으로 참조만 할뿐이지 사라지게된다..
 	    
		     //내부 클래스는 클래스 의 마치 몸의 일부 같이 같은 인스턴스를 가지고 있다..
		     //그래서 내가 쓸 클래스만 호출하고 궂이 쓰지 않은 것은 호출 안해도된다..
		     //자동차 에서 엔진은 계속 움직여야 하니까 static class 와이퍼는 비올때만 하니까 따로 필요할때만 호출
	//------------------------나중에---------------------------------------------------
		// InnerClassStatic.Inner inn = new InnerClassStatic.Inner(); //클래스로 바로 접근 클래스.
		 //inn.printData();                                           //클래스 로접근 생성자로 접근
	     
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
			outer.innerTest(1000);  //결과 두개만 나온다!
	}
	//ALT + Shift + m 메소드 독립 단축키
	// 리펙토링
	   //내가 원하지 않은 것을 메소드로 따로 빼서 객체 생성

	//모든 기능을 가진것을 다 메소드화 시키는 것이다..
	public void getInnerClassInstance() {
		InnerClassInstance.Inner inn = new InnerClassInstance().new Inner(); // 생성자로 바로 접근  //외부 생성자 를 통해서 외부생성자로 접근
	     inn.printData();                                                    // 안의 생성자 접근?
	}
	
	
}


