
public class Ch3_8 {

	public static void main(String[] args) {
		int egg= 456;
		int box = egg == 456 ? egg/12 : egg/0; 
	    System.out.println("달걀 "+egg + " 개를 12개씩 담을 수 있는 상자의 수는 "
	    		+ box + " 개");
	    //달걀 456개를 12개씩 담을 수 있는 상자의 수는 38개

	}

}
