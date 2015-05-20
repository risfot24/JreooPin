package cmm04.array;

public class No03_ForLoopArrayVO {
	
	void input(){
		int[] arr = {1,2,3,4,5};
		//int[] arr = {0,0,0,0,0};
		//int[] arr = {};
		// int[] arr = arr[5];
		/*
		 * 1부터 5까지의 합을 구하세요
		 */
		int i = 0, result = 0;
		for (; i < arr.length; i++) {
			//arr[i] = i+1 ; //arr[i] += i ;
			result += arr[i];
		}
		/*
		 * 향상된 for문 출력 
		 * index 를 설정하지 않기 때문에 잘 안쓰여진다.	
		 */
		for(int num : arr){
			System.out.println(" "+num);
		}
		
		System.out.println("1부터 5까지의 합은 :"+result );
		
        
		
		
	}

}
