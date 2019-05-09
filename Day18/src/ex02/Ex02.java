package ex02;

/*
 * interface : 완전한 추상클래스
 */

interface 물특성{
	void 움직인다();
	//public abstract void 움직인다();
}


abstract class Animal{
	public abstract void 움직인다();
}
abstract class 포유류 extends Animal{}
abstract class 조류 extends Animal{}
abstract class 어류 extends Animal{}
class 코끼리 extends 포유류{
	@Override
	public void 움직인다() {
		System.out.println("쿵쿵");
	}
	
}
class 고래 extends 포유류 implements 물특성{

	@Override
	public void 움직인다() {
		System.out.println("헤엄친다.");
	}
	
}
class 독수리 extends 조류{

	@Override
	public void 움직인다() {
		System.out.println("날아다님");
	}
	
}
class 팽귄 extends 조류 implements 물특성{

	@Override
	public void 움직인다() {
		System.out.println("헤엄친다.");
	}
	
}

class 상어 extends 어류 implements 물특성{

	@Override
	public void 움직인다() {
		System.out.println("헤엄친다.");
	}
	
}
public class Ex02 {
	public static void main(String[] args) {
		코끼리 코1 = new 코끼리();
		고래 고1 = new 고래();
		독수리 독1 = new 독수리();
		팽귄 팽1 = new 팽귄();
		상어 상1 = new 상어();
		
		Animal[] 동물 = new Animal[]{
			코1, 고1, 독1, 팽1, 상1
		};
		동물[0].움직인다();
		
		물특성[] water = new 물특성[] {
			고1, 팽1, 상1	
		};
		for(int i = 0; i < water.length; i++) {
			water[i].움직인다();
		}
	}
}
