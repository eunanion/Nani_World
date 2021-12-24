package string1;

public class String07P399 {

	public static void main(String[] args) {
		// toUpperCase()는 문자열 전체를 대문자로 바굽니다
		// 대문자였던것은 대문자 유지, 소문자였던것은 대문자로
		String hello = "Hello Java";
		System.out.println(hello.toUpperCase());
		System.out.println(hello);
		// 저장되는 문법ㅇ 아님
		
		// toLowerCase()는 문자열 전체를 소문자로 바꿀때 사용
		// 소문자는 소문자 유지, 대문자만 소문자화
		
		String hi = "HdsffFFehGrfrTtttGFFffF";
		System.out.println(hi.toLowerCase());
		System.out.println(hi);

	}

}
