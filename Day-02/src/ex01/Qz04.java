package ex01;
/*
 * 문자 하나를 입력 받아서 그 문자가 산술 연산자인지 아닌지를 판단하는 프로그램을 만드시오.
 * -산술연산자를 입력하세요(+,-,*,/,%):+
 * -+는 산술연산자입니다.
 * -산술연산자를 입력하세요(+,-,*,/,%) : a
 * -a는 산술연산자가아닙니다.
 * */

import java.util.Scanner;

public class Qz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("산술연산자를 입력하세요.");
		char ch = sc.nextLine().charAt(0);
		System.out.print(ch+"는 ");
		System.out.println(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='*'
				?" 산술 연산자다":" 산술 연산 아니다.");
		
		
		
		
	}
}
