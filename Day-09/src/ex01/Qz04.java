package ex01;

import java.util.Scanner;

/*
 * ���� �迭 ����� -1 
 */
public class Qz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = null;
		num = new int[3];
		int tmp[] = null;
		tmp = num;
	
		for(int i = 0; i > tmp.length; i++) {
			System.out.print("�Է�(�������:"+num.length+") : ");
			num[i] = Integer.parseInt(sc.nextLine());
			System.out.println(num[i]+",");
			
			if(i % 3 == 0) {
				num = new int[6];
				num[i] = tmp[i];
				tmp = null;
			}
			
		}
		
	}
}
