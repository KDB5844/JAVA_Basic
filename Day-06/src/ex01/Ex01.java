package ex01;

public class Ex01 {
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static void javaPrint() {
		System.out.println("JAVA Programing!");
	}
	
	public static void main(String[] args) {
		System.out.println("1 + 2 ="+add(1,2));
		javaPrint();
		
	}
}
