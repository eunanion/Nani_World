import java.util.Scanner;

public class ElseIfQ1P97 {

	public static void main(String[] args) {
		// 성적 판독기를 만들어보겠습니다.
		// if ~else if ~ else 구문을 사용해 만들어주세요
		// 성적기준 95이상 A+, 90이상 A0 , 85이상 B+, 80이상 B0
		// 75이상 C+, 70이상 C0, 65이상 D+, 60이상 D0
		// 60미만 F로 프린트 구문을 출력해주세요
		// 스캐너로 int score 변수에 성적을 입력받습니다.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요 :  ");
		
		int a = scan.nextInt();
		
		if(a >= 95) { 
			System.out.println("A+"); 
		} else if(a >= 90) {
			System.out.println("A0");
		} else if(a >= 85) {
			System.out.println("B+");
		} else if(a >= 80) {
			System.out.println("B0");
		} else if(a >= 75) {
			System.out.println("C+");
		} else if(a >= 70) {
			System.out.println("C0");
		} else if(a >= 65) {
			System.out.println("D+");
			System.out.println("재수강 안하면 노답");
		} else if(a >= 60) {
			System.out.println("D0");
			System.out.println("재수강 안하면 노답");
		} else {
			System.out.println("F");
			System.out.println("재수강 축하축하");
		}
		
		
		}

	
	}

