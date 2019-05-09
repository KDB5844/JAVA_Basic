package ex03;
/*
 * 객체를 초기화 하는 방법
 * 객체 초기화?: 객체 생성 시 멤버필드의 기본 값을 지정
 * 객체 초기화 방법 세 가지
 * 	1. 직접 초기화
 *  2. 블록 초기화
 *  3. 생성자 초기화
 * 
 */
public class Point {
	int x = 100;	//직접 초기화
	int y = 200;	//직접 초기화
	{
		//초기화 블록
		printPoint();
		x = -100;
		y = -200;
	}
	
	/*
	 * 생성자(Contructor)
	 *  자바에서 객체 생성 시 반드시 호출되는 멤버 메서드
	 *  생성자 메서드는 클래스의 이름과 동일!
	 *  생성자 메서드는 반환 자료형이 없음!
	 *  생성자가 정의되어 있지 않으면 JVM에서 디폴트 생성자를 만들어 호출
	 *  생성자를 오버로딩하여 객체 생성 방식을 다양하게 정의할 수 있다.
	 */
	
	//디폴트 생성자
	Point(){
		System.out.println("디폴트 생성자");
		x = 1000;
		y = 2000;
	}
	
	Point(int n1, int n2){
		System.out.println("int, int 생성자");
		x = n1;
		y = n2;
	}
	
	
	void printPoint() {
		System.out.println("[" + x + "," + y + "]");
	}
}
