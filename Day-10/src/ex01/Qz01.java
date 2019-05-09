package ex01;

/*
 *	어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의.
 *	예를 들어 d(91) = 9 + 1 + 91 + 101 과 같은 식이 있을 때 n을 d(n)의 제너레이터(generator)라고 함.
 *	위의 예에서 91은 101의 제너레이터이다.
 *	어떤 숫자 
 * 
 */

public class Qz01 {
	public static void main(String[] args) {
		int[] arr = new int[10000];
		
		for(int n = 1; n<arr.length; n++) {
			if(d(n) >= 10000)
				continue;
			
			arr[d(n)] = 1;
		}
		
		for(int n=1; n<arr.length; n++) {
			if(arr[n] == 0)
				System.out.println(n);
		}
	}
	
	public static int d(int n) {
		int w = n/1000;
		int x = (n%1000) / 100;
		int y = (n%100) / 10;
		int z = n%10;
		
		return n+w+x+y+z;
	}
	
	
	
	
	
	
}
