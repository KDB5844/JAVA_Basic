package ex02;
/*
 * abstract �߻� ���.
 * abstract�޼��带 ������ Ŭ������ abstractŬ�������߸� �Ѵ�.
 * ����� ��Ȯ�ϰ� ���ǵ� �� ����
 * ���� Ŭ�������� �������ϵ��� �����ϱ� ���ؼ� ���
 */
abstract class ����{
	void �����̰����±��() {
		System.out.println("�������");
	}
	abstract void �����δ�();
}

class �� extends ����{

	@Override
	void �����δ�() {
		System.out.println("������ �����δ�.");
	}
	
}

class ����� extends ����{
	@Override
	void �����δ�() {
		System.out.println("����̰��� �����δ�.");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		//���� ob = new ����();
		���� ob = new ��();	//���ɽ���
		ob.�����δ�();
		ob = new �����();
		ob.�����δ�();
	}
}




