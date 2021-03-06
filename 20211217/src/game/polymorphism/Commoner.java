package game.polymorphism;

public class Commoner {
	//속성(필드, 변수)값으로 name, hp, mp , atk를 추가하세요
	//생성자로 위 필드를 초기화하도록 설정해주세요.
	
	
	private String name;
	private int hp;
	private int mp;
	private int atk;
	
	public Commoner(String name) {
		this.name = name;
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
		}
	// 다항성을 적용해서 어떤 몬스터가 오더라도 이 메서드 하나로 처리함
	// 몬스터타입이 없어서 에러가 나므로 우선 같은 패키지내 몬스터를 생성
	//

	public void hunt(Monster monster) {
		// 몬스터의 doBattle(사용자 공격력)을 호출받아서 몬스터의 체력을 깎으세요
		
		monster.doBattle(this.atk);
		if(monster.getHp() > 0) {
			hp = this.hp - monster.getAtk();
			
		System.out.println("영웅의 남은 체력은 "+hp + " 입니다.");
		} 
		
		
	}	

}
