package basket;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		One o1 = new One();
		Two t1 = new Two();
		Three th1 = new Three();
		Basket o11 = new Basket();
		Basket o22 = new Basket();
		Basket o33 = new Basket();
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 1Á¡½¸   2. 2Á¡½¸  3. 3Á¡½¸   0.°æ±âÁ¾·á");
			int num = Integer.parseInt(in.nextLine());		
			System.out.println("=====================");
			System.out.println("         °ñ             Á¡¼ö  ");
			System.out.println("=====================");
			System.out.println(" 1  "+o11.getCnt()+"        "+o11.goalsum1());
			System.out.println(" 1  "+o22.getCnt()+"        "+o22.getSum());
			System.out.println(" 1  "+o33.getCnt()+"        "+o33.getSum());
			System.out.println("total "+o11.getCnt()+o22.getCnt()+o33.getCnt()+" "+(o11.getSum() + o22.getSum() + o33.getSum()));
			switch(num) {
			case 1: System.out.println("1Á¡ ½¸À» ³Ö¾ú½À´Ï´Ù.");
					o11.cnt1(1);o11.setSum(1); break;
			case 2: System.out.println("2Á¡ ½¸À» ³Ö¾ú½À´Ï´Ù.");
					o22.cnt2(1);o22.setSum(1); break;
			case 3: System.out.println("2Á¡ ½¸À» ³Ö¾ú½À´Ï´Ù.");
					o33.cnt3(1);o33.setSum(1); break;			
			case 0: System.out.println("ÃÑÁ¡¼ö´Â : ");
					System.exit(0);
			}
	 		
		}
 	}
}


		

	

