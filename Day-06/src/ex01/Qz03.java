package ex01;

import java.util.Scanner;

//	수를 입력 받아 1부터 입력 받은 수 까지 홀수의 합을 반환
public class Qz03 {
	
	public static int add(int n1) {
		int sum = 0;
			for(int i = 1; i<=n1; i+=2) {
				sum += i;
			System.out.println(i+",");
			}
			return sum;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ret = 0;
		System.out.println("수를 입력하세요 : ");
		int a = Integer.parseInt(sc.nextLine());
		ret = add(a);
		System.out.println(ret);
		
		
		
		
		
	}
}
