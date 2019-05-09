package ex03;

public class Main {
	public static void main(String[] args) {		
		Point pos1 = new Point(); //생성자 호출
		pos1.printPoint();
		
		pos1.x = 10; //대입
		pos1.y = 20; //대입
		pos1.printPoint();
		
		Point pos2 = new Point(11, 22); //생성자 호출
		pos2.printPoint();
		pos2.x = 30; //대입
		pos2.y = 40; //대입
		pos2.printPoint();
	}
}
