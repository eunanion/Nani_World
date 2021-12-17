
public class BinaryP63 {

	public static void main(String[] args) {
	    // 이항 연산자는 양 변에 하나씩 항목을 취하는 연산자 입니다.
		 //산술 연산자는 우리가 잘 알고 있는 사칙연산 등을 활용하기 위한
		// 연산자이며, 연산 우선순위도 그대로 계승합니다.
		// 단, % 연산자의 우선순위는 *, /와 동일합니다.
		// +,-,*
		
		System.out.println(3 + 5);
		System.out.println(17 - 21);
		System.out.println(2 * 3 );
        // 나머지는 /로 표현, 왼쪽 수를 오른쪽 수로 나눠서 몫을 구한다.(정수/정수=정수)
		
		System.out.println(7 / 2); // 3.5가 아닌 3으로 출력
		System.out.println((double)7/2);
		System.out.println(7.0/2);
		System.out.println(7/2.0);
		// %는 정수 최대의 몫을 구하고 남은값만 출력한다.
		System.out.println(10 % 3);
		System.out.println(10 / 3);
		// 연산자 우선순위는 그대로 존재한다.
		System.out.println(10 + 6 % 4);
		System.out.println((10+6)%4);
		
		
		
	}

}
