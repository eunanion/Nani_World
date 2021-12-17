
public class SwitchCase02P101 {

	public static void main(String[] args) {
		// 범위인것처럼 swtich ~ case 문을 쓰고 싶다면
		// 하나의 break에 여러 case문을 연달아 작성하면 된다.
		
		int score = 2 ; 
		switch(score) {
		case 10 :
		case 9 :
			System.out.println("수");
			break;
		case 8 :
		case 7 :
			System.out.println("우");
			break;
		case 6 :
		case 5 :
			System.out.println("미");
			break;
		case 4 :
		case 3 :
			System.out.println("양");
			break;
			
		default :
			System.out.println("가");

			
			//노가다, if ~ else로 작성하는게 낫다
		}
		
	}

}
