package oop03.inheritance;

public class BankAccount {

	protected String accountNum;
	protected String accountPass;
	protected String onwerName;
	protected int balance;
	
	
	
	public void setAccount(String accountNum, String accountPass, String ownerName, int pay)
	{
		this.accountNum = accountNum;
		this.accountPass = accountPass;
		this.onwerName = ownerName;
		this.balance = pay;
		
		System.out.println(this.accountNum + "가 개설되었습니다.");
		
	}
	
	public void deposit(int pay){
		this.balance = this.balance + pay;
		System.out.println(pay+ "만원을 언급했습니다.");
		
	}
	public void defrayment(int pay){
		if(this.balance >= pay){
			this.balance = this.balance - pay;
			System.out.println(pay + "만원을 출금했습니다.");
		}else{
			System.out.println("잔액이 부족합니다.");
		}
		
	}
	
	public void printAccount(){
		System.out.println("계좌번호 : "+this.accountNum);
		
	}
	
	
	
}
