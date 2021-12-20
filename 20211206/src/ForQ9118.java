
public class ForQ9118 {

	public static void main(String[] args) {
		// 다음 방정식의 양의 해를 모두 구하시오
		// 다음 방정식의 양의 정수
	    // 4x+5y=60
		// x포문, y포문 , if문이 필요
		
		for (int x = 1 ; x < 15 ; x++) {
			for ( int y = 1 ; y < 12 ; y ++) {
				
				if (x*4 + 5 *y == 60 ) {
					System.out.println("x는 "+ x +"," +  " y는 "+ y + " = 60이다");
			}
		}
		}

	}

}
