package ex01;

import java.util.HashSet;
import java.util.Iterator;

public class Ex94 {

	public static void main(String[] args) {
		Info[] arr = new Info[3];
		arr[0] = new Info("ȫ�浿", 20);
		arr[1] = new Info("ȫ�浿", 20);
		arr[2] = new Info("ȫ�浿", 20);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("==========");
		HashSet hs1 = new HashSet();
		String s1 = new String("hello");
		String s2 = new String("hello");
		String s3 = new String("hello");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		
		hs1.add(s1);
		hs1.add(s2);
		hs1.add(s3);
		
		for(Object tmp : hs1) {
			System.out.println(tmp);
		}
		
		System.out.println("================");
//		System.out.println(arr[0].hashCode());
//		System.out.println(arr[1].hashCode());
//		System.out.println(arr[2].hashCode());
		
		HashSet hs = new HashSet();
		hs.add(arr[0]);
		hs.add(arr[1]);
		hs.add(arr[2]);
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}


