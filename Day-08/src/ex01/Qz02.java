package ex01;

import java.util.Scanner;

//5���� �̸��� ���̸� �����ϰ� ����ϴ� ���α׷� �ۼ�
//�� ���� �ټ� ���� ������ �����ϰ� ����Ѵ�.

public class Qz02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int []arr = new int[5];
		String[] d = null;
		d = new String[5];
		
		for(int i = 0; i < arr.length; i++) {
			do {
				System.out.println((i+1)+"��° ���� �Է�");
				System.out.println("�̸� : ");
				String name = in.nextLine();
				d[i] = name;
				
				System.out.print("���� : ");
				arr[i] = Integer.parseInt(in.nextLine());
			}while(arr[i] < 0);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"����");
			System.out.println("�̸� : "+d[i]+","+"���� : "+arr[i]);
			
		}
	}
}
