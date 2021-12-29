package math1;

public class Math03 {

	public static void main(String[] args) {
		// rint()는 현재 수에서 가장 가까운 정수를 실수형태로 구해줍니다
		
		double a= 3.50000000000001;
		System.out.println(Math.rint(a));
		double b= - 3.9999999999999;
		System.out.println(Math.rint(b));
		
		//round 반올림값을 구해준다 
		System.out.println(Math.round(a));
		System.err.println(Math.round(b));

	}

}
