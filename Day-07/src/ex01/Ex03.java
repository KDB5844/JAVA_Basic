package ex01;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		Random random = new Random();	//������ü ����
		int lotto1 = 0;
		
		for(int i = 0; i < 5; i++) {
			do{	
				lotto1 = random.nextInt(45) + 1;
				System.out.print(lotto1 + i);
				
			}while()
		}
		
		
		//�ߺ� ���� ������ ��������
	}
}
