package constructure;

public class Webtoon {
	public String name;
	public int series;
	public String painter;
	public boolean complete;
	
 
	public Webtoon(String n, String p ) {
		name = n;
		series = 1;
		painter = p;
		complete = false;
		
		
		System.out.println("제목은 " + name
				+ "시리즈는 "+ series + " 회차"
				+ " 작가는 "+painter + " 완결여부 "+ 
				complete + " 입니다. ");
	}
	public void uploadWebton() {
		
		series += 1;
		System.out.println("현재 회차는 "+ series + " 입니다");
		
	}
	public void completeWebton() {
		if (series > 10) {
			complete = true;
			System.out.println("완결되었습니다.");
		}
	}

}
