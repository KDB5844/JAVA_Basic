package ex01;

import java.util.Scanner;

//	���� �Է� �޾� 1���� �Է� ���� �� ���� Ȧ���� ���� ��ȯ
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
		System.out.println("���� �Է��ϼ��� : ");
		int a = Integer.parseInt(sc.nextLine());
		ret = add(a);
		System.out.println(ret);
		
		
		
		
		
	}
}
