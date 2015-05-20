package oop01.syntax;
/*
 * Date :
 * Author :
 * Desc : static 예제
 */


public class CardVO {
	private String kind; // 카드의 무늬 
    private int number;   //카드 숫자
    static int width = 100;  //카드 의 폭      //위드 와 하이트로 읽어라??
    static int height = 250;  //카드 의 높이
    
	public CardVO() {
		
	}
    
    public CardVO(String name, int number) {
    	this.kind = name;
    	this.number = number;
	
	}
    


	public String kind(){
    	return this.kind;
    }
    public int number(){
    	return this.number;
    }

}
