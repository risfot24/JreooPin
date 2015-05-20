package oop02.encapsule;

import java.util.Scanner;

public class KaupVO {

	private double height;
	private double weight;
	private double idx; 
	//체중도 개인정보이다.. 은닉화
	private String msg;
	Scanner scan = new Scanner(System.in);

	public void exe() {
		 setHeight(height); //굳이 set 에 매개변수 하여서 처리 안해도된다.. 여기에서는 
		 setWeight(weight);
		 setIdx(height,weight);
		 // toString();
		//Input();
		 scan.close();
		 setMsg(msg);//setMsg(getMsg) 입력을 안했는데 불르면 null 값이 입력이 된다...
		Display();

	}

	public void setMsg(String msg) { //setMsg 
		//String msg = "";
		
		if (idx > 30) {this.msg = "비만";} 
		else if (idx > 24) {this.msg = "과체중";} 
		else if (idx > 20) {this.msg = "저체중";} 
		else if (idx > 15) {this.msg = "마름";} 
		else if (idx > 13) {this.msg = "영양실조";} 
		else {this.msg = "소모증 ";}
		
		//this.msg = msg;
		//return msg;
	}

	@Override
	public String toString() {
		return "KaupService [height=" + height + ", weight=" + weight
				+ ", idx=" + idx + " " + getMsg() + "]";
	}

	private void Display() {
		System.out.println(toString());
	}
/*
	private void Input() {
		System.out.print("키를 입력하세요: ");
		this.height = scan.nextDouble();
		System.out.print("몸무게를 입력하세요: ");
		this.weight = scan.nextDouble();
		

	}
	*/
		
		public double getHeight() {
			return height;
		}
         
		public void setHeight(double height) {
			System.out.print("키를 입력하세요: ");
			height = scan.nextDouble();
			this.height = height;
		}
		
		public double getWeight() {
			return weight;
		}
      
		public void setWeight(double weight) {
			System.out.print("몸무게를 입력하세요 :");
			weight = scan.nextDouble();
			this.weight = weight;
		}
		
		public double getIdx() {
			return idx;
		}
        
		public void setIdx(double height, double weight) {
			this.idx = (int) weight / ((height * height)) * 10000;
			//this.idx = idx;
		}
		public String getMsg() {
			return msg;
		}
		
        
		//KaupService ks = new KaupService();
		
	
		
	}


