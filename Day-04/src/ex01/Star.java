package ex01;

public class Star {
	public static void main(String[] args) { 
	
	//Q1
	System.out.println("Q1================");
	for(int i = 1; i<2; i++) {
		for(int j = 0; j<5; j++) {
				System.out.print('*');
			}
		}
	System.out.println("");
	System.out.println("Q2================");
	
	
	//Q2
	for(int i = 0; i<5; i++) {
		for(int j = 0; j<1; j++) {
				System.out.println('*');
			}
		}
	
	System.out.println("Q3================");
	
	//Q3
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
					System.out.print('*');
				}System.out.println("*");
			}
		System.out.println("Q4================");
		
	
	//Q4
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=5; j++) {
				System.out.print(i);
				}System.out.println("");
			}
		System.out.println("Q5================");
	
	//Q5
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=5; j++) {
				System.out.print(j);
				}System.out.println("");
			}	
		System.out.println("Q6================");
		
	//Q6
	int sum = 0;
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=5; j++) {
				sum += i;
				System.out.print(j);
				}System.out.println();
			}		
		System.out.println("Q7================");
	//Q7
		int sum1 = 0;
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=5; j++) {
				sum += i;
				System.out.print(j);
				}System.out.println();
			}		
		System.out.println("Q8================");
	//Q8

		for(int i = 1; i<=6; i++) {
			for(int j = 1; j<i; j++) {
				sum += i;
				System.out.print('*');
				}System.out.println();
			}		
		System.out.println("Q9================");
	//Q9

		for(int i = 1; i<=5; i++) {
			for(int j = 6; i<j; j--) {
				sum += i;
				System.out.print('*');
				}System.out.println();
			}				
	//Q10
		System.out.println("Q10================");
		for(int i=0;i<6;i++){
			for(int j=1;j<6;j++){
				if(i<j){
					System.out.print("*");
				}else{
					System.out.print("");
				}
			}
			System.out.println("");
		}
	//Q11
		System.out.println("Q11================");
		for(int i=1;i<6;i++){
			for(int j=5;j>0;j--){
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		System.out.println("Q12================");
	//Q12
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<i; j++) {
				sum += i;
				System.out.print('*');
				}System.out.println();
			}		
		for(int i = 1; i<=5; i++) {
			for(int j = 6; i<j; j--) {
				sum += i;
				System.out.print('*');
				}System.out.println();
			}
		
	//Q13
		int num = 6;
		for (int i = 0; i < num; i++) {
		    for (int j = 1; j < num - i; j++) {
		        System.out.print(" ");
		    }
		    for (int k = 0; k < i * 2 + 1; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
