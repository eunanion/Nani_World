package stringbuilder1;

public class Builder06_1P408 {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		
		int b = 0;
		
		while(b < a.length()) {
			b += 3;
			a.deleteCharAt(b);
			System.out.println(a);
		} // 왜 에러가 발생하는지 생각해보기
 
	}

}
