
public class DataDouble43P {
                public static void main(String[] args) {
					//실수 표현을 할 때는 float, double 자료형을 씁니다.
                	//기본적으로 대입할 목적으로 숫자를 적으면 double로 간주됩니다.
                	//만약 float 형으로 실수 숫자를 적고싶다면
                	//숫자 가장 오른쪽에 F라고 추가로 적어줍니다.
                	
                	
                	float a = 1.1f; // 좌변의 a변수에 double 1.1을 넣으려해서 에러발생(f붙여야함)
                	double b = 1.1; 
                	System.out.println(a);
                	System.out.println(b);
                	
                	// 제대로 표현되지 않는 실수
                	
                	double c = 1-0.1*7; // 원래 답은 0.3 출력은 0.299999~3 
                	                    // 0.3은 2진수로 표현 불가능
                	
                	System.out.println(c);
				}
}
