
/*
 * 1���� �����Ͽ� Ȧ���� ���� ���ϸ鼭 �� ���� 10000�� ���� �ʴ� ������ ���� ���ϴ� ���α׷��� �ۼ��Ͽ���.
 * */



public class Qz05 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; sum < 10000; i+=2) {
			if(i % 2 == 0) {
				
			}
			else {
				sum += i;
			}
			System.out.println(i+"  "+sum);
		}
	}
}
