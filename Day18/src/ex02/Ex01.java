package ex02;
/*
 * abstract 추상 명시.
 * abstract메서드를 가지는 클래스는 abstract클래스여야만 한다.
 * 기능이 명확하게 정의될 수 없고
 * 하위 클래스에서 재정의하도록 선언하기 위해서 사용
 */
abstract class 동물{
	void 동물이가지는기능() {
		System.out.println("동물기능");
	}
	abstract void 움직인다();
}

class 개 extends 동물{

	@Override
	void 움직인다() {
		System.out.println("개같이 움직인다.");
	}
	
}

class 고양이 extends 동물{
	@Override
	void 움직인다() {
		System.out.println("고양이같이 움직인다.");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		//동물 ob = new 동물();
		동물 ob = new 개();	//업케스팅
		ob.움직인다();
		ob = new 고양이();
		ob.움직인다();
	}
}




