package oop03.inheritance;

/*
  Method Overriding
  - ��Ӱ��迡�� Parent �� ����� �޼ҵ带 Child���� �ٽ� ������ ���
  - �̷� ��� Parent �� �޼ҵ�� ���õ�
  - ���� �޼ҵ尡 Parent �� Child ���� ��� ���� �Ǿ�����.
  - ������ �ٸ�
  - Ŭ������ �������� ������ �� ����
  - Parent �� Child ���� �޼ҵ��� ����(�޼ҵ��, �Ķ���� ����, �Ķ���� ������ Ÿ��)
          ���ƾ� ��
  - Parent �� �޼ҵ带 ������ֳ� Child �� �ڽ��� ������ �޼ҵ带 �켱 ��� ,
  - Parent �� �޼ҵ� ������ �����ϸ鼭 ��Ȳ�� ���� Child �� ������
  - ����� ����ϰ� ���� ��쿡 ����ϸ� ������ ������ �ٽɿ���.
  - Parent �� �޼ҵ带 ĸ��ȭ�Ѵٰ� �� �� �ִ�.
  - Parent �� ������� ���ִ� ���� �ƴ϶�, 
  - �����ϸ鼭 ���ο� ������� ��ü�Ϸ��� �������� ���
  
 * */


//�̰� ��ġ�� ���� �ѹ� �����Ѵ�!! ���� ��ġ������ ����!!!!

class ParentB{
		
	void show(){
		System.out.println("Parent show() ����");
		
	}
	void run(){
		System.out.println("�θ�� �޸���.");
	}
}
class ChildB extends ParentB{
	   
	void show() {

		System.out.println("Child show() ����");
	    //this.fshow();
	}
	/*
	@Override
	void show1() {
		
		super.show();
	}
	*/
	

}
public class OverridingDemo {

	public static void main(String[] args) {
		ParentB b = new ParentB();
		b.show();
		ChildB c = new ChildB();   //��� ���� ���� �Ҹ� ����..
		c.show();
        //c.fshow();
		c.run();
		
		

	}

}

