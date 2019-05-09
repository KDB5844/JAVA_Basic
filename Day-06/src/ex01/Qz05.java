package ex01;

/*
 *메서드 오버로딩
 *정수(int) 두개 입력 받아 더한 값을 반환
 *실수(float) ""
 *정수1 실수1 ""
 *실수1 정수1 ""
 */

public class Qz05 {
	public static int meth(int a, int b) {
		int sum = 0;
		sum = a + b;
		return sum;
	}
	public static float meth(float c, float d) {
		float sum = 0;
		sum = c + d;
		return sum;
	}
	public static int meth(int e, float f) {
		int sum = 0;
		sum = (int) (e + f);
		return sum;
	}
	public static int meth(float g, int h) {
		int sum = 0;
		sum = (int)(g + h);
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		
	}

}
