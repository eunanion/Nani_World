import java.util.Scanner;

public class Ch3_10 {

	public static void main(String[] args) {
		/* 화씨를 섭씨로 변환하는 식을 작성하시오
		 * 화씨를 F 섭씨를 c라 할떄
		 * F = 1.8*C + 32 , C = 5/9*(F-32)
		 * 의 공식을 사용하여 실행 결과와 같이 소수점 셋째 자리에서 반올림하는
		 * 연산자를 구하시오
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("화씨 : ");
		
		double F = scan.nextDouble();
		
		double C =(F-32)*5/9;
		//		double C =5/9*(F-32); << 0.0이 되는거지?

		
		System.out.println("섭씨 : "+ Math.round(C*100)/100.0);
		

	}

}
