package structure;

public class Car { //정의부 
	
      // 멤버 변수
	  // 멤버변수는 어떤 특정한 사용이나 객체의 "상태"를 나타낸다
	public String model; //== null
	public int price; // == 0
	public String owner; // == null
	
	// 멤버 메서드 어떤 특정한 사물과 객체의 "동작"을 나타낸다
	
	public void getInfo() {
		
		System.out.println(owner + " 의 차 정보입니다.");
		System.out.println("모델명 : "+ model +
				", 가격 : "+ price + "억원");
		
	}
	
}
