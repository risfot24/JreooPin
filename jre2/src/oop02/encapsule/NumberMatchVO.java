package oop02.encapsule;

public class NumberMatchVO {
	  private int player;
	  private int com;
	  private int count = 3;
	  private int result;

	  public void setPlayer(int player) {
			if (player < 1 || player > 5) {
				System.out.println("1부터 5까지의 정수만 입력해야 합니다. ");
			} else {
				this.player = player;
			}

		}
	  public int getPlayer() {
			return player;
		}
	  public int getCom() {
			return com;
		}

		public void setCom() {
			this.com = (int)((Math.random() * 10) + 1);
		}
		
		public int game(int com, int player) {
			int result;
			//int count = 0;
			if (getPlayer() == getCom()) {
			   --this.count;
				System.out.println(getPlayer() + "정답 !! ");
				System.out.println(this.count+"번 남았습니다.");
				result = 1; //return 1
			} else {
				--this.count;
				System.out.println("틀렷습니다. ");
				System.out.println("컴퓨터가 선택한 값은 " + getCom() + "입니다. ");
				System.out.println(this.count+"번 남았습니다.");
				result = 0;  // return 0
			}
			 return result;
		 // this.result = result;
		}
		

}
