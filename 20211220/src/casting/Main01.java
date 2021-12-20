package casting;

public class Main01 {

	public static void main(String[] args) {
		// Animal 타입은 어떤 자료형ㅇ건 받을 수 있다
		// Cat, Dog , Animal을 하나씩 만드세요
		// Animal c1, d1 ,a1으로 받아주세요
		
		//c1,d1,a1 으로 받아주세요
		
		// c1,d1,a1에 .sit()을 호출해보세요
		
		Animal a1 = new Animal("유니콘",3);
		Animal c1 = new Cat("나비",2);
		Animal d1 = new Dog("멍뭉이",1);
		
		a1.sit(); // Animal, Cat 동시에 존재하는 자원에 접근
		c1.sit(); // Cat에만 있는 자원에 접근불가
		//c1.howl();
		d1.sit();
		
		
		// 각 자료형에 맞는 변수로 바꿔서 대입해보자
        //  Cat cat = c1;  c1은 자체는 애니멀 이지만, 캣에 저장된 데이터가
		//  Cat 이므로 위 식 상태로는 애니멀에서 cat으로 바꿀수없다 뜬다
		// 그러므로 변형은 다음과 같은 방법을 사용한다
		
		Cat cat = (Cat)c1;
		cat.howl();
		Dog dog = (Dog)d1;
		dog.howl();
	}
	
	

}
