package ex06;
/*
 *	부모 클래스(자료형)의 참조변수는 
 *  자식 객체를 참조할 수 있다. 
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
		B obB = new B();
		
		A ob = obB; //부모 참조변수로 자식 객체 참조(업캐스팅)
		System.out.println("obA가 참조하는 객체:" + obA);
		System.out.println("obB가 참조하는 객체:" + obB);
		System.out.println("ob가 참조하는 객체:" + ob);
		//obB. A, B의 멤버 모두 접근
		//ob. A의 멤버만 접근 가능
		
		B ob2 = (B)ob; //다운캐스팅
		System.out.println("ob2가 참조하는 객체:" + ob2);
		
		//B ob3 = (B)obA; //캐스팅 예외!
		//obA는 B클래스의 인스턴스가 존재하지 않음.
	}
}






