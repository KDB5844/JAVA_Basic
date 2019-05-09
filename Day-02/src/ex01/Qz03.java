package ex01;

import java.util.Scanner;

public class Qz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("합격 여부를 입력하세요");
		int n1 = Integer.parseInt(sc.nextLine());
		System.out.printf("당신은 ");
		System.out.printf((n1==1)?"합격":"불합격");
		System.out.printf(" 입니다");
	}
}

