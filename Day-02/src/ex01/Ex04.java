package ex01;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int n1 = Integer.parseInt(sc.nextLine());
		if(n1%3==0) {
			System.out.println(n1+"�� 3�� ����Դϴ�.");
		}
			else {
				System.out.println(n1+"�� 3�� ����� �ƴմϴ�.");
			}
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int n2 = Integer.parseInt(sc.nextLine());
		if(n2%2==0) {
			System.out.println(n2+"�� ¦�� �Դϴ�.");
		}
		else {
			System.out.println(n2+"�� Ȧ�� �Դϴ�.");
		}
		
		System.out.println("ù��° ���ڸ� �Է��ϼ��� : ");
		int n3 = Integer.parseInt(sc.nextLine());
		System.out.println("�ι�° ���ڸ� �Է��ϼ��� : ");
		int n4 = Integer.parseInt(sc.nextLine());
		if(n3>n4) {
			System.out.println(n3+"��"+n4+"���� ū ���� �Դϴ�.");
		}
		else {
			System.out.println(n4+"��"+n3+"���� ū ���� �Դϴ�.");
		}
		System.out.println("ù ��° ���ڸ� �Է� �ϼ���");
		int n5 = Integer.parseInt(sc.nextLine());
		System.out.println("�� ��° ���ڸ� �Է� �ϼ���");
		int n6 = Integer.parseInt(sc.nextLine());
		System.out.println("�� ��° ���ڸ� �Է� �ϼ���");
		int n7 = Integer.parseInt(sc.nextLine());
		if(n5>n6) {
			if(n5>n6 && n5>n7) {
				if(n6>n7) {
					System.out.println("ū ������ : "+n5+"����"+n6+"����"+n7+"�̴�");
				}
				else {
					System.out.println("ū ������ : "+n5+"����"+n7+"����"+n6+"�̴�");
				}
			}
			else if(n6>n5 && n6 > n7) {
				if(n5>n7) {
					System.out.println("ū ������ : "+n6+"����"+n5+"����"+n7+"�̴�");
				}
				else{
					System.out.println("ū ������ : "+n6+"����"+n7+"����"+n6+"�̴�");
				}
			}
		}
			if(n7>n6 && n7>n5) {
				if(n6>n5) {
					System.out.println("ū ������ : "+n7+"���� "+n6+"���� "+n5+"���̴�");
				}
				else {
					System.out.println("ū ������ : "+n6+"���� "+n5+"���� "+n6+"���̴�");
				}
			}
		
			System.out.println("ù ��° ���ڸ� �Է��ϼ��� : ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.println("�� ��° ���ڸ� �Է��ϼ��� : ");
			int num2 = Integer.parseInt(sc.nextLine());
			if(num1>num2 && num1%2==0) {
				System.out.println(num1+"�� �� ū���̰� ¦���̴�.");
			}
			else {
				System.out.println("");
			}
			if(num2>num1 && num2%2==0) {
				System.out.println(num2+"�� �� ū���̰� ¦���̴�.");
			}
			else {
				System.out.println("������ ū���� ¦������ �ʽ��ϴ�.");
			}
			
			
			
			System.out.println("ù ���� ���ڸ� �Է��ϼ��� : ");
			int num3 = Integer.parseInt(sc.nextLine());
			System.out.println("�� ���� ���ڸ� �Է��ϼ��� : ");
			int num4 = Integer.parseInt(sc.nextLine());
			int sum = num3 + num4;
			if(sum%2==0 && sum%3==0 ) {
				System.out.println(sum + "�� ���� ¦���̰� 3�� ����̴�.");
			}
			else {
				System.out.println(sum + "�� ���� ¦���̰� 3�� ������� �ʽ��ϴ�.");
			}
		
			
			System.out.println("���ڸ� �Է��ϼ���");
			int num5 = Integer.parseInt(sc.nextLine());
			if(num5%3==0 && num5%5==0) {
				System.out.println(num5 + "�� 3�ǹ�� �̸鼭 5�� ����̴�.");
			}
			else {
				System.out.println("3�� ����̸鼭 5�� ����� �ƴմϴ�.");
			}
		}
	
	
	}




