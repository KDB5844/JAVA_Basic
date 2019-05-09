package ex04;

public class Point {
	int x;	//직접 초기화
	int y;	//직접 초기화

	//디폴트 생성자
	Point(){
		System.out.println("디폴트 생성자");
	}
	
	Point(int x, int y){
		System.out.println("int, int 생성자");
		x = x;
		y = y;
	}
	
	void setXY(Point THIS, int x, int y) {
		System.out.println("setXY를 호출한 객체:" + THIS);
		THIS.x = x;
		THIS.y = y;
	}
	
	
	void printPoint() {
		System.out.println("[" + x + "," + y + "]");
	}
}
