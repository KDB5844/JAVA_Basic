package ex01;
import java.util.Scanner;


public class Ex04T {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("첫 번째 수:");
		int n1 = Integer.parseInt(in.nextLine());
		System.out.print("두 번째 수:");
		int n2 = Integer.parseInt(in.nextLine());
		System.out.print("세 번째 수:");
		int n3 = Integer.parseInt(in.nextLine());
		
		if( n2 >= n1 && n2 >= n3 ) {
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		}else if( n3 >= n1 && n3 >= n2 ) {
			int tmp = n1;
			n1 = n3;
			n3 = tmp;
		}
		if( n3 > n2 ) {
			int tmp = n2;
			n2 = n3;
			n3 = tmp;
		}
		System.out.println(n1+">"+n2+">"+n3);

		
		System.out.print("수 입력:");
		int n = Integer.parseInt(in.nextLine());
		
		if( n%3 != 0 || n%5 == 0) {
			System.out.println(n);
	}
	}
}


