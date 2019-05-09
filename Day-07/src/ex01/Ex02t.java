package ex01;

public class Ex02t {

	public static int digitCount(long n) {
		int ret = 1;
		while (true) {
			n = n / 10;
			if (n == 0)
				break;
			ret++;
		}
		return ret;
	}

	public static char numToChar(long n) {
		char ret = 0;
		switch ((int) n) {
		case 1:	ret = '일';	break;
		case 2:	ret = '이';	break;
		case 3:	ret = '삼';	break;
		case 4:	ret = '사';	break;
		case 5:	ret = '오';	break;
		case 6:	ret = '육';	break;
		case 7:	ret = '칠';	break;
		case 8:	ret = '팔';	break;
		case 9:	ret = '구';	break;
		}
		return ret;
	}

	public static String unit1(int n) {
		String ret = "";
		switch (n) {
		case 0:	ret = "";	break;
		case 1:	ret = "십";	break;
		case 2:	ret = "백";	break;
		case 3:	ret = "천";	break;
		}
		return ret;
	}

	public static String unit2(int n) {
		String ret = "";
		switch (n) {
		case 1:	ret = "만";	break;
		case 2:	ret = "억";	break;
		case 3:	ret = "조";	break;
		case 4:	ret = "경";	break;

		}
		return ret;
	}

	public static String convert(long n) {
		String ret = "";
		int digitCount = digitCount(n);
		//숫자의 개수를 구함
		//숫자의 개수만큼 반복하면서 숫자를 문자로 변경
		//변경된 문자를 문자열 + 를 이용하여 붙여주고
		//각 자리수에 따른 단위 문자를 붙여준다.
		//만들어진 문자열을 반환한다.
		return ret;
	}

	public static void main(String[] args) {
		System.out.println("1234 자리수:" + digitCount(1234));
		for(int i = 1; i < 10; i++) {
			System.out.println(i + ":" +numToChar(i));
		}
		System.out.println(unit1(2));
		System.out.println(unit1(1));
		System.out.println();
//		System.out.println("1 : " + convert(1));
//		System.out.println("12 : " + convert(12));
//		System.out.println("123 : " + convert(123));
//		System.out.println("1234 : " + convert(1234));
//		System.out.println("12345 : " + convert(12345));
	}
}