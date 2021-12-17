
public class Ch3_4 {

	public static void main(String[] args) {
		/* 다음은 대문자를 소문자로 변경하는 코드로, 문자 변수 ch에 저장된 문자가
		 소문자인 경우에만 대문자로 변경한다. 문자코드가 소문자가 대문자보다 32만큼 더 크다.
		 예를들어  'A' ~'Z' 문자 코드는 65~90이고 'a'~'z' 문자코드는 97~122이다.
		 밑줄을 채워 실행 결과와 같이 나올 수 있도록 구현하시오.		 
		 */
		
		char ch = 'd';
		
		char upperCase = (ch == 100) ? 68 : ch ;
		//char 형 문자코드로 출력시 숫자에 따옴표를 붙이지 않는다.
		
		System.out.println("lowerCase : " +  ch);
		System.out.println("upperCase : " + upperCase);
		

	}

}
