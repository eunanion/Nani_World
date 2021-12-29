package string1;

public class String08P399 {

	public static void main(String[] args) {
	     // trim() 은 공백이 아닌 문자가 시작하기 위한 직전 모든 지점과
		// 공백이 아닌 문자로 끝난 이후 지점의 모든 공백을  제거 합니다
		String str = "                    HELlo         java";
		System.out.println(str);
		System.out.println(str.trim());
		// replace()를 이용해서 공백 전체를 없애보세요. 
		str = str.replace(" ","");
		str = str.replace("  ","");
		System.out.println(str);
		
		// trim()과 replace()을 이용해 hello java사이의 공백을
		// 한칸만 남겨주세요
		
	}

}
