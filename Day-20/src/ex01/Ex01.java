package ex01;

import java.util.ArrayList;
import java.util.Scanner;

//���, �˻�, ����, ����, ���

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
		return "[�̸� : " + name + ", ���� : "+ age + "]";
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
			System.out.println("1.���   2.�˻�   3.����   4.����   5.���   6.����");
			System.out.printf("�� ");
			int num = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 1 : System.out.println("�̸� �Է�"); //���
					 System.out.printf("�� ");
					 String checkName = sc.nextLine();
					 System.out.println("���� �Է�");
					 System.out.printf("�� ");
					 int checkNum = Integer.parseInt(sc.nextLine());
					 al.add(new Person(checkName, checkNum));
					 break;
			
			case 2 :System.out.println("�˻��� �̸� : "); //�˻�
				 	System.out.printf("�� ");
					String serName = sc.nextLine();
					p1.setName(serName);
					if(al.contains(p1) == true ) {
						int a = al.indexOf(p1);
						System.out.println(al.get(a));
						break;
					}
					else System.out.println("�׷� �̸��� �����ϴ�.");
					break;
			
			case 3 : System.out.println("�̸��� �Է� : "); //����
					 System.out.printf("�� ");
					 String fixName1 = sc.nextLine();
					 p1.setName(fixName1);
					 if(al.contains(p1) == true ) {
						 	int a = al.indexOf(p1);
						 	System.out.println("������ �̸��� �Է� : ");
						 	System.out.printf("�� ");
						 	String fixName = sc.nextLine();
						 	System.out.println("������ ���̸� �Է� : ");
						 	System.out.printf("�� ");
						 	int fixAge = Integer.parseInt(sc.nextLine());
						 	p1.setAge(fixAge);
						 	p1.setName(fixName);
							System.out.println(al.set(a, p1));
							System.out.println("�����Ϸ�");
							break;
					 }
					 	 else {
					 		  System.out.println("�׷� �̸��� �����ϴ�.");
					 	 }break;
					 
			case 4 : System.out.println("�����ϰ� ���� ������ �̸��� �Է� : ");  //����
					 System.out.printf("�� ");
					 String remName = sc.nextLine();
					 p1.setName(remName);
					 if(al.contains(p1) == true ) {
						 	int a = al.indexOf(p1);
						 	al.remove(a);
							System.out.println("�����Ϸ�");
							break;
					 }
					 	 else {
					 		  System.out.println("�׷� �̸��� �����ϴ�.");
					 	 }break;
					 
			case 5 : if(al.size() > 0) { //���
					 	for(int i = 0; i < al.size(); i++) {
					 		System.out.println("======="+(i+1)+"��° ȸ��=======");
					 		System.out.println(al.get(i));
					 	}  break;
					 }
					 	else {
					 		System.out.println("����� �����ϴ�.");
					 	}break;
					 	
			case 6 : System.exit(0); //����
					 break;
			}
		}	
	}
}




