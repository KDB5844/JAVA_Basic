package ex01;

import java.util.Random;

//주민등록번호 생성기

public class Qz01 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] num = null;
		num = new int[13];
		num[0] = random.nextInt(9);
		num[1] = random.nextInt(9);
		//
		num[2] = random.nextInt(1);
		
		if(num[2] == 0) {
			num[3] = random.nextInt(9)+1;
		}else if(num[2] == 1) {
			num[3] = random.nextInt(2);
		}
		//
		num[4] = random.nextInt(1);
		
		if(num[4] == 0) {
			num[5] = random.nextInt(9)+1;
		}else if(num[4] == 1) {
			num[5] = random.nextInt(2);
		}
		//
		num[6] = random.nextInt(8)+1;
		num[7] = random.nextInt(9)+1;
		num[8] = random.nextInt(9);
		num[9] = random.nextInt(9);
		num[10] = random.nextInt(9);
		num[11] = random.nextInt(9);
		num[12] = random.nextInt(9); 
		
		
		
		for(int i = 0; i < 6; i ++) {
			System.out.print(num[i]);
		}System.out.print("-");
		for(int i = 6; i <= 12; i ++) {
			System.out.print(num[i]);		
		}
		System.out.println("");
		int sum = 11-(11%(num[0]*2+num[1]*3+num[2]*4
				+num[3]*5+num[4]*6+num[5]*7+num[6]*8+
				num[7]*9+num[8]*2+num[9]*3+num[10]*4+
				num[11]*5+num[12]*6));
		
		if(sum > 9) {
			sum -= 10; 
		}
		if(num[12] == sum) {
			System.out.println("[유효한 주민등록번호입니다.]");
		}else 
			System.out.println("[유효하지 않은 주민등록번호입니다.]");
	}
}

