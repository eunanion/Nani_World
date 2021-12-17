package game.inheritance;

public class Commoner {
	/*commoner 클래스를 부모로 하는 게임 캐릭터들을 만들어보겠습니다

	commoner 는 레벨,체력,아이디,마나수치를 변수로 가집니다.
	정보은닉이 적용되어 private 접근 제한자를 가지며
	레벨은 1, 체력은 20 , 마나는 10이 기본값이며 아이디만 그때그때 입력받습니다.


	생성자로 데이터를 초기화 할수있고, getInfo를 이용해 현재 상태를 
	콘솔에 출력합니다 */
	protected int lv;
	protected int hp;
	protected String id;
	protected int mp;
	
	public Commoner(String id) {
		this.lv=1;
		this.hp=20;
		this.id=id;
		this.mp=10;
	
	}
	
	public void getInfo() {
		System.out.println("레벨 : "+ lv+"   "+id+" 님의 현재 체력은 "+hp+" 마나  "+mp
				+ " 입니다.");
	}

	
}
