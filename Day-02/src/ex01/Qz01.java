package ex01;

import java.util.Scanner;
//�Ǽ��� �Է� �޾� ����Ͻÿ�
//�ڽ��� �̴ϼ��� �Է� �޾� ����Ͻÿ�
//3������ ������ �Է� �޾� �հ�� ����� ���Ͻÿ�.

/*casting
float f1 = (float) (sum / 3.0);
float f1 = sum / 3.0f;
*/
public class Qz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� ������ �Է��ϼ���");
		float f1 = Float.parseFloat(sc.nextLine());
		System.out.println("2���� ������ �Է��ϼ���");
		float f2 = Float.parseFloat(sc.nextLine());
		System.out.println("3���� ������ �Է��ϼ���");
		float f3 = Float.parseFloat(sc.nextLine());
		
		System.out.println("�ڽ��� �̴ϼ��� �Է��ϼ���");
		String init1 = sc.nextLine(); 
		
		System.out.println(init1+"�� ���� �������� :"+(f1+f2+f3)+"��"+"  �����"+(f1+f2+f3)/2+"�� �Դϴ�");
	}
}

