package ex01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {		 
		HashSet<Integer> lotto = new HashSet<Integer>();
		Random random = new Random();
		
			while(true) {
				lotto.add(random.nextInt(45)+1);
				if(lotto.size() == 7) break;
			}
		
		
		Integer[] lottoArray = lotto.toArray(new Integer[]);
		
		Arrays.sort(lottoArray);
		System.out.print("행운의 숫자 : ");
		for(Integer number:lottoArray) {
			System.out.print(number + " ");
		
		}
	}
}