package ex01;

import java.util.Scanner;
//�� �� ������ ��
public class Qz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �Է� �ϼ��� : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("�ι�° ���� �Է� �ϼ��� : ");
		int num2 = Integer.parseInt(sc.nextLine());
		int sum = 0;
		
	
		if(num1>num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		for(int i = num1+1; i<num2; i= i+1) {
			sum = sum+i;
		}
		
		System.out.println(num1+" �� "+num2+" ������ ���� : "+sum+" �Դϴ�.");
	}
}
