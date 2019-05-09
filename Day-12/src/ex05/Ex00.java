package ex05;

public class Ex00 {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		System.out.println(p1);
		Point p2 = p1;
		System.out.println(p2);
		p2.printPoint();
	}
}
