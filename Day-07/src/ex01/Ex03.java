package ex01;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		Random random = new Random();	//랜덤객체 생성
		int lotto1 = 0;
		
		for(int i = 0; i < 5; i++) {
			do{	
				lotto1 = random.nextInt(45) + 1;
				System.out.print(lotto1 + i);
				
			}while()
		}
		
		
		//중복 값이 없도록 만들어보세요
	}
}
