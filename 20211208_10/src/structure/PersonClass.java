package structure;

public class PersonClass {//정의부
	
	
	//사람 정보를 Person에서 만들었던것 처럼 만들어주되 
	// 추가하고싶은 특성을 하나 더 추가해주세요
	
	//추가로 아까의 조회 매서드를 내부에 생성하세요
	//클래스 내부에 생성할떄는 static을 적지 않습니다
	//클래스는 자기와 같은 지역에 있는 요소를 소속 명시 없이 조회 가능합니다.
	
	public String name;
    public int age ;
    public String pNum;
    public int uNum;
    public boolean glasses; // 안경 착용 여부 / 착용 ture , 미착용 false
    
    public void getInfo() { //<<여기 비워둬야함 {
    	System.out.println(name + " 의 정보를 조회합니다");
    	System.out.println("이름 : "+  name +
    			", 나이 : " + age +
    			", 폰번호 : " + pNum +
    			". 회원번호 : "+ uNum +
    			", 안경착용" + glasses);
    	System.out.println("==========================");

    	
    	/// heap 에는 총 6개의 정보가 저장 // () = 0,null의 의미
	}

}
