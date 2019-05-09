package ex01;

public class Ex01 {
	public static int fac(int n) {
		if(n == 0) return 1;
		else if(n == 1)
					return 1;
		else 
					return fac(n-1) * n;
	}
	
	
	public static void main(String[] args) {
		int n = 4;
		System.out.println(fac(n));
	}
}
