package static2;

public class Asean {
	// 출석(check), 중간고사(midTerm), 기말고사(finalTerm) 변수선정해
	// 위 변수들은 개별 객체가 따로따로 관리하는 변수들
	// 공용 발표점수인 presentationScore를 static으로 만드세요
	// 이점수는 19점임니다
	//public으로 설정하면 바로 콘솔에출력해 조회가능하고
	//private인 경우는 오로지 static 메서드를 통해서만 조회가능
	// 생성자는 객체 생성시 출석, 중간고사, 기말고사 점수만 받아서 초기화
	// 일반 메서드로 showaseaninfo()생성 해주시되 성적전체를 콘솔에 조회하게
	// 하세요
	// 중간고사 : XX명, 기말고사 :YY점....
	// 위 요소 정의 후 Main01P276을 만들어서 구성원 4명을 만들어 활용 ㄱㄱ
	
	private int check;
	private int midTerm;
	private int finalTerm;
	
	private static int presentationScore = 19;
	
	public Asean(int check,int midTerm, int finalTerm) {
		this.check = check;
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
		
		
	}
	public void showAseanInfo() {
		System.out.println("출석 점수 : "+ check  + "중간고사 점수 : "+ midTerm + 
				"기말고사 점수 : " + finalTerm + "발표 점수 : " + presentationScore );
	}
	public static int getPresentationScore() {
		return presentationScore;
	}
	public static void setPresentationScore(int presentationScore) {
		Asean.presentationScore = presentationScore;
	}
	
	public static void showPre() {
		System.out.println("아세안조의 점수는 "+ presentationScore);
	}
	
	
	
	
}
