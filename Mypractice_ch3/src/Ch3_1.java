
public class Ch3_1 {
	public static void main(String[] args) {
		
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println( y >= 5 || x < 0 && x > 2);
		//True
		System.out.println(y += 10 - x++);
		//13        전위수식 값증가 - > 콘솔, 후위수식 콘솔 -> 값증가 
		System.out.println(x += 2);
		//5
		System.out.println(!('A' <= c && c <= 'Z'));
		//false
	}

}
