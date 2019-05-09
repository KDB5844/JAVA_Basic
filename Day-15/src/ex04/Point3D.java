package ex04;

//Point3D클래스는 Point2D클래스의 멤버를 상속(재사용)
public class Point3D extends Point2D{
	
	int z;
	
	String get3D() {
		return "[" + x + "," + y + "," + z +"]";
	}
}
