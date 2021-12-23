package exception3;

public class Throw01P361 {

	public static void main(String[] args) {
		// throw는 예외상황이 아니지만 예외를 강제로 발생시킵니다.
		// math.random()은 0 < 난수 < 1를 발생시킵니다
		// System.out.println((int)(Math.random()*10));
		// 범위를 0~9 까지 만ㄷ드는법
		
		int randomNum =  (int)(Math.random() * 10);
		System.out.println("나온 난수값 : "+ randomNum);
		
		try {
			if(randomNum > 3) {
				throw new ArrayIndexOutOfBoundsException();
			} else {
				System.out.println("정상 범위 난수 발생");
			}
		} catch (Exception e) {
			System.out.println("없던 예외를 만들었습니다.");
			e.printStackTrace();
		}
 
	}

}
