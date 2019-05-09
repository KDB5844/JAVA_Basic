package ex01;

import java.util.Scanner;

//당신의 이름은 무엇입니까 : 입력 : 홍길동
//홍길동님의 나이는 몇 살입니까? 입력 : 18
//출력 : 홍길동님의 나이는 18살입니다.
public class Qz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("당신의 이름은 무엇입니까?");
		String name = sc.nextLine();
		System.out.println(name+"님의 나이는 몇 살 입니까?");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println(name+"님의 나이는 "+age+"살 입니다.");
		
		
	}
}
