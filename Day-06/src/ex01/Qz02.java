package ex01;
//Â¦¼ö È¦¼ö ÆÇº°
public class Qz02 {
	public static void wNum(int a) {
		if(a % 2 == 0) {
			System.out.println("Â¦¼ö ÀÔ´Ï´Ù.");
		}
		else {
			System.out.println("È¦¼ö ÀÔ´Ï´Ù.");
		}
	}
	
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 2;
		wNum(n1);
		wNum(n2);
	}
}
