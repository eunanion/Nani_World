
public class UnarayQ1P65 {

	public static void main(String[] args) {
		// int a에 15를 담은 다음 후위 -> 전위 순으로 --를 Unary01처럼 사용해서
		// 1씩 차감하고, 콘솔에 찍는것을 반복해주세요.
		// 단, 실행 로직은 Unary01에서 그랬듯 주석으로 하단에 풀어서 작성까지 해주세요.
		
		int a =15;
		System.out.println(a--);
		// 1. 콘솔에 15가 먼저 찍힌다
		// 2. a = a(15) -1 로 갱신
		System.out.println(a);
		// a = 14 로 출력
		System.out.println(--a);
	    // 1.a = a(14) -1 로 갱신
		// 2.콘솔에 13이 출력된다.
		System.out.println(a);
		// a = 13으로 유지

	}

}
