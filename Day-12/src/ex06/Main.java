package ex06;
/*
 * this() : 다른 생성자를 호출하는 구문
 *  생성자의 가장 첫 번째 줄에서만 선언이 가능
 *  생성자를 오버로딩하여 정의하는 경우 다른 생성자를 활용
 */
class Test{
	int a;
	Test(){
//		System.out.println("test()생성자 호출"); //this()위에 코드 선언 불가
		this(5);
		System.out.println("test()생성자 종료");
	}
	Test(int a){
		System.out.println("test(int a) 생성자 호출");
		this.a = a;
		System.out.println( this.a +"저장" );
		this.show();
		System.out.println("test(int a) 생성자 종료");
	}	
	int show(){
		System.out.println("show()메소드 호출");
		this.show(10);
		System.out.println("show()메소드 종료");
		return 0;
	}
	int show(int a){
		this.a = a;
		System.out.println(this.a + "저장");
		System.out.println("show(int a)메소드");
		return 0;
	}	
}
public class Main{
	public static void main(String[] args){
		Test ob1 = new Test();
		System.out.println("================");
		Test ob2 = new Test(100);
	}
}



