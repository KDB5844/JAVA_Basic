package ex01;

public class Ex03 {
	public static void main(String[] args) {
		int a = 5, b = 6, c = 10, d = 0;
		boolean bo = false;
		d = ++a * b--;		//���� : ++a * = b--
		System.out.printf("a = %d, b = %d, d = %d\n",a,b,d); //��6 * 6 = 36 �����Ŀ� a = 6, b = 5, c = 10, d = 36
		d = a++ + ++c - b--; //  
		System.out.printf("a = %d, b = %d, c = %d, d = %d\n",a,b,c,d); //��6 + 11 - 5 = 12 �����Ŀ�  a = 7 b = 4  c = 11, d = 12 
		a = 1;
		b = 0;
		bo = a++ > 0 || 1 <  ++b * d / ++c;
		System.out.printf("a = %d, b = %d, c = %d, d = %d\n",a,b,c,d); //��2�� 1�Ǵ�0���� ũ�ϱ� �ڿ� ���x a = 2, b = 0, c = 11 d = 12
		bo = b++ > 0 && 1 < ++a / ++c * d ++;								//�˻��� �κб����� Ȯ�� �����Ƿ� ++a ����
		System.out.printf("a + %d, b = %d, c = %d, d =%d\n",a,b,c,d); // a = 2 , b = 1, c = 11, d = 12
	}																	    //�˻��� �κб����� Ȯ�� �����Ƿ� b++ ����
}
