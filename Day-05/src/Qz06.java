import java.util.Scanner;

public class Qz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = Integer.parseInt(sc.nextLine());
		int sum = 1;
		
		for(; 0<num ; num--) {
			sum *= num;
	
		}System.out.print(sum);
	}	
}