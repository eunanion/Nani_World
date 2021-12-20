import java.util.Arrays;

public class EnhancedFor01P162 {

	public static void main(String[] args) {
		// 향상된 for문은 반복문 진행시 타겟으로 배열을 집어넣습니다
		//이 경우 반복실행 횟수는 배열의 내부요소 갯수만큼 입니다.
		
		// 배열 내부 요소의 개수는 배열명.length로 확인가능
		
		
		int[ ] arr1 = {	100, 200 , 300 ,400 , 500, 600 ,700};
		
		// arr[순번]을 입력해서 내부요소를 하나만 꺼낼수 있음 (순번은 0 부터 시작)
		
		System.out.println( arr1[5]);
		System.out.println( arr1);
		System.out.println(Arrays.toString(arr1));
		 System.out.println(arr1.length);
		for (int item : arr1) {
			 System.out.println(item);
			
		}
 
		for (int i = 0; i < arr1.length ; i++) {
			
			System.out.println(arr1[i]);
		}
			
		
	}

}
