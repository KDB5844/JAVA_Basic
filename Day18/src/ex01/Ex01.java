package ex01;

//정보처리기사 실기 예상문제

class A{
	void method() {
		method();
		System.out.println("A");
	}
}
class B extends A{
	void method() {
		System.out.println("B");
	}
	void test() {
		super.method();
	}
}

public class Ex01 {
	public static void main(String[] args) {
		A ob = new B();
		((B)ob).test();
	}
}












