package game.polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		
		Commoner a = new Commoner("바바리안");
		Monster b = new Orc();
				
		
		a.hunt(b);
		a.hunt(b);

	}

}
