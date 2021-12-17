
public class Method06P204 {

	
	//mul 메서드를 선언해주세요
	//이 메서드는 여러분들이 임의로 이름붙인 정수 변수 3개를 입력받아
	//3개를 곱한 값을 return 해줍니다
	
	//info매서드를 선언해주세요
	//이 매서드 내부에서
	//"안녕하세요"
	//"자바 매서드학습중입니다."
	//"1번의 호출로 3줄을 콘솔에 작성합니다"
	//라는 문장만 출력하고 return은 없습니다.\
	
	public static int mul(int a, int b , int c) {
		return a*b*c;
	}
	public static void info() {
		System.out.println("안녕하세요");
		System.out.println("자바 매서드 학습중입니다.");
		System.out.println("1번의 호출로 3줄을 콘솔에 작성합니다");
	}
	public static void main(String[] args) {
		//mul을 호출해 결과값을 int result에 저장한 다음 콘솔에 출력하기
		//info매서드 반복문으로 3번 호출하기
		int d = mul(3,4,5);
		System.out.println(d);
		for (int i =1 ; i <=3 ; i++) {
		info();}

	}

}
