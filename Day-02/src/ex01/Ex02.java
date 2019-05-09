package ex01;
//[Ctrl] + [Shift] + [o]
import java.util.Scanner;

/*
 *  Wrapper class : 기본자료형을 객체형태로 사용하기 위한 클래스
 * */

public class Ex02 {
	public static void main(String[] args) {
		//키보드 입력이 필요하면 선언
		Scanner sc = new Scanner(System.in);
		
		//정수를 입력받는 방법
		int n1 = Integer.parseInt(sc.nextLine());
		System.out.println(n1 + 1);
		//실수를 입력받는 방법
		float f1 = Float.parseFloat(sc.nextLine());
		System.out.println(f1 + 1);
		//문자하나를 입력받는 방법
		char ch = sc.nextLine().charAt(0);
		System.out.println(ch);
		//문자열을 입력받는 방법
		String str = sc.nextLine();
  		System.out.println(str);
  	}	
}     
	
