package ex01;

import java.util.Scanner;
//실수를 입력 받아 출력하시오
//자신의 이니셜을 입력 받아 출력하시오
//3과목의 성적을 입력 받아 합계와 평균을 구하시오.

/*casting
float f1 = (float) (sum / 3.0);
float f1 = sum / 3.0f;
*/
public class Qz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1과목 성적을 입력하세요");
		float f1 = Float.parseFloat(sc.nextLine());
		System.out.println("2과목 성적을 입력하세요");
		float f2 = Float.parseFloat(sc.nextLine());
		System.out.println("3과목 성적을 입력하세요");
		float f3 = Float.parseFloat(sc.nextLine());
		
		System.out.println("자신의 이니셜을 입력하세요");
		String init1 = sc.nextLine(); 
		
		System.out.println(init1+"의 성적 총점수는 :"+(f1+f2+f3)+"점"+"  평균은"+(f1+f2+f3)/2+"점 입니다");
	}
}

