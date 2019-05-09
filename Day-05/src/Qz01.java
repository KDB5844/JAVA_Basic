

/*
 * 쌀 100통이 저장되어 있는 창고에 암수 1쌍의 쥐가 있다. 쥐 한마리가 하루에 20g씩의 쌀을 먹고 10일마다 쥐의 수가 2배씩 증가한다.
 * 며칠 만에 창고의 쌀이 모두 쥐의 먹이가 될까. 그리고 쥐는 총 몇마리 인가??(한 통은 80kg)
 * */

public class Qz01 {
	public static void main(String[] args) {
		
		int Totbarrel = 80000000;
		int rice = 100;
		int rat = 2;
		int ratrice = 20;
		int ricerat = rat*ratrice; 
		int count = 0;
		
		for(int i = 20; Totbarrel > ratrice; Totbarrel-=(rat*20)) {
			count += 1;
			if(count%10==0) {
				rat = rat * 2;
			}
		}System.out.println(count+"일     "+rat+"마리");
		System.out.println();
	}		
}
