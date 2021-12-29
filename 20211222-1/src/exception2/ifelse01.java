package exception2;

import java.util.Scanner;

public class ifelse01 {
	public static void main(String[] args) {
		// int a, b 에 스캐너로 각각 정수를 입력받아주세요
		Scanner scan = new Scanner(System.in);
		System.out.println("1번 정수를 입력해주세요");
		int a = scan.nextInt();
		System.out.println("2번 정수를 입력해주세요");
		int b = scan.nextInt();
	
		if (b == 0) {
			System.out.println("0으로 나눌수가 없습니다");
		} else {
			System.out.println( a / b );
		}
 	//예외가 이렇게 발생할수 있으니 이런식으로 처리해줘야 한다! 
	}

}
