
public class Ch4_5 {

	public static void main(String[] args) {
		// 다음의 실행 겱롸와 같이 중첩 for문을 이용하여 밑줄을 채워 실행 결과와 같이
		// 영문자 E모양이 나올 수 있도록 구현하시오.
		/* *****
		 * *
		 * *****
		 * *
		 * *****
		 */
		
		for(int i =1 ; i <= 5 ; i++) {
			System.out.print("*");
			for (int j = i ; j <= i  ; j++) {
				if(j%2 ==  1)
					System.out.print("****");
			}System.out.println(); 
		}

	}

}