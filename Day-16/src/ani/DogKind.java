package ani;
import ani.Mammalia;


public class DogKind extends Mammalia{
	void move() {
		System.out.println("����ó�� �����δ�");
	}
	void roar() {
		System.out.println("����ó�� ¢�´�");
	}
	void breeding() {
		System.out.println("������ ���´�");
	}
	void sum() {
		System.out.println("����ó�� ���� ����.");
	}
	void bed() {
		System.out.println("����ó�� �ܴ�");
	}
}


class Wolf extends DogKind{
	void move() {
		System.out.println("����ó�� �����δ�");
	}
	void roar() {
		System.out.println("����ó�� ¢�´�");
	}
	void breeding() {
		System.out.println("���� ������ ���´�");
	}
	void sum() {
		System.out.println("����ó�� ���� ����.");
	}
	void bed() {
		System.out.println("����ó�� �ܴ�");
	}
	void hunter() {
		System.out.println("���̻���� �Ѵ�.");
	}
}

class Raccoon extends DogKind{
	void move() {
		System.out.println("�ʱ���ó�� �����δ�");
	}
	void roar() {
		System.out.println("�ʱ���ó�� ¢�´�");
	}
	void breeding() {
		System.out.println("�ʱ��������� ���´�");
	}
	void sum() {
		System.out.println("�ʱ���ó�� ���� ����.");
	}
	void bed() {
		System.out.println("�ʱ���ó�� �ܴ�");
	}
	void hunter() {
		System.out.println("���̻���� �Ѵ�.(���)");
	}
}

class Dog extends DogKind{
	void move() {
		System.out.println("��ó�� �����δ�");
	}
	void roar() {
		System.out.println("��ó�� ¢�´�");
	}
	void breeding() {
		System.out.println("������������ ���´�");
	}
	void sum() {
		System.out.println("��ó�� ���� ����.");
	}
	void bed() {
		System.out.println("��ó�� �ܴ�");
	}
	void hunter() {
		System.out.println("��Ḧ �Դ´�");
	}
}

