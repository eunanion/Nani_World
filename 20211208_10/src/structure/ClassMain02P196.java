package structure;

public class ClassMain02P196 {

	public static void main(String[] args) {
		
		Car a = new Car();
		
		a.owner = "이재용";
		a.model = "레이";
		a.price = 3;
		
		Car b = new Car();
		
		b.owner = "김범수";
		b.model = "마티즈";
	    b.price = 2;
	    
	    a.getInfo();
	    b.getInfo();

	}

}
