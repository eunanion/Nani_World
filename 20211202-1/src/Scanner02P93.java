import java.util.Scanner;

public class Scanner02P93 {

	public static void main(String[] args) {
		// Scanner 생성을 직접 해보세요
		//문자열을 입력받는경우
		//String name = scan.nexLine();
		//실수를 입력받는 경우
		//double height = scan.nexDouble();
		//sysout(name);
		//sysout(height);
		System.out.println("이름을 입력해주세요:");
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.nextLine();
		
		System.out.println("키를 입력해주세요:");

		double height = scan.nextDouble();

		System.out.println("이름:" + name);
		
		
		System.out.println("키" + height);
	}

}
