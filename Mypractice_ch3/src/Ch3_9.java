
public class Ch3_9 {

	public static void main(String[] args) {
		int all =45763;
		System.out.println("500원 : " + all/500);
		System.out.println("100원 : " + (all%500)/100);
		System.out.println("50원  : " + ((all%500)%100)/50);
		System.out.println("10원  : "+ (((all%500)%100)%50)/10);
		System.out.println("1원   : "+ ((((all%500)%100)%50)%10) + "개 이다");

	}

}
