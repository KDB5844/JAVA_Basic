package ex04;

	class A{
	A(){System.out.println("A����");}
	}
	
	class B extends A{
		B(){System.out.println("B����");}
	}
	class C extends B{
		C(){System.out.println("C����");}
	}
public class Ex09 {
	public static void main(String[] args) {
	//	A oA = new A();
	//	B oB = new B();
		C oC = new C();
		
	}
}

