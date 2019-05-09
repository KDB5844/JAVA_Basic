package ex05;

public class Ex01 {
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();

		System.out.println("p1:" + p1);
		p1.setXY(/*p1, */1, 2);

		System.out.println("p2:" + p2);
		p2.setXY(/*p2, */3, 4);

		System.out.println("p3:" + p3);
		p3.setXY(/*p3, */5, 6);

		p1.printPoint();
		p2.printPoint();
		p3.printPoint();
		
	}
}
