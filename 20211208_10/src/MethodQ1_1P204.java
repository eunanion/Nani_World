import java.util.Scanner;

public class MethodQ1_1P204 {

	//섭씨온도를 입력하면 화씨온도로 바꿔주는 메서드를 작성해보자
		// 매서드 이름은 CtoF이고 , double을 리턴한다
		// 리턴받은 결과값은 main메서드에서 sysout으로 출력
		// 화씨 = 섭씨 x 1.8 + 32
		public static double CtoF(double F) {
			return  (F-32)/1.8;
		}
		public static void main(String[] args) {
		   
			Scanner scan = new Scanner(System.in);
			System.out.println("화씨 온도를 입력해주세요: ");
			double F= scan.nextDouble();
			double C=CtoF(F);
			//double F= CtoF(-273.15);
			System.out.println("섭씨온도는 "+ C + " 입니다.");
			

		}

}
