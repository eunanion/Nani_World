package math1;

public class Math05 {

	public static void main(String[] args) {
		// 주사위 게임을 만들어주세요.
		// 주사위게임은 내 값은 myValue 변수에
		// 컴퓨터 값은 comValue 변수에 값을 난수발생으로 1~6
		
		int myValue = (int)(Math.random() * 6 +1 );
		int comValue = (int)(Math.random() * 6 +1);
		
		if (myValue > comValue) {
			System.out.println("니가 이겼어");
		}else if(myValue == comValue) {
		System.out.println("비겼어");	
		}else {
			System.out.println("니가 졌어");
		}
		System.out.println("내값은 : " + myValue);
		System.out.println("컴퓨터 값은" + comValue);
		
		

	}

}
