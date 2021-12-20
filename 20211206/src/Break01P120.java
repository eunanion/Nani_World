
public class Break01P120 {

	public static void main(String[] args) {
		// Break문은 반복문 내부에 실행되는 경우 즉시 반복문을 종료시킨다
		// break문은 중첩반복문에서 사용시 전체 종료가 아닌 
		// break문이 속한 반복문만 종료시킨다
		
		int a = 1;
		int[] arr= {8,9,1,6,5,4,8,4};
		
		for (int num : arr) {
			if (a==num) {
				System.out.println("1이 나와서 종료합니다");
				break;
			}
			System.out.println("이번 숫자는 " + num + " 입니다.");
		}

	}

}
