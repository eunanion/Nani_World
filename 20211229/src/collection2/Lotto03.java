package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto03 {
	
	public static void main(String[] args) {
		
		List<Integer> lotto = new ArrayList<>();
		List<Integer> winNum = new ArrayList<>();
		
		int getNum = 0;
		winNum.add(2);
		winNum.add(17);
		winNum.add(25);
		winNum.add(29);
		winNum.add(30);
		winNum.add(46);
		int i = 0;
		
		while(!lotto.equals(winNum)) {
		    
			while(lotto.size() != 6) {
			
			getNum = (int)(Math.random() * 45) + 1;
			if(!lotto.contains(getNum)) {
			
				lotto.add(getNum);
			
			}
			i++;
			
		}
		
	      	Collections.sort(lotto);
	      	
	      	 if(lotto.equals(winNum)) {
	      	System.out.println(i+"당첨을 축하합니다");
	      	 }else{ 
	      		 lotto.remove(0);
	      		 lotto.remove(0);
	      		 lotto.remove(0);
	      		 lotto.remove(0);
	      		 lotto.remove(0);
	      		 lotto.remove(0);
	      	 }
		               
		
		}
	    
	    
		
		
		}
			
	}

