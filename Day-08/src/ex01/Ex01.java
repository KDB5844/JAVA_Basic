package ex01;

/*
 * 변수 : 하나의 데이터를 저장하는 공간
 * 배열 : (동일한 자료)의 데이터를 저장하는 (연속된 공간)
 * 배열은 객체(값/기능)
 * String객체
 * */
public class Ex01 {
	public static void main(String[] args) {
		//배열을 만드는 방법 3 가지
		//1. 초기화 배열 생성
		int[] a = {1,2,3};
		System.out.println(a[0]);
		System.out.println(a[1]);
		a[2] = 30;
		System.out.println(a[2]);
		
		//2. 배열 참조 선언 후 나중에 배열 생성
		char[] c = null;
		c = new char[] {'H','e','l','l','o'};
		
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);
		System.out.println(c[4]);
		
		//3. 배열 참고 선언 후 갯수만 이용해서 생성
		double[] d = null;
		d = new double[3];
		d[1] = 3.14;
		d[2] = 6.95;
		d[0] = 1.23;
		for(double tmp : d) {				//배열 0자리부터 tmp에 대입 그다음d가 tmp에 대입  
			System.out.println(tmp);		//그다음d가 tmp에 대입 없으면 종료
		}
	}
}
