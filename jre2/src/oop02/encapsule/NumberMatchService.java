package oop02.encapsule;

import java.util.Scanner;

public class NumberMatchService {
private int result;
NumberMatchVO nvo = new NumberMatchVO();
  
public void input(){
	//  int getp, getc = 0;
	 
	  
	  Scanner scan = new Scanner(System.in);
	  System.out.println("1부터 5까지 정수만 입력하세요.");
	  try { 
			int in = scan.nextInt();
			nvo.setPlayer(in);
			
         
		}catch(Exception e) {// 백업을 해주는 역활!
         System.out.println("문자는 안됩니다. "); 
			
		}
		if(nvo.getPlayer() == 0){
			System.out.println("다시 입력해 주십시오");
		}else{ 
			nvo.setCom(); 
			this.result = nvo.game(nvo.getCom(),nvo.getPlayer()); //void 형에서 int 형의 자체가 안됨..
			//this.result =  
					//nvo.game(getc, getp); 
		    
		}
		
  }

	public void check(int i){
		
	  for( ; i<3;i++){
		if(this.result == 1){
			System.out.println("맞쳤습니다. " + "게임을 종료 합니다. ");
			break;
		}else if( i == 2){
			System.out.println("3회 모두 참여했습니다. "+
		                       "\n 게임에서 패배해습니다. "+
					           "\n 게임을 종료합니다. "
					);
		}
	  }
  
  }



	  
  }
 

