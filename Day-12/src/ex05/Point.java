package ex05;
/*
 * this: 멤버 메서드를 호출한 객체를 참조하는 변수(필드)
 * 멤버 메서드의 0번째 매개변수로 존재
 * 직접 this매개변수를 선언할 수 없음(원치 않는 객체의 값이 변경될 가능성이 생김)
 * 지역변수와 멤버변수의 이름을 구분하기 위해 명시
 * 
 */
public class Point {
	int x;	//직접 초기화
	int y;	//직접 초기화

	//디폴트 생성자
	Point(/* Point this,*/){
		System.out.println("디폴트 생성자");
	}
	
	Point(/* Point this,*/int x, int y){
		System.out.println("int, int 생성자");
		this.x = x;
		this.y = y;
	}
	
	void setXY(/* Point this,*/ int x, int y) {
		System.out.println("setXY를 호출한 객체:" + this);
		this.x = x;
		this.y = y;
	}
	
	
	void printPoint(/* Point this,*/) {
		System.out.println("[" + this.x + "," + this.y + "]");
	}
}
