package stringbuilder1;

public class Builder03P408 {

	public static void main(String[] args) {
		// Delete는 말 그대로 문자열의 일부, 혹은 전체를 삭제합니다
		// Deleta(시작 인덱스번호, 끝 인덱스번호)를 입력하면
		// 시작지점부터 끝지점 사이를 삭제해줍니다
		StringBuilder a = new StringBuilder("ASDQASZ");
		System.out.println(a);
		a.delete(3, 4); //이 경우에 3에 해당부분만 삭제
		System.out.println(a);
	}

}
