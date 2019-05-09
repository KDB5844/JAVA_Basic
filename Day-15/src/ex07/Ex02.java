package ex07;

public class Ex02 {
	public static void main(String[] args) {
		개 dog = new 개();
		고양이 cat = new 고양이();
		
		동물[] anis = new 동물[2];
		anis[0] = dog;
		anis[1] = cat;
	 	
		for(int i = 0; i < anis.length; i++) {
			System.out.println(anis[i] + "객체");
			anis[i].움직인다();
			anis[i].운다();
		}
		
		/*
		 * 다형성(多形性)
		 *  - 하나의 타입(자료형)으로 다양한 형태의 자료를 관리할 수 있는 개념
		 * 추상화(일반화)
		 */
	}
}
