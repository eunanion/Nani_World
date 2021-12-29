package math1;

public class Math04 {

	public static void main(String[] args) {
		// Math.random() 0이상 1미만인 난수를 구해줍니다
		double a = Math.random();
		System.out.println(a);

		
		// 50%확률로 강화성공
		for (int i = 1 ; i < 11 ; i++) {
		if (Math.random()> 0.9) {
			System.out.println("강화에 성공했누?");
		} else {
			System.out.println("강화에 실패했누? ");
		}
	}
		// 범위를 제한하고 싶은 경우 ( 0이상 6미만)
		int b = (int)(Math.random() * 6);
		System.out.println(b); 
		// 절대6은 나오지 않음. math.random은 1.0이  존재하지 안ㅇ흠
		
		
}
	

}
