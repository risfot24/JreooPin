package oop09.nestedClass;
/*
 내부클래스 의 두번째 형태
  - Local 내부 클래스에서는 외부 클래스의 멤버를 접근하는데 있어서
  - 제한이 따른다. 우선 외부 클래스의 멤버변수는 접근할 수 있다.
  - 하지만 메서도 내부의 지역변수는 접근할 수 없다.
                    
       먼지를 모르지만 지역변수안에 중요한 정보를 가지고 있을경우 숨겨야 된다.       

* */
              
public class InnerClassLocal {
	int a = 100;
	public void innerTest(int k){
		int b = 200;
		final int c = k;
		class Inner{
			public void getData(){
				System.out.println("멤버변수 a: "+a);
				System.out.println("상수 c : "+c);
				//System.out.println("지역변수 b : "+b);
				//Cannot refer to the non-final local variable b defined in an enclosing scope
			}
		}
		Inner inn = new Inner();
		inn.getData();
		
	}

}
