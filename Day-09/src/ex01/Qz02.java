package ex01;

import java.util.Scanner;

//�Է� ���� �� ��ŭ �迭�� �Ҵ��ϰ� �迭�� �� �Է� �� ����ϱ�

public class Qz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num1 = null;
		int and = 0;
		
		System.out.print("������ �迭�� ���̸� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());
		num1 = new int[num];
		System.out.println(num+"���� �迭�� �����Ǿ����ϴ�.");
		for(int i = 0; i < num; i++) {
			System.out.print((i+1)+"��° �� : ");
			int num3 = Integer.parseInt(sc.nextLine());
			num1[i] = num3;
			System.out.println("");
		}
		System.out.print("�迭�� �Էµ� ���� : ");
		for(int i = 0; i < num; i++) {
			System.out.print(num1[i]+" ");
		}
		System.out.println("�Դϴ�.");
	
		System.out.print("���� �� ���� : ");
		 int min;
		 int tmp;
		    for (int i = 0; i < num1.length - 1; i++) {
		      min = i;
		      for (int j = i + 1; j < num1.length; j++) {
		        if (num1[j] < num1[min])
		          min = j;
		      }
		      tmp = num1[i];
		      num1[i] = num1[min];
		      num1[min] = tmp;
		    }
		    for(int i = 0; i < num; i++) {
		    	System.out.print(num1[i]+" ");
		    }
		System.out.println("�Դϴ�.");
	}
}
