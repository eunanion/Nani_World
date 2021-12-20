package heterogeneous;

public class HeterogeneousArray {

	public static void main(String[] args) {
		
		// int[] 에는 정수만 넣을수 있음
		int[] iArr = { 1, 2, 3, 4, 5, 6,7, 8, 9, 10};
		//int[] intArr = {"a","b",1,2,}; 문자열이 있어서 에러 발생
		
		
		// iArr 향상된 for문으로 출력해보세요
		
		for(int i : iArr ) {
			System.out.print(i + ",");
			
		}
		System.out.println();
		// 여러 자료형을 받을 수 있도록 모든 클래스의 부모인 object로 배열생성
		// object는 다형성의 원리에 의해 모든 자료를 저장받을수 있다
		Object[] oArr = {"a","b",1,2,3.0,5.1};
		for(Object value : oArr) {
			System.out.print(","+ value);
		}

	}

}
