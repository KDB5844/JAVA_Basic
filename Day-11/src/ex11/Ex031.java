package ex11;

//class Info{
//	String name;
//	int age;
//}

public class Ex031 {
	public static void main(String[] args) {
		//이름, 나이를 저장하는 프로그램
		Info[] infos = new Info[3]; // 참조변수 배열 객체 생성	
		infos[0] = new Info();
		infos[0].setInfo("홍길동", 20);
		
		
		infos[1] = new Info();
		infos[1].setInfo("이순신", 21);
		
		infos[2] = new Info();
		infos[2].setInfo("감길동", 30);
		
		
		for(int i = 0 ; i < infos.length; i++) {
			infos[i].printInfo();
		
		}
	}
}
