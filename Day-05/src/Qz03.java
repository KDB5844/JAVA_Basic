/*
 * ù���� 10���� �����ϰ�, ���������� ������ 2�踦 �����ϴ� ������� �Ѵ� ���� ������ �ݾ���?
 * 
 * */


public class Qz03 {
	public static void main(String[] args) {
		int money = 0;
		int money2 = 0;
		long money1 = 10;
		long sum = 0;
		int firstsum = 10;
		int day = 1;
		for(int i = 1; i <= 30; i++) {
			if(day<=1){
				System.out.println(day+"�� ����"+firstsum+"��");
			}
			day += 1;
			money1 = money1*2;
			
			sum += money1;
			
			System.out.println(day+"�� ����"+money1+"��");
		}System.out.println(sum);
	}
}
