package ex11;

//class Info{
//	String name;
//	int age;
//}

public class Ex03 {
	public static void main(String[] args) {
		//이름, 나이를 저장하는 프로그램
		Info[] infos = new Info[3]; // 참조변수 배열 객체 생성	
		infos[0] = new Info();
		infos[0].name = "홀동";
		infos[0].age = 20;
		
		infos[1] = new Info();
		infos[1].name = "2홀동";
		infos[1].age = 40;
		
		infos[2] = new Info();
		infos[2].name = "1홀동";
		infos[2].age = 30;
		
		for(int i = 0 ; i < infos.length; i++) {
		System.out.println(infos[0].name + "," + infos[0].age);
		
		}
	}
}
