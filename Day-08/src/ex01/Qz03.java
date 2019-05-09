package ex01;




public class Qz03 {
	public static void main(String[] args) {
		
		
		int Lotto[] = new int[6]; //배열생성
		
		System.out.print("Lotto 선택 숫자는 : ");
		
		for(int i = 0; i < Lotto.length; i++) {
			Lotto[i] = (int)(Math.random()*45)+1;
			
		for(int j = 0; j < i; j++){
			if(Lotto[i]==Lotto[j]){
				i--;
				break;
				}
			}	
		}
		for(int i = 0; i < Lotto.length; i++) {
			System.out.print(Lotto[i]+" ");
		}
		System.out.println("입니다.");
	}
}
//1. 45개 배열 넣어서 변경
//2. flag ( 45개 배열 불린 f) 


