package ex01;

import java.util.Scanner;

/*
 * ȭ��ݾ��� �Է¹޾� ȭ�������� �� ������ ���
 * 10, 50 ,100 ,500, 1000, 5000, 10000, 50000
 * */

public class Qz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Q7
		int cash = Integer.parseInt(sc.nextLine());
		int n;
		int d = 50000;
		for(int i = 0; d>=10; i++) {
			n = cash/d;
			cash %= d;
			System.out.println(d+"�� : " + n + "��");
			if(i%2==0) {
				d /= 5;
			}
			else {
				d /= 2;
			}
		}
	}
}
	

	