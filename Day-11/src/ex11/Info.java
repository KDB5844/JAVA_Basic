package ex11;

public class Info {
	String name;							
	int age;
	
	void printInfo() {						//값출력
		System.out.println(name + "," + age);
	}
	
	void setInfo(String n, int a) {			//값저장
		name = n;
		age = a;
	}
}
