package oop01.syntax;

public class CardMain {

	public static void main(String[] args) {
		//System.out.println("카드 높이 : ");
		//System.out.println("카드 너비 : ");
		
		// 참조변수 선언하시고 == 인스턴스 생성 하셔서 (2), 아래 결과 처럼
		// 출력 되도록 해주세요 
		
		 
		//System.out.println("플레이어는"+ "하트" +"3이고 ");  //heart, spade 
        //System.out.println("컴퓨터가"+" 스페이스"+" 5"+"로 이겼습니다.");
	
	  System.out.println("--------------------------------");
	  
	  System.out.println("카드 높이 : "+CardVO.height );
	  System.out.println("카드 너비 : "+CardVO.width);
	
	  CardVO Player = new CardVO("heart",3);
	  //이미 객체 생성하기전에  static으로 올라가 있다..
	  
	  System.out.println("플레이어는 : "+Player.kind()+","+Player.number() );
	  
	  CardVO com =new CardVO();
	  
	 
	  
	  
	
	
	}

}
