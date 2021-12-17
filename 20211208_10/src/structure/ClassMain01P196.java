package structure;

public class ClassMain01P196 {
     //PersonClass의 매서드는 작성할 필요가 없다.
	 //이미 PersonClass의 내부에 필요한 매서드를 다 작성했기 떄문
	public static void main(String[] args) {
		
		//사람을 두명 만들어보세요
		//만든 사람의 정보를 콘솔에 찍어보세요
		PersonClass a1 = new PersonClass();
		a1.age = 23;
		a1.name = "으나니";
		a1.pNum = "010-9093-123121";
		a1.uNum = 1221;
		a1.glasses= true;
		
		PersonClass a2 = new PersonClass();
		a2.age = 25;
		a2.name = "우나니";
		a2.pNum = "010-32423493-123121";
		a2.uNum = 324234;
		a2.glasses= false;
		
		
		a1.getInfo();
		a2.getInfo();
		
	  //콘솔찍는 방법
		//힌트  :getinfo의 소속은?
		
		
	
		
		

	}

}
