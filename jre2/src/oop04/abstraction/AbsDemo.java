package oop04.abstraction;

/*
Date :
Author :
Desc : 추상클래스 예시

* */

/*
 String 객체의 데이터 전달 유형
     - String 객체는 객체임으로 내부적으로 Call By Reference 를 사용하나
     - 문자열 할당 들의 조작시 무조건 Call By Value 기능으로 작동한다.
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
	// 필수적으로 강제성이 있는 메소드
	public abstract String toString();
	public String sum(int i, int k){
		  int sum = i + k ;
		  return ""+sum;
		  //int 리턴을 String 변환 값 주는 방법
		 //캐스팅이  되는 구나..
	
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