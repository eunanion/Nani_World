package system1;

public class TimeCheck02P384 {

	public static void main(String[] args) {
		// try~catch 구문의 소요시간을 구해주세요
		// 내부에는 여러분들이 원하는 속성의 예외를 발생시키세요
		// throw구문으로 발생시키면 됨
		long start = System.currentTimeMillis();
		System.out.println("시작시간 "+ start);

		int randomNum =  (int)(Math.random() * 10);
		System.out.println("나온 난수값 : "+ randomNum); 
	
        try {
			
			
			if(randomNum > 3) {
				throw new ArrayIndexOutOfBoundsException();
			} else {
				System.out.println("정상 범위 난수 발생");
			}
		} catch (Exception e) {
			System.out.println("없던 예외를 만들었습니다.");
			
			
			
			
		}
		long end = System.currentTimeMillis();
		System.out.println("끝난시간 : "+ end);
		System.out.println("소요시간 : "+ 	(end - start));
 
	}
	    

	}



