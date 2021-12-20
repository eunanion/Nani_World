package static1;

public class Main02P276 {

	public static void main(String[] args) {
		//System.out.println(StaticTest.num1);
	    //static변수는 생성 없이도 활용할수 있다.
		System.out.println(StaticTest.num2);
		
		// static 메서드로 설정 가능하며 나머지 사항은 변수와 같습니다.
		
	    StaticTest.Check();
	    //s1 생성 후 s1을 이용해 .check()를 호출해보세요
	    
	    StaticTest s1 = new StaticTest();
	    s1.Check();
	    
	}

}
