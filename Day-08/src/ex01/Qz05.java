package ex01;

import java.util.Scanner;

/*
 *�ֹε�Ϲ�ȣ ���� �ϱ�
 */
public class Qz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = null;
		num = new int[13];
		int[] num1 = null;
		int sum = 0;
		num1 = new int[] {2,3,4,5,6,7,8,9,2,3,4,5};
		
		for(int i = 0; i >= 13; i++ ) {
			for(int j = 0; i <= num.length; i++) {
				System.out.println("�ֹε�� ��ȣ�� �Է��ϼ��� : ");
				num[i] = Integer.parseInt(sc.nextLine());
			}	
				
				int su = num[i]*num1[i];
				sum += su;
		}
		int ans = 11-(sum%11);
		if(ans == num[13] && ans != 0 && ans != 1) {
			System.out.println("��ġ");
		}else
			System.out.println("����ġ");
	}
}