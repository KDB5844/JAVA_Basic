package ex01;
//[Ctrl] + [Shift] + [o]
import java.util.Scanner;

/*
 *  Wrapper class : �⺻�ڷ����� ��ü���·� ����ϱ� ���� Ŭ����
 * */

public class Ex02 {
	public static void main(String[] args) {
		//Ű���� �Է��� �ʿ��ϸ� ����
		Scanner sc = new Scanner(System.in);
		
		//������ �Է¹޴� ���
		int n1 = Integer.parseInt(sc.nextLine());
		System.out.println(n1 + 1);
		//�Ǽ��� �Է¹޴� ���
		float f1 = Float.parseFloat(sc.nextLine());
		System.out.println(f1 + 1);
		//�����ϳ��� �Է¹޴� ���
		char ch = sc.nextLine().charAt(0);
		System.out.println(ch);
		//���ڿ��� �Է¹޴� ���
		String str = sc.nextLine();
  		System.out.println(str);
  	}	
}     
	
