package ex01;

public class Ex02 {
	
	public static int add(int n1, int n2) {
		int ret = 0;
		for(int i = n1+1; i <n2; i++) {
			ret += i;
		}return ret;
	}
	
	public static void main(String[] args) {
		int ret = 0;
		int a1 = 1;
		int a2 = 11;
		ret = add(a1, a2);
		System.out.println(ret);
		
	}
}
