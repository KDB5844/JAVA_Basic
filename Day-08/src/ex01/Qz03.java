package ex01;




public class Qz03 {
	public static void main(String[] args) {
		
		
		int Lotto[] = new int[6]; //�迭����
		
		System.out.print("Lotto ���� ���ڴ� : ");
		
		for(int i = 0; i < Lotto.length; i++) {
			Lotto[i] = (int)(Math.random()*45)+1;
			
		for(int j = 0; j < i; j++){
			if(Lotto[i]==Lotto[j]){
				i--;
				break;
				}
			}	
		}
		for(int i = 0; i < Lotto.length; i++) {
			System.out.print(Lotto[i]+" ");
		}
		System.out.println("�Դϴ�.");
	}
}
//1. 45�� �迭 �־ ����
//2. flag ( 45�� �迭 �Ҹ� f) 


