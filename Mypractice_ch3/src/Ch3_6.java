
public class Ch3_6 {

	public static void main(String[] args) {
		/* 경비 65430 원을 변수에 대입한 다음 산술 연산자를 이용하여 실행결과와 같이 
		 출력되도록 Ch03_exam06.java 코드를 작성하시오
		 만원 : 6
		 천원 : 5
		 백원 : 4
		 십원 : 3
		 */
		int all = 65430;
		System.out.println("만원 : " + all/10000);
		System.out.println("천원 : " + (all%10000)/1000);
		System.out.println("백원 : " + ((all%10000)%1000)/100);
		System.out.println("십원 : " + (((all%10000)%100)/10));
		
		
		
		
	}

}
