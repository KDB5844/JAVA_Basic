package ex01;

import java.util.ArrayList;
import java.util.Scanner;

//등록, 검색, 수정, 삭제, 목록

class Person {
	int age = 0;
	String name = null;
	
	Person(String name, int age){
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "[이름 : " + name + ", 나이 : "+ age + "]";
	}


	@Override 
	public boolean equals(Object o) { 
		return hashCode()==o.hashCode();
	} 

	@Override 
	public int hashCode(){
		return name.hashCode(); 
	} 
}


public class Ex01 {
	public static void main(String[] args) {
		
		Person p1 = new Person("",0);
		ArrayList<Person> al = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.등록   2.검색   3.수정   4.삭제   5.목록   6.종료");
			System.out.printf("▶ ");
			int num = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 1 : System.out.println("이름 입력"); //등록
					 System.out.printf("▶ ");
					 String checkName = sc.nextLine();
					 System.out.println("나이 입력");
					 System.out.printf("▶ ");
					 int checkNum = Integer.parseInt(sc.nextLine());
					 al.add(new Person(checkName, checkNum));
					 break;
			
			case 2 :System.out.println("검색할 이름 : "); //검색
				 	System.out.printf("▶ ");
					String serName = sc.nextLine();
					p1.setName(serName);
					if(al.contains(p1) == true ) {
						int a = al.indexOf(p1);
						System.out.println(al.get(a));
						break;
					}
					else System.out.println("그런 이름은 없습니다.");
					break;
			
			case 3 : System.out.println("이름을 입력 : "); //수정
					 System.out.printf("▶ ");
					 String fixName1 = sc.nextLine();
					 p1.setName(fixName1);
					 if(al.contains(p1) == true ) {
						 	int a = al.indexOf(p1);
						 	System.out.println("수정할 이름을 입력 : ");
						 	System.out.printf("▶ ");
						 	String fixName = sc.nextLine();
						 	System.out.println("수정할 나이를 입력 : ");
						 	System.out.printf("▶ ");
						 	int fixAge = Integer.parseInt(sc.nextLine());
						 	p1.setAge(fixAge);
						 	p1.setName(fixName);
							System.out.println(al.set(a, p1));
							System.out.println("수정완료");
							break;
					 }
					 	 else {
					 		  System.out.println("그런 이름은 없습니다.");
					 	 }break;
					 
			case 4 : System.out.println("삭제하고 싶은 정보의 이름을 입력 : ");  //삭제
					 System.out.printf("▶ ");
					 String remName = sc.nextLine();
					 p1.setName(remName);
					 if(al.contains(p1) == true ) {
						 	int a = al.indexOf(p1);
						 	al.remove(a);
							System.out.println("삭제완료");
							break;
					 }
					 	 else {
					 		  System.out.println("그런 이름은 없습니다.");
					 	 }break;
					 
			case 5 : if(al.size() > 0) { //목록
					 	for(int i = 0; i < al.size(); i++) {
					 		System.out.println("======="+(i+1)+"번째 회원=======");
					 		System.out.println(al.get(i));
					 	}  break;
					 }
					 	else {
					 		System.out.println("목록이 없습니다.");
					 	}break;
					 	
			case 6 : System.exit(0); //종료
					 break;
			}
		}	
	}
}




