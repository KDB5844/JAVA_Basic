package ex01;
//¦�� Ȧ�� �Ǻ�
public class Qz02 {
	public static void wNum(int a) {
		if(a % 2 == 0) {
			System.out.println("¦�� �Դϴ�.");
		}
		else {
			System.out.println("Ȧ�� �Դϴ�.");
		}
	}
	
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 2;
		wNum(n1);
		wNum(n2);
	}
}
