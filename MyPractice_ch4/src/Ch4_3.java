
public class Ch4_3 {

	public static void main(String[] args) {
		double sum=0;
		for (int i =1; i < 10 ; i++) {
			
			sum += (double)i/(i+1);
			System.out.print(i+"/"+(i+1));
			if(i==9) {
				System.out.print("=");
			}else {
				System.out.print("+");
			}
			
		}
		System.out.println(sum);

	}

}
