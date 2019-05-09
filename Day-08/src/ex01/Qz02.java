package ex01;

import java.util.Scanner;

//5명의 이름과 나이를 저장하고 출력하는 프로그램 작성
//한 번에 다섯 명의 정보를 저장하고 출력한다.

public class Qz02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int []arr = new int[5];
		String[] d = null;
		d = new String[5];
		
		for(int i = 0; i < arr.length; i++) {
			do {
				System.out.println((i+1)+"번째 정보 입력");
				System.out.println("이름 : ");
				String name = in.nextLine();
				d[i] = name;
				
				System.out.print("나이 : ");
				arr[i] = Integer.parseInt(in.nextLine());
			}while(arr[i] < 0);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"정보");
			System.out.println("이름 : "+d[i]+","+"나이 : "+arr[i]);
			
		}
	}
}
