package ex02;

/*
 * interface : ������ �߻�Ŭ����
 */

interface ��Ư��{
	void �����δ�();
	//public abstract void �����δ�();
}


abstract class Animal{
	public abstract void �����δ�();
}
abstract class ������ extends Animal{}
abstract class ���� extends Animal{}
abstract class ��� extends Animal{}
class �ڳ��� extends ������{
	@Override
	public void �����δ�() {
		System.out.println("����");
	}
	
}
class ���� extends ������ implements ��Ư��{

	@Override
	public void �����δ�() {
		System.out.println("���ģ��.");
	}
	
}
class ������ extends ����{

	@Override
	public void �����δ�() {
		System.out.println("���ƴٴ�");
	}
	
}
class �ر� extends ���� implements ��Ư��{

	@Override
	public void �����δ�() {
		System.out.println("���ģ��.");
	}
	
}

class ��� extends ��� implements ��Ư��{

	@Override
	public void �����δ�() {
		System.out.println("���ģ��.");
	}
	
}
public class Ex02 {
	public static void main(String[] args) {
		�ڳ��� ��1 = new �ڳ���();
		���� ��1 = new ����();
		������ ��1 = new ������();
		�ر� ��1 = new �ر�();
		��� ��1 = new ���();
		
		Animal[] ���� = new Animal[]{
			��1, ��1, ��1, ��1, ��1
		};
		����[0].�����δ�();
		
		��Ư��[] water = new ��Ư��[] {
			��1, ��1, ��1	
		};
		for(int i = 0; i < water.length; i++) {
			water[i].�����δ�();
		}
	}
}