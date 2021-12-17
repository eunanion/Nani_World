
public class Binary04P77 {

	public static void main(String[] args) {
		// 비트이동연산자 숫자>> or << 자리수 문법을 사용
		// 꺽쇠의 방향이 <<인 경우는 왼쪽으로 자리수만큼 밀어준다 (2의 제곱만큼 증가)
		// 꺽쇠의 방향이 >>인 경우는 오른쪽 자리수만큼 밀어준다 (2의 제곱만큼 감소)
		
		int a = 80;
		System.out.println(a >> 3);
		System.out.println(a << 3);
		System.out.println(a << 3); //a가 sysout순서대로 갱신되지 않는다.
	}

}
