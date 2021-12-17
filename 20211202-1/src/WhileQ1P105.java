import java.util.Scanner;

public class WhileQ1P105 {

	public static void main(String[] args) {
		// 스캐너를 이용해서 String num 변수에
		// "문자열 형태인 숫자"를 입력받게 해주세요 ( scan.nextLine()으로 문자열 입력받기
		// 이 문자자료 num을 int loop 변수에 Integer.parseint()로 정수변환해 저장하세요
		// "반복문을 실행합니다." 라는 문장이 콘솔에 출력되도록 
		// while문을 작성해주세요
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요 : ");
 
		String num = scan.nextLine();
		
		int loop = Integer.parseInt(num);
		int count = 0;
		while ( count < loop  ) {
			
			count++;
			
		    	 
			
			System.out.println( count + "번째 반복문 실행중입니다.");
		}
	
		

	}

}
