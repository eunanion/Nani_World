import java.util.Scanner;

public class Ch4_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("중간고사 점수를 입력하시오 : ");
		int mid = scan.nextInt();
		System.out.println("기말고사 점수를 입력하시오 : ");
		int fin = scan.nextInt();
		System.out.println("레포트 점수를 입력하시오");
		int rep = scan.nextInt();
		System.out.println("출석 점수를 입력하시오");
		int abs = scan.nextInt();
		double total = 0;
		total = (((double)mid+(double)fin)/2)*0.6 + (double)rep*0.2 + (double)abs*0.2;
		
		if (total >= 90) {
			System.out.println("학점 : A");
		} else if (total >=80) {
			System.out.println("학점 : B");
		} else if (total >=70) {
			System.out.println("학점 : C");
		} else if (total >=60 ) {
			System.out.println("학점 : D");
		} else {
			System.out.println("학점 : F");
		}
		
		
		System.out.println("성적 : "+ total);
		switch (total) {
			case 80 : System.out.println("평가 :excellent");
			break;
			case 60 : System.out.println("평가 : good");
			break;
			default : System.out.println("평가 : poor");
 
			//하다 말았음. 답지 참고하기 답지 존나 간결함;; ㅅㅂ;;
		}
	}
	
}
