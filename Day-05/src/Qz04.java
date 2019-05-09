
/*
 * 1~1000까지의 합을 구하라.
 * 단 3의 배수는 제외하고 3의 배수이면서 5의 배수는 제외하지 않는 조건으로 구하라.
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
