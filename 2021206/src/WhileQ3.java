import java.util.Scanner;

public class WhileQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("한변의 길이를 입력해주세요 : ");
		
		int count = scan.nextInt();
		
		int i = 0;
		int j = 0;
		
		while (i < count ) {
			while(j < count ) {
				j++;
				System.out.print("*");
				
			} System.out.println(""); 
			j = 0;
			i++;
			
			
		}
		
		
		
		
	}

}
