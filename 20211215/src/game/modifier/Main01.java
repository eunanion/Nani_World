package game.modifier;

public class Main01 {

	public static void main(String[] args) {
		//magician을 생성해주세요

		Magician a = new Magician("소서리스");
		//교전 전에 getInfo()로
		//정보부터 조회해주세요.

		//hunt()로 사냥해주세요

		//사냥이 끝난 후 디시
		//정보를 조회해주세요.
		a.getInfo();
		a.hunt();
		a.hunt();
		a.hunt();
		a.getInfo();
		a.fireball();
		a.fireball();
		a.heal();
		a.heal();
		a.getInfo();

	}

}
