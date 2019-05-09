/*
 * 첫날에 10원을 예금하고, 다음날에는 전날의 2배를 예금하는 방식으로 한달 동안 저축한 금액은?
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
				System.out.println(day+"일 동안"+firstsum+"원");
			}
			day += 1;
			money1 = money1*2;
			
			sum += money1;
			
			System.out.println(day+"일 동안"+money1+"원");
		}System.out.println(sum);
	}
}
