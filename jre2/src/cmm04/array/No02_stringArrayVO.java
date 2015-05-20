package cmm04.array;

public class No02_stringArrayVO {
	private String[] juso = new String[3];

	void juso() {
		// 키워드 , 식별자, 바디 ?
		// 변수도 키워드 , 식별자 , 바디
		this.juso[0] = "서울";
		this.juso[1] = "종로";
		this.juso[2] = "광화문";
		result(this.juso);
	}

	void result(String[] juso) {
		int i = 0; // 이런 모습이 존재하는이유 ?
					// for문을 여러개 써야 할때

		for (; i < juso.length; i++) { // ; 구분자 문법이 있어서..for문의 구분자 문법은 정형화되어있다.
			System.out.print("지역 : " + juso[i] + "\t");

		}
	}



}
