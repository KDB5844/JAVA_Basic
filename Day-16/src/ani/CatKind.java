package ani;

class CatKind extends Mammalia{
	void move() {
		System.out.println("����̰�ó�� �����δ�");
	}
	void roar() {
		System.out.println("����̰�ó�� ¢�´�");
	}
	void breeding() {
		System.out.println("������ ���´�");
	}
	void sum() {
		System.out.println("����̰�ó�� ���� ����.");
	}
	void bed() {
		System.out.println("����̰�ó�� �ܴ�");
	}
}

class Tiger extends CatKind{
	void move() {
		System.out.println("ȣ����ó�� �����δ�");
	}
	void roar() {
		System.out.println("ȣ����ó�� ¢�´�");
	}
	void breeding() {
		System.out.println("ȣ���̻����� ���´�");
	}
	void sum() {
		System.out.println("ȣ����ó�� ���� ����.");
	}
	void bed() {
		System.out.println("ȣ����ó�� �ܴ�");
	}
	void hunter() {
		System.out.println("���� ����� �Ѵ�.");
	}
}

class Lion extends CatKind{
	void move() {
		System.out.println("����ó�� �����δ�");
	}
	void roar() {
		System.out.println("����ó�� ¢�´�");
	}
	void breeding() {
		System.out.println("���ڻ����� ���´�");
	}
	void sum() {
		System.out.println("����ó�� ���� ����.");
	}
	void bed() {
		System.out.println("����ó�� �ܴ�");
	}
	void hunter() {
		System.out.println("���� ����� �Ѵ�.");
	}
}


class Cat extends CatKind{
	void move() {
		System.out.println("�����ó�� �����δ�");
	}
	void roar() {
		System.out.println("�����ó�� ¢�´�");
	}
	void breeding() {
		System.out.println("����̻����� ���´�");
	}
	void sum() {
		System.out.println("�����ó�� ���� ����.");
	}
	void bed() {
		System.out.println("�����ó�� �ܴ�");
	}
	void hunter() {
		System.out.println("��Ḧ �Դ´�");
	}
}

	
	