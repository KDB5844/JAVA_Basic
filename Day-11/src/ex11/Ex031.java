package ex11;

//class Info{
//	String name;
//	int age;
//}

public class Ex031 {
	public static void main(String[] args) {
		//�̸�, ���̸� �����ϴ� ���α׷�
		Info[] infos = new Info[3]; // �������� �迭 ��ü ����	
		infos[0] = new Info();
		infos[0].setInfo("ȫ�浿", 20);
		
		
		infos[1] = new Info();
		infos[1].setInfo("�̼���", 21);
		
		infos[2] = new Info();
		infos[2].setInfo("���浿", 30);
		
		
		for(int i = 0 ; i < infos.length; i++) {
			infos[i].printInfo();
		
		}
	}
}
