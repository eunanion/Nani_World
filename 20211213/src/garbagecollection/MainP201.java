package garbagecollection;

public class MainP201 {
	public static void main(String[] args) {
		//6개 객체생성
		Item i1 = new Item(1);
		Item i2 = new Item(2);
		i2 = null; /// 쓸쑤가 없는 객체가 됨 (스택과 힙에 연결을 끊음)
		Item i3 = new Item(3);
		// 메모리 중간에 회수하도록 강제 명령
		System.gc();
		//힙을 뒤져서 필요없는거 지우시오
		//cpu 종류에따라 2번 객체를 삭제하는 시기가 다 다름 (또한, 순서가 랜덤하게 달라질수 있음)
		Item i4 = new Item(4);
		i4 = null;
		Item i5 = new Item(5);
		i1 = null;
		System.gc();
		Item i6 = new Item(6);
	}

}
