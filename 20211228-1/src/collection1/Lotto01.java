package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto01 {

	public static void main(String[] args) {
		// 로또복권 추첨기를 만들어보세요
		// 로또복권 추첨기는 1~45 범위에서 겹치는 숫자 없이
		// 6개의 숫자를 뽑습니다.
		// 순서를 정렬해서 콘솔에 찍어주도록 만들어주세요
		// ArrayList의 정렬은 .sort() 대신
		// Collections.sort(ArrayList)를 사용합니다
		
		 List<Integer> lotto = new ArrayList<Integer>();
		
		 // 로또번호를 
		int getNum = 0;
		// while문 조건은 번호를 담은 ArrayList의 내부 요소 개수가 6이 되면 종료되도록
		while(lotto.size() != 6 ) {
			//번호 뽑기
		
			getNum = (int)(Math.random()*45 + 1);
			//번호가 만약에 기존에 뽑은 번호 목록에 포함되어있지 않다면
			if(!lotto.contains(getNum)) {
				lotto.add(getNum);//추가하기
			}
		}
		
		
		// 다 돌면 정렬하기
		Collections.sort(lotto);
		// 추첨번호 보여주기
		  

		System.out.println("당첨번호  : " + lotto);
		
		while(lotto.contains(getNum) ) {
			getNum = (int)(Math.random()*45 + 1);
		
		}
			System.out.println(getNum);
	 
	}

}

