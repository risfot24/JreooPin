package oop04.abstraction;

public class ProductClassController {

	public static void main(String[] args) {
		 ComputerInfoClass ci = new ComputerInfoClass();
		 ci.setInfo("�Ｚ ", "����", "A-1234", "����ھ�", "2GB", "500GB"); 
		 
		 /*
		 TvInfoClass ti = new TvInfoClass();
		 ti.setInfo("LG", "xĵ����","lg-1234","42��ġ","LCD"); 
		 */
		 
		 ProductInterface[] pi = new ProductInterface[1];
		 pi[0] = ci;
		 //pi[1]= ti;
		 
		 for(int i=0 ; i<pi.length ;i++){
			 pi[i].display();
		
		 //���� �迭�� ũ�⸸ŭ ��� �����Ͱ��� �Է����������� ����� null
		 }
         
		
	}

}
