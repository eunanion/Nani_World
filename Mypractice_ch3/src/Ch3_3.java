
public class Ch3_3 {

	public static void main(String[] args) {
		
		
		boolean su01 = true;
		boolean su02 = false;
		int k = 0;
		
		System.out.println(su01 && su02 );
		//false
		System.out.println(su01 || su02 );
		//true
		System.out.println(!su01);
		//false
		System.out.println(!(!su01));
		//true
		
		k = (su01 && su02 ) ? 0 : 3;
		// k = 3
		k = (k !=0 ) ? 10 : 5;
		// k = 10
		
		k %= 10 ;
        //k = 0
		System.out.println(++k);
		// k= 1

	}

}
