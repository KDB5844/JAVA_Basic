package ex01;
/*
 * 상속을 사용하는 이유?
 * 	코드(클래스) 재사용
 * 상속 시 부모 클래스 참조로 자식객체 참조 가능
 * 오버라이딩을 이용하여 부모 메서드를 재정의 가능
 * 업캐스팅 시에도 실제 생성된  객체의 오버라이딩 된  메서드 호출 가능
 * 
 * 위 특징을 통해서 얻을 수 있는 것은 다형성!
 * 하나의 타입으로 다양한 하위 타입을 제어할 수 있음
 * 타입 == 클래스 == 자료형
 * 객체 == 인스턴스
 */

class 삼각형{
	void 삼각형의특징() {
		System.out.println("삼각형이다.");
	}
}

class 사각형{
	void 사각형의특징() {
		System.out.println("사각형이다.");
	}
}
class 오각형{
	void 오각형의특징() {
		System.out.println("오각형이다.");
	}
}


public class Ex01 {
	public static void main(String[] args) {
		삼각형 t1 = new 삼각형();
		사각형 r1 = new 사각형();
		오각형 p1 = new 오각형();
		
		t1.삼각형의특징();
		r1.사각형의특징();
		p1.오각형의특징();
		
	}
}
