
public class OperandQ1 {

	public static void main(String[] args) {
		// 다음 조건을 만족하는 코드를 작성해주세요.
		// kor, math , eng , com 변수를 한 줄로 선언해주신다음 각각 
		// 80   55     65    85 를 대입해주시고
		// total 변수에 총점을 저장해주신 다음
		// 콘솔창에 평균 점수를 출력해주세요.
		//int kor =80, math =55, eng = 65 , com = 85;
		int kor,math,eng,com;
		kor=80;
		math=55;
		eng=65;
		com=85;
		
		System.out.println();
		
		int total = kor + math + eng + com ; 
		System.out.println(total/4.0);//4.0으로 나눠야 정확히 나눌수있음
		
		
	}

}
