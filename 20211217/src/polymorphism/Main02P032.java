package polymorphism;

public class Main02P032 {

	public static void main(String[] args) {
		Person pr = new President("트럼프",60,4);
		Person at = new Athlete("손흥민",29,"축구선수");
		
		pr.showPerson();
		at.showPerson();

	}

}
