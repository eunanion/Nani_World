
public class Ch2_5 {

	public static void main(String[] args) {
		char ch1='\ub300';
				char ch2='\ud55c';
				char ch3='\ubbfc';				
				char ch4='\uad6d';

				System.out.println(ch1 +""+ ch2+"" + ch3 +""+ ch4);
				System.out.println(ch1 + ch2 + ch3 + ch4);

				
				// ""없애고 ch1+ch2+ch3+ch4로 출력할 경우 내부 연산에 의해 
				// 한문자를 리턴하는 코드값이 정수로 인식되어 +키워드가 
				// 산술연산의 더하기로 인식됨
	

	}

}
