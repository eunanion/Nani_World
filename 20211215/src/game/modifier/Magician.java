package game.modifier;

public class Magician extends Commoner {
	
	public Magician (String name) {
		super(name);
		System.out.println(name + "님 메이플 웓드에 오신걸 환영합니다.");
	}

	public void hunt() {
		System.out.println("사냥을 시작합니다.");
		// hp -= 2; 를 직접 실행할수 없으므로
		// public 인 setter(setHp)를 이용합니다.
		// setHp(5)인 경우 , 기존의 값 대신 hp변수에 5로 교체해달라는 요청임
        // 현재 원하는것은, 현 hp값에서 사냥할때마다 2씩 체력이 깎이는것
		
		setHp(getHp()-2);
		// 경험치도 마찬가지로 setExp()
		setExp(getExp()+10);
		//현재 원하는것은 , 현 exp값에서 사냥할때마다 경험치가 증가하는것

  }
	// fireball 메서드를 작성해주세요
	// 마나가 3줄고, 경험치는 20증가합니다.
	// heal 메서드를 생성해주세요
	// 마나가 2줄고 체력이 10 회복됩니다.
	
	public void getInfo() {
		
		// 심지어 private 요소는 수정도 아닌 조회도 불가능
		System.out.println("현재 체력 : "+ getHp());
		System.out.println("현재 마나 : "+ getMp());
		System.out.println("현재 레벨 : "+ getLv());
		System.out.println("현재 경험치 : "+ getExp());
		System.out.println("유저명 : "+ getName());
		//체력뿐만 아니라 나머지 요소들도 조회할 수 있도록 코드를 고쳐주세요.
		}
	
	 public void heal() {
		 // 마나값 조정(기존마나값() - 3)
		 setMp(getMp()-3);
		 setHp(getHp()+10);
		 // 체력값 조정(기존체력값() + 10)
		 System.out.println("체력을 회복합니다");
	 }
	public void fireball() {
		setMp(getMp()-3);
		setExp(getExp()+20);
		System.out.println("파이어보오오오오오오오올");
	}
}
