package ex01;

public class Qz04 {
	public static void main(String[] args) {
		
		for(int i = 1; i<=9; i++) {
			for(int j = 2; j<=19; j++) {
				int x = i*j;
				System.out.print(j+" * "+i+" = "+x+"   ");
			}
			System.out.println("");
		}
	}
}
