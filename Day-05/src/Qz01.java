

/*
 * �� 100���� ����Ǿ� �ִ� â�� �ϼ� 1���� �㰡 �ִ�. �� �Ѹ����� �Ϸ翡 20g���� ���� �԰� 10�ϸ��� ���� ���� 2�辿 �����Ѵ�.
 * ��ĥ ���� â���� ���� ��� ���� ���̰� �ɱ�. �׸��� ��� �� ��� �ΰ�??(�� ���� 80kg)
 * */

public class Qz01 {
	public static void main(String[] args) {
		
		int Totbarrel = 80000000;
		int rice = 100;
		int rat = 2;
		int ratrice = 20;
		int ricerat = rat*ratrice; 
		int count = 0;
		
		for(int i = 20; Totbarrel > ratrice; Totbarrel-=(rat*20)) {
			count += 1;
			if(count%10==0) {
				rat = rat * 2;
			}
		}System.out.println(count+"��     "+rat+"����");
		System.out.println();
	}		
}
