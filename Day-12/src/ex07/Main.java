package ex07;

public class Main {
	public static void main(String[] args) {
		사람 장동건 = new 사람();
		System.out.println(장동건.생각);
		장동건.생각 = "나는 못생겼다.";
		System.out.println(장동건.생각);
		장동건.학습("객체 지향이란....");
		장동건.정보("집에가고싶다.");
		//.....
		장동건.생각 = "??";
		
		System.out.println(장동건.생각말하기());
	}
}
