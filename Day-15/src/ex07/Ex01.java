package ex07;
/*
 *	부모 클래스(자료형)의 참조변수는 
 *  자식 객체를 참조할 수 있다. 
 *  
 *  Override
 *   - 부모 클래스의 메서드를 자식 클래스에서 재정의 할 수 있음
 *  
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
	void print() {
		System.out.println("A클래스 메서드");
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
	
	/*
	 * 부모 클래스의 메서드와 동일한 선언으로 정의된 메서드
	 * 접근 제어자가 작아질 수 없음
	 * 메서드 이름 동일
	 * 매개변수 자료형 동일
	 * 오직!함수 내부의 기능만 재 정의
	 */
	@Override /*어노테이션:자바 기능 주석*/
	void print() {
		System.out.println("B클래스 오버라이딩 메서드");
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
		
		obA.print();
		obB.print();
		
		A ob = obB;
		ob.print();	
		//참조가 무엇이냐 중요한 것이 아니고
		//어떤 클래스로 객체(인스턴스)가 만들어졌는가?
		//어떤 메서드가 사용될지 결정 됨.(동적 바인딩)
	}
}






