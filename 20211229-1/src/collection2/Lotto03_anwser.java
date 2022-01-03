package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto03_anwser {
	
	
	public static void main(String[] args) {
		
		List<Integer> lotto = new ArrayList<>();
		List<Integer> luckyNum = new ArrayList<>();
		
		int getNum = 0;
		int getNum2 = 0;
		int count = 0;
	    
		   while(lotto.size() != 6) {
			getNum = (int)(Math.random() * 45) + 1;
			if(!lotto.contains(getNum)) {
				lotto.add(getNum);
			}
			
		}
		Collections.sort(lotto);
		
		while(!lotto.equals(luckyNum)) {
		 luckyNum.clear();
		 while(luckyNum.size() != 6) {
			getNum2 = (int)(Math.random() * 45) + 1;
			if(!luckyNum.contains(getNum2)) {
				luckyNum.add(getNum2);
				
			}	count++;
				 
	   	}Collections.sort(luckyNum);
	  
		}
		System.out.println(""+ lotto + luckyNum);
		System.out.println(count + " 번째 입니다");
		
	}
}
	
	

