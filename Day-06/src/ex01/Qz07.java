package ex01;


 

public class Qz07 {
	//���ڷ� N�� �����ϸ� N�� ���� ���밪�� ��ȯ�ϴ� �Լ�
	public static int abs(int a) {
		int ret = 0;
		if(a<0) {
			ret =(a-(a*2));return ret;
		}else {
			ret = a;
		}return ret;
	}
	
	//cm���� inch ������ ��ȯ�ϴ� �Լ�(1 inch == 2.54cm) //1cm =0.39inch
	public static float inch(float a) {
		
		float swich = a/2.54f;
		return swich;
	}
	//������ �뷮(byte)�� �Ű������� �Է� �޾� bit������ ��ȯ�ϴ� �Լ�
	//������ �뷮�� �Է��� �� ������ �Է��Ѵ�.(G, M, K)
	public static long byteToBit(long a,char ch) {
		long ret = 0;
		
		if(ch == 'G') {
			ret = a*1024*1024*1024*8;
		return ret;
		}
		else if(ch == 'M') {
			ret = a*1024*1024*8;
			return ret;
			}
		else if(ch == 'K') {
			ret = a*1024*8;
			return ret;
			}return 0;
	}
	
	//���ڷ� N�� �����ϸ� N�� ���� ���丮���� ��ȯ�ϴ� �Լ�
	public static int fac(int a) {
		int sum = 1;
		for(; a > 0; a-- ) {
			sum *= a;
		}return sum;
	}
	
	//���ڷ� N�� �����ϸ� �Ųٷ� ���� ���� ��ȯ�ϴ� �Լ�
	public static void rev(int a) {
		do {
			System.out.print(a % 10);
			a = a/10;
		}while(a>0);
	}
	
	
	
	public static void main(String[] args) {
		//Q1
		int ret = 0 ;
		int a = -20;
		ret = abs(a);
		System.out.println(ret);
		
		//Q2
		float cm = (float) 2.54;
		float ret1 = inch(cm);
		System.out.printf(ret1+"��ġ");
		System.out.println();
		
		//Q3
		long ret2 = byteToBit(1,'G');
		System.out.println(ret2+"bit");
	
		//Q4
		int ret3 = fac(4);
		System.out.println(ret3);
		
		//Q5 1.35 x 1.35
		rev(12345);
	}
	
}
