package game.inheritance;

public class Main02 {

	public static void main(String[] args) {

		Warrior a = new Warrior ("쇠주애주가");
		a.getInfo();
       //  코드호출순서 main -> warrior (super) -> commoner - >warrior - > main
	}

}
