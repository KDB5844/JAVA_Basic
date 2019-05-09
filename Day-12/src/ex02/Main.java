package ex02;

public class Main {
	public static void main(String[] args) {		
		Point pos1 = new Point();
		pos1.printPoint();
		
		pos1.x = 10;
		pos1.y = 20;
		pos1.printPoint();
		
		Point pos2 = new Point();
		pos2.x = 30;
		pos2.y = 40;
		pos2.printPoint();
	}
}
