package heapmemory;

public class StringComparison {

	public static void main(String[] args) {
		// 문자열은 같은 문자로 저장시 같은 주소를 공유합니다.
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Hellp";
		//일반 변수의 배정 값	 조회시 .hashcode()를 사용

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		//문자열은 일부분 변경 불가능
		// [0] ='Q';
		
		
		// str1 == str2 와 같이 비교하는것은 문자열 비교가 아니고
		// 주소비교 입니다
		// new 키워드로 생성시 내용이 같은 문자열도
		// 별개의 공간을 새로 배정해 만든다
		System.out.println(new String("Hello"));
		System.out.println(str1 == new String("Hello"));
		System.out.println(str1 == str2);
		// 비교문 작성시 충분히 헷갈릴수 있음
		
		System.out.println(str1.equals(new String ("Hello")));
		// .equal 명령어 경우 주소값이 아닌 "문자열"로 비교한다
		// equal 뒤에 있는 new 스트링도 새롭게 생긴 메모리 공간에 배정받은 Hello
	}

}
