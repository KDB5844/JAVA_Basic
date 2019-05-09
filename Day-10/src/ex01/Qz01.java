package ex01;

/*
 *	� �ڿ��� n�� ���� ��, d(n)�� n�� �� �ڸ��� ���ڵ�� n �ڽ��� ���� ���ڶ�� ����.
 *	���� ��� d(91) = 9 + 1 + 91 + 101 �� ���� ���� ���� �� n�� d(n)�� ���ʷ�����(generator)��� ��.
 *	���� ������ 91�� 101�� ���ʷ������̴�.
 *	� ���� 
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
