
public class Ch4_1 {

	public static void main(String[] args) {
		int res = 1;
		for (int i = 1 ; i <= 10 ; i++) {
			System.out.print( i + "*");
			res *= i;
		
			if(i == 10){
				break;
			}
			
			
		}System.out.print("=" + res);

	}

}
