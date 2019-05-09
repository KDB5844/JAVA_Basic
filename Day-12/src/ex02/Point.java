package ex02;
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
	
	
	void printPoint() {
		System.out.println("[" + x + "," + y + "]");
	}
}
