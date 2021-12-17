
public class Ch2_6 {

	public static void main(String[] args) {
		
		
		int kor, eng , mat , tot;
		double avg;
		String name;
		
		
		avg = 0.0; 
		tot = 0;
		kor = 90;
		eng = 83;
		mat = 72;
		
		tot = kor + eng + mat ;
		avg =tot/3.0; // 3으로 나눌 경우 , 나눈값을 인트로 구하고, 그 값에 소숫점을 붙힘;
		
		System.out.println("name " + "홍길동");
		System.out.println("kor : " + kor + " eng : " + eng + "mat : " + mat);
		System.out.println("tot = "+ tot + "avg =  "+ Math.round(avg*1000)/1000.0);
	}

}
