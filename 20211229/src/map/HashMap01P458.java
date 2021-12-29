package map;

import java.util.HashMap;
import java.util.Map;

public class HashMap01P458 {

	public static void main(String[] args) {
		// Map 인터페이스의 대표 구현체는 HashMap 입니다.
		// 제네릭 내부에는 <key자료형, Value자료형> 으로 작성합니다.
		
		Map<String, String> map = new HashMap<>();
		map.put("채종훈", "코로나");
		map.put("아이즈원", "장원영");
		map.put("트와이스", "미나");
		System.out.println(map);
		
		// 자료조회시는 .get(key 값)으로 조회합니다.
		// map은 키로 벨류를 조회하는건 가능하지만 역으로 벨류로 키를 조회하는건 불가능합니다
		// 없는 키 값으로 조회하면 null이 나온다
		// 인덱스 번호도 없습니다
		
		System.out.println(map.get("채종훈"));
		
		//파이썬에서는 dictionary 함수로 쓰임
		
		map.remove("아이즈원");
		System.out.println(map);

	}

}
