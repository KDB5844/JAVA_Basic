
/*
 * 전설에 따르면 체스 발명자는 왕으로부터 받을 상을 말하도록 요구 받았을 때 발명자가 말하길
 * 체스 판의 첫번째 사각형에는 밀알을 1개, 두번째 사각형에는 밀알을2개
 * 세번째 사각형에는 밀알을 4개 등으로 총 64칸에 밀알을 2배씩 채워 주기를 요구했다. 
 * 이 발명가가 요구한 밀알의 개수는 ?
 * */

				
					
public class Qz02 {
	public static void main(String[] args) {
		  double slot=1;
		    double sum=0;
		    
		    for(int i=2;i<=64;i++){
		        slot*=2;
		        sum+=slot;
		        System.out.printf("%d번째 %.0f\n",i,slot);
		   }	
		    	
		    System.out.println("");
		    System.out.println("");
		    System.out.printf("총 밀알의 개수 : %.0f개",sum);
		    
	}
}

 