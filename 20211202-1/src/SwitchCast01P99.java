
public class SwitchCast01P99 {

	public static void main(String[] args) {
		// switch ~ case 구문은 변수에 들어있는 자료가  case문에 제시된
		// 자료와 일치하는지 여부로 논리식을 실행합니다.
		// switch(변수){
		// case 값1 :
		//      실행문;
		// case 값2...
		//}
		//와 같이 작성합니다.
		// 마지막에 default 문을 작성시 if~else문의 else처럼 사용 가능.
		
		
		int a = 3; 
		switch(a) {
		case 1 :
			System.out.println("one");
			break;
		case 2 :
			System.out.println("two");
			break;
		case 3 :
			System.out.println("three");
			break; // break를 붙이지 않으면 뒤에 실행문이 모두 실행됨
		case 4 :
			System.out.println("four");
			break;
		case 5 :
			System.out.println("five");
			break;
			
		default :
			System.out.println("1~5가 아닙니다.");
		    break; // default엔 break가 필요없지만 가독성을 위해 작성하는 경우도 있음
		} 
		
		
		
		}

	}
