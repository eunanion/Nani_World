package map;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요.
		// key는 음식이름, valuse는 가격(정수로) 저장해주세요
		// 메뉴는 5개 이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.

		Map<String,Integer> menu = new HashMap<>();
		
		menu.put("짜장면", 5000);
		menu.put("짬뽕", 6000);
		menu.put("볶음밥", 7000);
		menu.put("탕수육", 22000);
		menu.put("고추잡채", 25000);
		
		System.out.println(menu.get("짜장면"));
		System.out.println(menu.get("볶음밥"));

		System.out.println(menu.get("탕수육"));

		
		
		

	}

}
