package ex01;


import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Random;
import java.util.HashMap;

public class HashSetLotto {
    public static void main(String[] args) {
    	HashSet<Integer> set = new HashSet<Integer>();
    	ArrayList <Integer> al = new ArrayList <Integer>();
    	Random ran = new Random();
    	HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
    	HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();
    	Iterator it = hm.keySet().iterator();
    	int cnt = 1;
    	int count = 1;
    	
    	
    	for(int j = 0; j < 100; j++) {
    		while(set.size()<7){
    			Integer i1 = ran.nextInt(45)+1;
    			set.add(i1);
    		}
    		al.addAll(set);
    		ArrayList <Integer> al1 = new ArrayList <Integer>();
    		al1.addAll(al.subList((j*7), (j+1)*7));		//이상 / 미만
    		
    		hm.put(j+1, al1);
    		set.clear();
    		hm1.put(cnt, 0);
    	}
    	for ( Integer key : hm.keySet() ) {
    	    System.out.println("■"+key +"회차■" + "    Number : " + hm.get(key));
    	}
    	System.out.println("=============================");
    	System.out.println("당첨숫자 빈도 ");
    	System.out.println("=============================");
    	
    	for(int i = 1; i < hm.size(); i++){ 
    		for(int j = i + 1; j < hm.size(); j++){ 
    			if(hm.values().equals(hm1.values())){ 
    				count++; 
    			} 
    		} 
    		if(al.get(i).equals(" ")){ 
    			al.add("Space" + "-" + count); 
    		} 
    		else{ 
    			al.add(al.get(i) + "-" + count); 
    		} 
    		count = 1; 
    	} 
    	
       } 
}
