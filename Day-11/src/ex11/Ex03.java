package ex11;

//class Info{
//	String name;
//	int age;
//}

public class Ex03 {
	public static void main(String[] args) {
		//�̸�, ���̸� �����ϴ� ���α׷�
		Info[] infos = new Info[3]; // �������� �迭 ��ü ����	
		infos[0] = new Info();
		infos[0].name = "Ȧ��";
		infos[0].age = 20;
		
		infos[1] = new Info();
		infos[1].name = "2Ȧ��";
		infos[1].age = 40;
		
		infos[2] = new Info();
		infos[2].name = "1Ȧ��";
		infos[2].age = 30;
		
		for(int i = 0 ; i < infos.length; i++) {
		System.out.println(infos[0].name + "," + infos[0].age);
		
		}
	}
}
