package ex01;

public class Ex03 {
	public static void main(String[] args) {
		int a = 5, b = 6, c = 10, d = 0;
		boolean bo = false;
		d = ++a * b--;		//순서 : ++a * = b--
		System.out.printf("a = %d, b = %d, d = %d\n",a,b,d); //①6 * 6 = 36 ②이후에 a = 6, b = 5, c = 10, d = 36
		d = a++ + ++c - b--; //  
		System.out.printf("a = %d, b = %d, c = %d, d = %d\n",a,b,c,d); //①6 + 11 - 5 = 12 ①이후에  a = 7 b = 4  c = 11, d = 12 
		a = 1;
		b = 0;
		bo = a++ > 0 || 1 <  ++b * d / ++c;
		System.out.printf("a = %d, b = %d, c = %d, d = %d\n",a,b,c,d); //①2는 1또는0보다 크니까 뒤에 계산x a = 2, b = 0, c = 11 d = 12
		bo = b++ > 0 && 1 < ++a / ++c * d ++;								//검사한 부분까지는 확인 했으므로 ++a 적용
		System.out.printf("a + %d, b = %d, c = %d, d =%d\n",a,b,c,d); // a = 2 , b = 1, c = 11, d = 12
	}																	    //검사한 부분까지는 확인 했으므로 b++ 적용
}
