package oop03.inheritance;

public class MinusAccount extends BankAccount {
	private int minusLimit;
	
	public void setAccount(String accountNum, String accountPass, String ownerName, int pay, int minusLimit ){
		//����� �Ȱ����� �ٸ��� ���� ���̵�??
		this.accountNum = accountNum;
		this.accountPass = accountPass;
		this.onwerName = ownerName;
		this.balance = pay;
		this.minusLimit = minusLimit;
		System.out.println(this.accountNum + "�� ���� �Ǿ����ϴ�.");
		
	}
	public void defrayment(int pay){
		//�ܾ� + ���̳ʽ� �ѵ��� ���� ����� ����������
		if(this.balance + this.minusLimit >= pay){
			this.balance = this.balance - pay;
			System.out.println(pay + "������ ����߽��ϴ�.");
		}else{
			System.out.println("�ܾ��� �����մϴ�.");
		}
		
	}
	@Override
	public void printAccount() {
		//super.printAccount();
		
	
	
	}
	
	
	
	
	
}
