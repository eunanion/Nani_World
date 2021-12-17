
public class Datainteger36P {
             public static void main(String[] args) {
				// 정수는 자료형의 크기에 따른 비트 갯수에 따라 표현 범위가 달라집니다.
            	 // 2의 보수 방식을 취하기 떄문에 그렇습니다.
            	 // 범위를 넘지 않도록 주의 해주세여.ㅣ
            	 
            	 byte a = -128; // byte -128 ~+127
            	 System.out.println(a);
            	 
            	 // 우리가 그냥 숫자를 적으면 int로 간주됩니다.
            	 // 그래서 int범위를 벗어난 값은 long형에는 대입이 안됩니다.
            	 // long b = 2500000000; //int로 간주된 상태
            	 
            	 long b = 2500000000L; // 액면뒤에 L을 추가로 넣어줘야한다.
            	  
            	 System.out.println(b);
			}
}
