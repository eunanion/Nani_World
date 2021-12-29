package math1;

public class Math06 {

	public static void main(String[] args) {
		// 가위바위보 게임
		//같은 요소 무승부
		int myValue = (int)(Math.random()*2);
		int comValue = (int)(Math.random()*2);
		
		if(myValue == 0) {
			System.out.println("나 : 가위");
		}if(myValue == 1) {
			System.out.println("나 : 바위");
		}
		if(myValue == 2) {
			System.out.println("나 : 보");
		}
		if(comValue == 0) {
			System.out.println("컴퓨터 : 가위");
		}if(comValue == 1) {
			System.out.println("컴퓨터 : 바위");
		}
		if(comValue == 2) {
			System.out.println("컴퓨터 : 보");
		}
		
		if(myValue == 0) {
			if(comValue == 0 ) {
				System.out.println("비겼습니다");
			}if(comValue == 1 ) {
				System.out.println("졌습니다");
			}if(comValue == 2 ) {
				System.out.println("이겼습니다");
			}
			
		}
		if(myValue == 1) {
			if(comValue == 0 ) {
				System.out.println("이겼습니다");
			}if(comValue == 1 ) {
				System.out.println("비겼습니다");
			}if(comValue == 2 ) {
				System.out.println("졌습니다");
			}
			
		}
		if(myValue == 2) {
			if(comValue == 0 ) {
				System.out.println("졌습니다");
			}if(comValue == 1 ) {
				System.out.println("이겼습니다");
			}if(comValue == 2 ) {
				System.out.println("비겼습니다");
			}
			
		}



	}

}
