
/*
 * 1부터 시작하여 홀수의 합을 구하면서 그 합이 10000을 넘지 않는 마지막 수를 구하는 프로그램을 작성하여라.
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
