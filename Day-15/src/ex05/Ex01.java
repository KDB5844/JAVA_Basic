package ex05;
/*
 * 객체 지향에서 상속 : 클래스의 재사용
 * 새로운 클래스를 정의할 때 기존 클래스의 기능을 그대로 사용
 * 추가적인 기능을 정의하고 싶을 때
 */
class A{
	int a;
	A(){
		System.out.println("A생성");
	}
	A(int a){
		System.out.println("A생성(int)");
		this.a = a;
	}
	void printA() {
		System.out.println(a);
	}
}

class B extends A{
	int b;
	B(){
		super(); //부모 생성자 호출
		System.out.println("B생성");
	}
	B(int b){
		//super(b);//부모 생성자 선택
		System.out.println("B생성(int)");
		this.b = b;
	}
	B(int a, int b){
		super(a);
		System.out.println("B생성(int, int)");
		this.b = b;
	}
	void printB() {
		System.out.println(b);
	}
	
	void printAB() {
		System.out.println(a + "," + b);
	}
}


public class Ex01 {
	public static void main(String[] args) {
		A obA = new A();
		obA.printA();
		System.out.println("=====");
		B obB = new B();
		obB.printAB();
		System.out.println("=====");
		A obA2 = new A(10);
		obA2.printA();
		System.out.println("=====");
		B obB2 = new B(20);
		obB2.printAB();
		System.out.println("=====");
		B obB3 = new B(10, 20);
		obB3.printAB();
	}
}
