package ex01;

import java.util.Scanner;

//����� �̸��� �����Դϱ� : �Է� : ȫ�浿
//ȫ�浿���� ���̴� �� ���Դϱ�? �Է� : 18
//��� : ȫ�浿���� ���̴� 18���Դϴ�.
public class Qz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("����� �̸��� �����Դϱ�?");
		String name = sc.nextLine();
		System.out.println(name+"���� ���̴� �� �� �Դϱ�?");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println(name+"���� ���̴� "+age+"�� �Դϴ�.");
		
		
	}
}
