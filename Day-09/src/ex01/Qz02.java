package ex01;

import java.util.Scanner;

//입력 받은 수 만큼 배열을 할당하고 배열에 값 입력 및 출력하기

public class Qz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num1 = null;
		int and = 0;
		
		System.out.print("생성할 배열의 길이를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		num1 = new int[num];
		System.out.println(num+"개의 배열이 생성되었습니다.");
		for(int i = 0; i < num; i++) {
			System.out.print((i+1)+"번째 값 : ");
			int num3 = Integer.parseInt(sc.nextLine());
			num1[i] = num3;
			System.out.println("");
		}
		System.out.print("배열에 입력된 값은 : ");
		for(int i = 0; i < num; i++) {
			System.out.print(num1[i]+" ");
		}
		System.out.println("입니다.");
	
		System.out.print("정렬 후 값은 : ");
		 int min;
		 int tmp;
		    for (int i = 0; i < num1.length - 1; i++) {
		      min = i;
		      for (int j = i + 1; j < num1.length; j++) {
		        if (num1[j] < num1[min])
		          min = j;
		      }
		      tmp = num1[i];
		      num1[i] = num1[min];
		      num1[min] = tmp;
		    }
		    for(int i = 0; i < num; i++) {
		    	System.out.print(num1[i]+" ");
		    }
		System.out.println("입니다.");
	}
}
