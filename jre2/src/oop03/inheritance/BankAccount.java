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
		
		System.out.println(this.accountNum + "�� �����Ǿ����ϴ�.");
		
	}
	
	public void deposit(int pay){
		this.balance = this.balance + pay;
		System.out.println(pay+ "������ ����߽��ϴ�.");
		
	}
	public void defrayment(int pay){
		if(this.balance >= pay){
			this.balance = this.balance - pay;
			System.out.println(pay + "������ ����߽��ϴ�.");
		}else{
			System.out.println("�ܾ��� �����մϴ�.");
		}
		
	}
	
	public void printAccount(){
		System.out.println("���¹�ȣ : "+this.accountNum);
		
	}
	
	
	
}
