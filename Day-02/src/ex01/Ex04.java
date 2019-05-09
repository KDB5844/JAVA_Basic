package ex01;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int n1 = Integer.parseInt(sc.nextLine());
		if(n1%3==0) {
			System.out.println(n1+"은 3의 배수입니다.");
		}
			else {
				System.out.println(n1+"은 3의 배수가 아닙니다.");
			}
		
		System.out.println("숫자를 입력하세요 : ");
		int n2 = Integer.parseInt(sc.nextLine());
		if(n2%2==0) {
			System.out.println(n2+"는 짝수 입니다.");
		}
		else {
			System.out.println(n2+"는 홀수 입니다.");
		}
		
		System.out.println("첫번째 숫자를 입력하세요 : ");
		int n3 = Integer.parseInt(sc.nextLine());
		System.out.println("두번째 숫자를 입력하세요 : ");
		int n4 = Integer.parseInt(sc.nextLine());
		if(n3>n4) {
			System.out.println(n3+"이"+n4+"보다 큰 숫자 입니다.");
		}
		else {
			System.out.println(n4+"이"+n3+"보다 큰 숫자 입니다.");
		}
		System.out.println("첫 번째 숫자를 입력 하세요");
		int n5 = Integer.parseInt(sc.nextLine());
		System.out.println("두 번째 숫자를 입력 하세요");
		int n6 = Integer.parseInt(sc.nextLine());
		System.out.println("세 번째 숫자를 입력 하세요");
		int n7 = Integer.parseInt(sc.nextLine());
		if(n5>n6) {
			if(n5>n6 && n5>n7) {
				if(n6>n7) {
					System.out.println("큰 순서는 : "+n5+"다음"+n6+"다음"+n7+"이다");
				}
				else {
					System.out.println("큰 순서는 : "+n5+"다음"+n7+"다음"+n6+"이다");
				}
			}
			else if(n6>n5 && n6 > n7) {
				if(n5>n7) {
					System.out.println("큰 순서는 : "+n6+"다음"+n5+"다음"+n7+"이다");
				}
				else{
					System.out.println("큰 순서는 : "+n6+"다음"+n7+"다음"+n6+"이다");
				}
			}
		}
			if(n7>n6 && n7>n5) {
				if(n6>n5) {
					System.out.println("큰 순서는 : "+n7+"다음 "+n6+"다음 "+n5+"순이다");
				}
				else {
					System.out.println("큰 순서는 : "+n6+"다음 "+n5+"다음 "+n6+"순이다");
				}
			}
		
			System.out.println("첫 번째 숫자를 입력하세요 : ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.println("두 번째 숫자를 입력하세요 : ");
			int num2 = Integer.parseInt(sc.nextLine());
			if(num1>num2 && num1%2==0) {
				System.out.println(num1+"가 더 큰수이고 짝수이다.");
			}
			else {
				System.out.println("");
			}
			if(num2>num1 && num2%2==0) {
				System.out.println(num2+"가 더 큰수이고 짝수이다.");
			}
			else {
				System.out.println("둘중의 큰수가 짝수이지 않습니다.");
			}
			
			
			
			System.out.println("첫 번재 숫자를 입력하세요 : ");
			int num3 = Integer.parseInt(sc.nextLine());
			System.out.println("두 번재 숫자를 입력하세요 : ");
			int num4 = Integer.parseInt(sc.nextLine());
			int sum = num3 + num4;
			if(sum%2==0 && sum%3==0 ) {
				System.out.println(sum + "은 합이 짝수이고 3의 배수이다.");
			}
			else {
				System.out.println(sum + "은 합이 짝수이고 3의 배수이지 않습니다.");
			}
		
			
			System.out.println("숫자를 입력하세요");
			int num5 = Integer.parseInt(sc.nextLine());
			if(num5%3==0 && num5%5==0) {
				System.out.println(num5 + "은 3의배수 이면서 5의 배수이다.");
			}
			else {
				System.out.println("3의 배수이면서 5의 배수가 아닙니다.");
			}
		}
	
	
	}




