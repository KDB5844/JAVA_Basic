
public class Flag2 {
	public static void main(String[] args) {
		
		int line = 9;
		int star = 1;
		int space = line/2;
		boolean flag = true;
		for(int j = 0; j < line; j++) {
			for(int i = 0; i < space; i++) {
				System.out.print(" ");
			}
		
			for(int i = 0; i < star; i++) {
				System.out.print("*");
			}
		
			System.out.println();
			
			if(j == line/2) {
				flag = !flag;
			}
			if(flag) {
				star+=2;
				space--;
			}else {
				star-=2;
				space++;
			}
		}
	}
}