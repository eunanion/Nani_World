package exception2;

import java.util.Scanner;

public class TryCatch02P353 {

	public static void main(String[] args) {
		// 아까 exception1 패키지 내부의 여러 예외 유형 중
		// 하나를 골라서 예외가 발생할 수 있는 코드를 작성해주세요.
		// 발생할 예외에 대한 처리는 try~catch블록을 활용합니다
		// /by zero(0으로 나누기)에 대한 처리는 허용되지 않습니다.
		Scanner scan = new Scanner(System.in);
		System.out.println(" 배열의 몇번째를 보시겠습니가?");
		int a = scan.nextInt();
		
		int[] arr = new int [5];
		
		try {
			System.out.println("배열의 "+ a +" 번째는 ");
			System.out.println(arr[a] + " 입니다.");
		} catch (Exception e) {
			System.out.println("해당번째의 항목이 존재하지 않습니다");
			
		}
	

	}

}
