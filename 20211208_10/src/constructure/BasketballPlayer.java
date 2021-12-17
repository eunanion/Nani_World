package constructure;

public class BasketballPlayer {

	public int height;
	public int jumpHeight;// 변수는 첫단어 첫글자는 소문자,
	                     // 이후 단어 첫글자는 대문자 나머지는 소문자
	                       //카멜케이스라 부른다
	
	
    //생성자 생성
	public BasketballPlayer(int h, int j) {
		
		height=h;
		jumpHeight=j;
		System.out.println("생선된 선수 키 : "+height+", 점프력: "+
		jumpHeight+" 입니다");
	}
	//덩크슛 행동(동작) 추가
	public void dunkShoot() {
		if((height+jumpHeight) > 300 ) {
		 System.out.println("덩크슛 성공!");}
		else 
		{System.out.println("아쉽네요");}
		
		
	}
	}
	