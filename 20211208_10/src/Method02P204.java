
public class Method02P204 {
	public static int add2(int a) {
		//return 구문에 무조건 int를 입력 
		return a+1 ;
	}
	

	public static void main(String[] args) {
		//반환 자료가 void가 아닌 경우 호출 위치에 
		//return문 오른쪽 자료를 그대로 갖다 놓습니다.
		//자료를 반환하는것은 console창에 표시한다 라는 말과 같습니다
		
		int b = add2(10);
		System.out.println(b);

	}//닫는 부분은 순서가 끝나면 스택에서 날라간다

}
