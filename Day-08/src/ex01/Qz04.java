package ex01;

/*
 * 첫째 자리에 원하는 값을 위치하는 것으로 오름차순과 내림차순에 따라 값이 변할 수 있다.
 * 오름 차순을 기준으로 하였을 경우 앞에 있는 값과 그 이후의 값들을 비교하여 가장 작은 값을
 * 그 위치에 놓는다. 다음 위치에 있는 값과 그 이후의 값들을 비교하여 그 중 가장 작은 값을
 * 놓는다. 정렬이 끝날 때까지 이를 반복하면 전체적으로 값이 정렬이 이루어 진다.
 * 선택정렬
 */
public class Qz04 {
	public static void main(String[] args) {
		int[] num = {4,8,2,7,6};
		
		for(int i = 0; i < num.length-1; i++) {
			for(int j = i+1; j < num.length; j++) {
				if(num[i] > num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]+",");
		}
	}
}
