package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		
		Horse h1 = new Horse();
		h1.name = "경주마";
		h1.age = 5;
		h1.food = "건초";
		h1.rank = 1;
		h1.howl();
		h1.getInfo();
		
		Pig p1 = new Pig();
		p1.name = "꿀꿀이";
		p1.age = 2;
		p1.food = "곡물사료";
		p1.weight= 300;
		p1.howl();
		p1.getInfo();
		
		

	}

}
