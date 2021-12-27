package arrays1;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// 이진 탐색(binary search)은 탐색 알고리즘중
		// 상위권의 성능을 보여주는 알고리즘 입니다.
		// 다만, 실행에 앞선 전체조건으로
		// 1.배열 내부에 중복되는 값이 없을것
		// 2.배열이 오름차순(작은 숫자일수록 0번 인덱스에 가깝게) 여야한다.
		// 정렬이 안 된 상태의 배열 내부를 탐색할 때는 찾지 못함
		// 정렬이 안 된 상태의 배열 내부를 탐색할 때는 찾지 못함
		
		int[] arr1 = {5,7,6,1,3,4,0,12};
		
		// 이진 탐색 수행 명령어 : Arrays.binarysearch(배열명, 찾는값);
		
		int a = Arrays.binarySearch(arr1, 0);
		System.out.println(a);
		// 왜 a가 -1 이 나오는지 알고리즘을 시각적으로 이해해보자 -> "이진탐색" 구글링 or 네이버 검색
		int[] arr2 = {0,2,30,34,36,40,45,623,2341,2342332,1212312};
		int b =Arrays.binarySearch(arr2, 2341);
		System.out.println(b);
		
	

	}

}
