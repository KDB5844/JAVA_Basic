package ex01;
/*
 * ���� �ϳ��� �Է� �޾Ƽ� �� ���ڰ� ��� ���������� �ƴ����� �Ǵ��ϴ� ���α׷��� ����ÿ�.
 * -��������ڸ� �Է��ϼ���(+,-,*,/,%):+
 * -+�� ����������Դϴ�.
 * -��������ڸ� �Է��ϼ���(+,-,*,/,%) : a
 * -a�� ��������ڰ��ƴմϴ�.
 * */

import java.util.Scanner;

public class Qz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ڸ� �Է��ϼ���.");
		char ch = sc.nextLine().charAt(0);
		System.out.print(ch+"�� ");
		System.out.println(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='*'
				?" ��� �����ڴ�":" ��� ���� �ƴϴ�.");
		
		
		
		
	}
}
