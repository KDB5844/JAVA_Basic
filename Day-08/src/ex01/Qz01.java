package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Qz01 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String st = "";
		String [] sub = new String[] {"국어","영어","수학"};
		int []arr = new int[3];
		float avg = 0;
		int tot = 0;
		System.out.println("이름 : ");
		st = in.readLine();
		for(int i = 0; i < arr.length; i++) {
			do {
				System.out.print(sub[i] + " : ");
				arr[i] = Integer.parseInt(in.readLine());
			}while(arr[i] < 0 || arr[i] > 100);
			tot += arr[i];
		}
		avg = (float)tot / (float)sub.length;
		System.out.println("이름 : "+st);
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+avg);
	}
}
