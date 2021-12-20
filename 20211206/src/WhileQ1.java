
public class WhileQ1 {

	public static void main(String[] args) {
		// 반복문의 경우 3개 요소가 필요
		// 조건식 (참/거짓 판단 유지여부)
		// 변수 (조건식을 어느시점에서 true-> false 변경)
		// 변수증감 
		// for 문 같은경우 위 3개 요소를 한줄에
		// while은 따로 떨어뜨려 두는것이 특징
		// 따라서 한 줄에 있냐, 떨어져있냐만 뺴면 사실상 같은 구문
		
		int i = 2;
		int j = 1;
		
		while (i < 10 ) {
			
			while( j < 10 ) {
			    System.out.println( i + "  *  " + j + " = " + i*j );
				j++;
				
				
				
			}
			j=1;
			System.out.println("==============================");
			i++;
		}

	}

}
