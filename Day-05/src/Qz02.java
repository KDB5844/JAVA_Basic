
/*
 * ������ ������ ü�� �߸��ڴ� �����κ��� ���� ���� ���ϵ��� �䱸 �޾��� �� �߸��ڰ� ���ϱ�
 * ü�� ���� ù��° �簢������ �о��� 1��, �ι�° �簢������ �о���2��
 * ����° �簢������ �о��� 4�� ������ �� 64ĭ�� �о��� 2�辿 ä�� �ֱ⸦ �䱸�ߴ�. 
 * �� �߸��� �䱸�� �о��� ������ ?
 * */

				
					
public class Qz02 {
	public static void main(String[] args) {
		  double slot=1;
		    double sum=0;
		    
		    for(int i=2;i<=64;i++){
		        slot*=2;
		        sum+=slot;
		        System.out.printf("%d��° %.0f\n",i,slot);
		   }	
		    	
		    System.out.println("");
		    System.out.println("");
		    System.out.printf("�� �о��� ���� : %.0f��",sum);
		    
	}
}

 