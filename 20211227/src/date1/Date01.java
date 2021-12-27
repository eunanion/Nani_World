package date1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// Date는 날짜를 표현하는 클래스 입니다.
		// Date를 이용해 날짜자료를 받아오거나 넘겨주는것이 권장됩니다.
		// 사용시 import jave.util.Date를 해야합니다
		Date now = new Date();
		String strNow = now.toString();// 문자열로 바꾸기
		System.out.println(now);
		System.out.println(strNow);
		// 표현되는 양식을 바꿀 때 SimpleDateFormat을 활용합니다
		// import을 추가로 해야합니다. ctrl + space을 활용해주ㅜ세요
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss"); // 양식을 채워주야함 yyyy는 연도부터 MM-dd-hh-mm-ss
		String strNow2 = sdf.format(now);// 원래 만들어졌던 Date를, Format()에 넣어줌
		System.out.println(strNow2);
		// now 변수에 들어있는 출력을 2021년 12월 27일 aa시 bb분 cc초로 변경해서 콘솔에 찍어주세여ㅛ
		SimpleDateFormat sdf2 = 
				new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss"); // 양식을 채워주야함 yyyy는 연도부터 MM-dd-hh-mm-ss
		System.out.println(strNow2);
		
		String strNow3 = sdf2.format(now);
		System.out.println(strNow3);


	}

}
