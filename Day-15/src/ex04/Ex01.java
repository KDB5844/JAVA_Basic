package ex04;
/*
 * 상속 : 물려받는 거(물려주는 거)
 * 객체 지향에서 상속 : 클래스의 재사용
 * 
 */
public class Ex01 {
	public static void main(String[] args) {
		Point3D pos1 = new Point3D();
		pos1.x = 10;
		pos1.y = 20;
		pos1.z = 30;
		System.out.println(pos1.get2D());
		System.out.println(pos1.get3D());
	}
}
