
public class Unary01P65 {

	public static void main(String[] args) {
		   //단항 연산자 ++ -- 
		// ++, -- 숫자의 왼쪽 혹은 오른쪽에 붙을수 있습니다.
		// 왼쪽에 붙는 경우를 전위수식, 오른쪽에 붙는 경우를 후위수식 이라 한다.
		// 어느 방향에 붙냐에 따라 실행순서가 달라진다.
		// ++는 대상 변수의 숫자를 1증가, --는 1 감소
		
		int a =1;
		System.out.println(++a);
		// 1. a값을 먼저 1증가 시킴 a = a + 1
		// 2. 증가된 a값을 콘솔에 찍음 : sysout(a(2))
		System.out.println(a); //a가 증가된채 유지
        
		System.out.println(a++);// 후위수식, a출력(2) 후 1증가
        // 1. a값을 콘솔에 찍음 sysout(a(2))
		// 2. 콘솔에 찍은 이후 a값을 1증가 시킴 a = a(2) + 1
		System.out.println(a);
        // 증가된 a값을 콘솔에 출력
	
	
	}

}
