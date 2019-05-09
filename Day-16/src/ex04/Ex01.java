package ex04;
/*
 * Object 클래스
 * 	자바의 모든 클래스가 기본적으로 상속하는 클래스
 * 	선언하지 않아도 자동으로 extends Object 추가 됨
 *  객체가 가져야 되는 기본적인 기능제공(객체식별,객체비교,스레드관련처리 등의 기능이 정의되어 있음)
 *  사용자 정의 클래스에서 알맞게 오버라이딩 하여 사용
 *  
 * Object 클래스의 대표적인 메서드
 *  public String toString();
 *  	- 객체를 설명하는 문자열 반환(참조변수에 들어가는 값)
 *  	- 기본 값으로 객체 식별을 위한 문자열 반환(참조 값)
 *  	- 일반적으로 멤버 변수의 값을 이용하도록 오버라이딩
 *  public int hashCode();
 *  	- 객체를 식별하는 정수값 반환
 *  	- 기본 값으로 객체 식별값 반환(JVM이 객체 생성 시 부여한 값)
 *  	- 일반적으로 멤버 변수의 값을 이용하도록 오버라이딩
 *  boolean equals(Object o);	
 *  	- 객체를 비교하여 논리값 반환
 *  	- 기본 값으로 참조 값을 비교
 *  	- 일반적으로 멤버 변수의 값을 비교하도록 오버라이딩
 */
public class Ex01 {					
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = new Object();
		Object o4 = o1;

		System.out.println(o1.toString());
		System.out.println(o1);	//toString() 호출됨
		System.out.println(o2);
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		
		System.out.println(o1 == o2);
		System.out.println(o1 == o4);
	}
}
