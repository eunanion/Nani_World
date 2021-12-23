package exception3;

public class Exception03P355 {
	public static void main(String[] args) {
		//다중 catch는 블럭 내부에서 여러 유형의 예외가 발생했을떄
		// 각각 예외유형을 다르게 처리할 때 사용합니다
		// 이 때 catch구문을 여러번 사용할 수 있습니다.
		
		int[] number = {1,2,3,4,5,0};
		// 예외가 발생할지도 모르는 코드부터 try블럭에 넣습니다.
		
		try {
		    for (int i = 0 ;  i < 6 ; i++ ) { //ArrayOutOfBoundsException
		    	System.out.println(number[i]);
		    }System.out.println("0으로 나눠보겠습니다");
		    System.out.println(number[4]/number[5]); //ArithmeticException
		}catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("범위를 벗어난 인덱스 번호를 입력했습니다");
		}catch(ArithmeticException b) {
			System.out.println("0으로 나눌수 없습니다");
	
		}
		catch (Exception e) {
			// Exception e는 만능처리구문으로 어떤 예외도 다 일괄적으로 처리해줍니다.
			// Exception e는 모든 예외의 클래스를 상속받은 부모클래스이다.
			System.out.println("예외가 발생했습니다");
		}
	}

}
