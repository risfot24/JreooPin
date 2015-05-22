package oop05.polymorphism;



public class KaupServiceImp1 implements KaupInterface{
 //�̷��� ���ϰ� extends �߰� �Ͽ��� �� �Ҽ��� �ִ�..//�׷��� extends�ϰԵǸ� ���м��� ������ �ȵȴ�..
	                                    //�׷��� ��������
	private int idx;
	
	public KaupServiceImp1(double height, double weight) {
		KaupVO1 kapvo = new KaupVO1(height,weight);
		getKaupIndex(height, weight);
		
		
	}
	@Override
	public int getKaupIndex(double height, double weight) {
		//KaupVO1 kapvo = new KaupVO1(height , weight); //�̷��Ե� �غ��� //���߿�
		//height = kapvo.getHeight();
		//weight = kapvo.getWeight();
		int result = (int)(( weight / (height * height) ) * 10000); 
		this.idx =result ;
		
		//getResultMsg(); //�̷��� �ص� �ǳ�??
		//return result; //this.idx = (int)(( weight / (height * height) ) * 10000);
		return this.idx;
		
		//ó����
		//pl���� �̰� void �ƴϿ��� �ϴٰ� ������ �ִ�.. �׳� �ض�...//������ ���α׷� ��ü�����ϴµ� �̻��� ���� �ʳ�?
	}
	
	
	

	@Override
	public String getResultMsg() {
      String msg= "";
		
		if (this.idx > 30) {msg = "��";} 
		else if (this.idx > 24) {msg = "��ü��";} 
		else if (this.idx > 20) {msg = "��ü��";} 
		else if (this.idx > 15) {msg = "����";} 
		else if (this.idx > 13) {msg = "�������";} 
		else {msg = "�Ҹ��� ";}
	
		return "ī���� ������ "+this.idx+" , "+msg;
	}

	
	

}
