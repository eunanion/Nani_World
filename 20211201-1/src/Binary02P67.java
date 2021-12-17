
public class Binary02P67 {

	public static void main(String[] args) {
		// 비교 연산자는 크게 대소비교와 단순비교로 나뉜다.
		// 단순비교는 ==. != 이며 숫자가 아닌 자료형간 비교도 가능하다
		// 대수비교는 >,>=,<,<= 이며 숫자끼리만 비교가 가능하다
		// 컴퓨터는 비교연산자를 명제로 인식하여
		// T&F을 판별해 나타낸다
		System.out.println(3 > 5 );
		System.out.println(12 <= 12);
		System.out.println("a" != "b");
		System.out.println("a" == "b");
		System.out.println(5== 5.0);

	}

}
