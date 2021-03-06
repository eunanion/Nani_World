
public class Ch3_7 {

	public static void main(String[] args) {
		/* 정수형 정수 27890의 오른쪽에서 8번째 비트와 9번째 비트가 각각 어떻게 되는지 실행결과와 같이 
		 * 연산자를 이용하여 작성하시오
		 * 오른쪽에서 8번째 비트 : 1
		 * 오른쪽에서 9번째 비트 : 0
		 */
		int a = 27890;
		//27890(10) = 110110011110010(2)
		System.out.println(a >> 7);
		// 217 출력 , 217(10)= 11011001(2)
		System.out.println((a >> 7) & 1);
		System.out.println((a >> 7) | 1);
		System.out.println((a >> 7) ^ 1);
		/*
		 * a. & (비트곱): 두 비트가 1일 때 1, 나머지는 0. - >n+1번째 비트수 확인가능
           b. | (비트합): 두 비트 중 하나 이상이 1이면 1, 두 비트 모두 0이면 0.
           c. ^ (xor 배타적 논리합): 두 비트가 다르면 1, 같으면 0.
		 */
		System.out.println(a>> 8);
		System.out.println((a>> 8) & 1);
		System.out.println((a>> 8) | 1);
		System.out.println((a>> 8) ^ 1);

	}

}
