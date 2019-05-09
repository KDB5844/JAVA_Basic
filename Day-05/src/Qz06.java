import java.util.Scanner;

public class Qz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		int sum = 1;
		
		for(; 0<num ; num--) {
			sum *= num;
	
		}System.out.print(sum);
	}	
}