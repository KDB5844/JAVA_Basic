package qz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		Random rd = new Random();
		hs.add(rd.nextInt(45)+1);
		hs.add(rd.nextInt(45)+1);
		hs.add(rd.nextInt(45)+1);
		hs.add(rd.nextInt(45)+1);
		hs.add(rd.nextInt(45)+1);
		hs.add(rd.nextInt(45)+1);
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
