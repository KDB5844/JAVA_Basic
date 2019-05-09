package ex01;

/*
 * 사칙연산 계산기를 기능별로 메서드 만들기
 * 
 * */

public class Qz06 {
	public static int add(int n1, int n2) {
		int sum = 0;
		sum = n1+n2;
		return sum;
	}
	
	public static int sub(int n1, int n2) {
		int sum = 0;
		sum = n1-n2;
		return sum;
	}
	
	public static int mtp(int n1, int n2) {
		int sum = 0;
		sum = n1*n2;
		return sum;
	}
	public static int div(int n1, int n2) {
		int sum = 0;
		if(n2==0) {
			System.out.println("0으로 나눌수 없습니다.");
			return 0;
		}
		else {
		sum = n1/n2;
		return sum;
		}
	}
	
	
	public static void main(String[] args) {
		int ret = 0;
		int a = 10;
		int b = 10;
		ret = add(a, b);
		System.out.println(ret);
		
		int ret1 = 0;
		int a1 = 0;
		int b1 = 2;
		ret1 = sub(a1, b1);
		System.out.println(ret1);
		
		int ret2 = 0;
		int a2 = 10;
		int b2 = 10;
		ret2 = mtp(a2, b2);
		System.out.println(ret2);
		
		int ret3 = 0;
		int a3 = 10;
		int b3 = 0;
		ret3 = div(a3, b3);
		System.out.print(ret3);
		
		
	}
}
