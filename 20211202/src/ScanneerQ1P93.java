import java.util.Scanner;

public class ScanneerQ1P93 {

	public static void main(String[] args) {
		
		// 환율 계산기를 만들어 보겠습니다
		// 네이버에 검색해서 원하는 국가 화폐의 환율을 rate 변수에 저장해주세요.
		// 스캐너를 이용해서 won 변수에 원하 금액을 입력해주세요.
		// 원화와 환율을 이용해서
		// 원화 xxxxx원을 환전시 xxxx(화폐) 입니다. 로 결과물을 출력해주세요.
		
		Scanner scan = new Scanner(System.in);
		
		double rate = 1 / 1177.70;
		
		System.out.println("원화를 입력해주세요 :");

		int won = scan.nextInt();
		
		double dollor = rate * won;
		
		System.out.println("원화 "+ won +" 원을 환전시 "+ Math.round(dollor*1000)/1000.0 + " $ 입니다.");
        //Math.round(*10)*10.0 으로 소수점 조절
        //위 코드로 감싼다음 10^n을 곱하고 10.0^n승으로 나눠주면 n승에 해당하는 자리수만큼 소수점이 출력
		scan.close();
        // 다 사용한 scan 변수는 .close()로 닫아줘야 메모리가 회수됩니다.
	}

}
