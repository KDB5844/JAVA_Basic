package ex01;

import java.util.HashSet;
import java.util.Iterator;

class Info{
	String name;
	int age;
	Info(String name, int age){
		this.name = name; this.age = age;
	}
	public String toString() {
		return "["+ name + ", "+ age + "]";
	}
	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}
	@Override
	public boolean equals(Object obj) {

	    if (obj == null) {
	        return false;
	    }

	    if (this.getClass() != obj.getClass()) {
	        return false;
	    }

	    if (this == obj) {
	        
	        return true;
	    }

	    Info that = (Info) obj;

	    if (this.name == null && that.name != null) {
	        return false;
	    }

	    if (this.age == that.age && this.name.equals(that.name)) {
	        
	        return true;
	    }

	    return false;
	}
}
public class Ex03 {
	public static void main(String[] args) {
		
		Info[] arr = new Info[3];
		arr[0] = new Info("ȫ�浿", 20);
		arr[1] = new Info("ȫ�浿", 20);
		arr[2] = new Info("ȫ�浿", 20);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("==========");
		HashSet<Info> hs = new HashSet<Info>();
		hs.add(arr[0]);
		hs.add(arr[1]);
		hs.add(arr[2]);
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
