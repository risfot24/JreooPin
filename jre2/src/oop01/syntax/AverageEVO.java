package oop01.syntax;

public class AverageEVO {
	private String name;
	private int kor;
	private int eng;
	
	public AverageEVO(String name, int kor, int eng) {
		this.name = name;  // 참조변수.멤벼변수 = 매개변수
		this.kor = kor;
		this.eng = eng;
		this.Tot();
		this.Avg();
		
		
	}
	public int Tot(){
	  int Tot = this.kor + this.eng ;
	  return Tot;
		
	}
	public double Avg(){
	 double	Avg = this.Tot() / 2;
		
	 return Avg; 
	}
	@Override
	public String toString() {
		return " [name=" + name + ", kor=" + kor + ", eng=" + eng+"Tot ="+Tot()+Avg()
				+ "]";
	}
	
	
	
	

}
