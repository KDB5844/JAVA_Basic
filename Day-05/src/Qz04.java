
/*
 * 1~1000������ ���� ���϶�.
 * �� 3�� ����� �����ϰ� 3�� ����̸鼭 5�� ����� �������� �ʴ� �������� ���϶�.
 * 
 * */

public class Qz04 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 0 ; i <= 1000 ; i++) {
			if(i % 3 != 0 || i % 3 == 0 && i % 5 == 0) {
					sum += i;
				}
			}System.out.println(sum);
	}
}
