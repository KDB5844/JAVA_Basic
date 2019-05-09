package ex06;

class Point {
	int a, b, c, d, e, f;
	Point(){
		a = 1;
		b = 2;
		c = 3;
		d = 4;
		e = 5;
		f = 6;
	}
	Point(int n){
//		a = 1;
//		b = 2;
//		c = 3;
//		e = 5;
//		f = 6;
		this();
		d = n;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(100);
	}
}
