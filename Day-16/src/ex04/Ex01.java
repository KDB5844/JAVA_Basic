package ex04;
/*
 * Object Ŭ����
 * 	�ڹ��� ��� Ŭ������ �⺻������ ����ϴ� Ŭ����
 * 	�������� �ʾƵ� �ڵ����� extends Object �߰� ��
 *  ��ü�� ������ �Ǵ� �⺻���� �������(��ü�ĺ�,��ü��,���������ó�� ���� ����� ���ǵǾ� ����)
 *  ����� ���� Ŭ�������� �˸°� �������̵� �Ͽ� ���
 *  
 * Object Ŭ������ ��ǥ���� �޼���
 *  public String toString();
 *  	- ��ü�� �����ϴ� ���ڿ� ��ȯ(���������� ���� ��)
 *  	- �⺻ ������ ��ü �ĺ��� ���� ���ڿ� ��ȯ(���� ��)
 *  	- �Ϲ������� ��� ������ ���� �̿��ϵ��� �������̵�
 *  public int hashCode();
 *  	- ��ü�� �ĺ��ϴ� ������ ��ȯ
 *  	- �⺻ ������ ��ü �ĺ��� ��ȯ(JVM�� ��ü ���� �� �ο��� ��)
 *  	- �Ϲ������� ��� ������ ���� �̿��ϵ��� �������̵�
 *  boolean equals(Object o);	
 *  	- ��ü�� ���Ͽ� ���� ��ȯ
 *  	- �⺻ ������ ���� ���� ��
 *  	- �Ϲ������� ��� ������ ���� ���ϵ��� �������̵�
 */
public class Ex01 {					
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = new Object();
		Object o4 = o1;

		System.out.println(o1.toString());
		System.out.println(o1);	//toString() ȣ���
		System.out.println(o2);
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		
		System.out.println(o1 == o2);
		System.out.println(o1 == o4);
	}
}
