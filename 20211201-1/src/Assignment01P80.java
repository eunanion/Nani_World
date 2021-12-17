
public class Assignment01P80 {
    public static void main(String[] args) {
		// 대입연산자란 특정 변수값을 연산자 우측에 해당하는값을 이용해 
    	// 연산한 결과값으로 계산해 저장하는 기능을 수행한다.
    	// 단순연산자인 =이 있으며, 추가로 확정된 복합대입연산자로
    	// +=, -= , /=, *= , %= 등이 있다.
    	// 대입연산자를 사용하는 경우, 코드 실행방향이 오른쪽에서 왼쪽이다 (다른것들은 왼쪽에서 오른쪽)
    	
    	int a = 10;
    	System.out.println(a = a+10); // 10을 증가시키는 코드
    	//or System.out.println(a);
    	//  a = a + 10
    	
    	System.out.println(a); //20으로 증가
    	
    	int A= 10 ;
    	System.out.println(A += 10);
    	System.out.println(A);
    	
    	//5를 감소시키는 코드
    	
    	int b = 20;
    	System.out.println(b);
    	b = b - 5 ; 
    	System.out.println(b);
    	b -= 5;
    	System.out.println(b);
    	
    	
    	//3배 증가시키기
    	
    	int B = 5;
    	System.out.println(B);
    	B = B*3;
    	System.out.println(B);
    	B *=3;
    	System.out.println(B);
    	
    	// 4로 나누는 코드(정수)
    	
    	int c= 64;
    	System.out.println(c);
    	c = c / 4;
    	System.out.println(c);
    	c /=4;
    	System.out.println(c);
    	
    	
    	
    	// 12가 나오는 나머지 연산 코드
    	
    	int C = 38;
    	C %=26; //C = C % 26;
    	System.out.println(C);
    	
	}       
	
}
