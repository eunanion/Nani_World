
public class EnhancedFor02P162 {

	public static void main(String[] args) {
		// 다음의 학생들의 과목별 성적입니다.
		// math = 96, 23 , 52 ,82 , 72 , 31
		// eng= 62, 42 , 68 , 31 , 80 , 77 , 45
		// com = 10, 28 ,39, 74, 65, 90, 98
		//위 3개의 명칭으로 array를 만들어 주신다음
		// 과목별 평균점수를 enhanced for 문을 이용해 구현해
		// 콘솔창에 출력하세요
		
		int[] math = {96,23,52,82,72,31};
		int[] eng = {62,42,68,31,80,77,45};
		int[] com = {10, 28 ,39, 74, 65, 90, 98};

		int total =0;
		for (int i =0 ; i < math.length; i++) {
			total += math[i];
					
		}
		
		System.out.println("수학 평균점수는 " + total/math.length);		
		
		
		
		
		/*for (int score : math){
			 total += score;
		
		}
		System.out.println("수학 평균점수는 " + total/math.length);
		
		total  0; */
		
		
		
		for (int score1 : eng){
			 total += score1;
		
		}
		
		System.out.println("영어 평균점수는 " + total/eng.length);
		
		total = 0;
		
	

		for (int score2 : com){
			 total += score2;
		
		}
		double a = (double) total/com.length;
		System.out.println("사회 평균점수는 " +  Math.round(a*1000)/1000.0);
		
	  total = 0;
		

	}

}
