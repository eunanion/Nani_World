package stringbuilder1;

public class Builder05P408 {

	public static void main(String[] args) {
		// 다음 문자열의 문자를 0번부터 시작해서 3번째마다 삭제해주세요
		// 힌트 : 반복문 쓰기
		// 문자열은 "abcdefghijklmnopqrstuvwxyz"
		
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		for (int i = 2 ; i < a.length() ; i += 3 ) {
			a.deleteCharAt(i);
			
		}
		System.out.println(a);

	}

}
