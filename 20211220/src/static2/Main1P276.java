package static2;

public class Main1P276 {

	public static void main(String[] args) {
		Asean.showPre();
		// 객체생성없이도 static영역에서 바로 메서드 실행가능
		System.out.println(Asean.getPresentationScore() );
		
		Asean a1 = new Asean(20,100,90);
		Asean a2 = new Asean(18,70,100);
	    Asean a3 = new Asean(19,40,100);
	    Asean a4 = new Asean(19,30,50);
	    
	    a1.showAseanInfo();
	    a2.showAseanInfo();
	    a3.showAseanInfo();
	    a4.showAseanInfo();
	}

}
