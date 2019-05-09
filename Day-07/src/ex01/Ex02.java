package ex01;

import java.util.Scanner;
import java.math.BigInteger;

// 숫자를 아라비아 숫자 형태로 받아 한국어 숫자 표기법에 따라 반환하는 예제.

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("-2,147,483,648 ~ 2,147,483,647 사이의");
	    System.out.println("한글로 읽을 숫자를 아라비아 숫자 형태로 입력하세요:");
	    BigInteger number = scanner.nextBigInteger();
	    System.out.println("결과는 <" + intToKorean((BigInteger)number, false) + ">입니다.");
	}


//임의의 숫자를 받아 한국어 숫자 표기 기법에 따라 변환한 문자열을 반환한다.
//자릿수는 다음과 같이 읽는다. 0은 영, 1은 일, 2는 이, 3은 삼, 4는 사,
//5는 오, 6는 육, 7은 칠, 8은 팔, 9는 구로 읽는다.
//자리는 10은 십, 100은 백, 1,000은 천, 10,000은 만에 해당한다.
//각 자리의 자리수들을 읽어 자리와 짝을 지어 읽는다.
 

//영과 일은 읽는 방법이 약간 다르다.
//영은 수 전체가 0인 때에만 읽으며, 그렇지 않을 때에는 자릿수와 자리를 모두 생략한다.
//예를 들어 200은 이백영십영이 아니라 이백으로 읽되, 0은 영이다.

	
//일은 자릿수를 생략하고 자리를 바로 읽는 것을 관습으로 하되,
//만단위로 나눈 작은 자리에서 일의 자리를 차지하면 생략하지 않는다.
//예를 들어 100은 일백이 아니라 백으로 읽는다.
//반면 101은 백일로 마지막 일을 생략하지 않고 읽는다.
//마찬가지로 110,000은 십일만이다.


//돈의 단위와 같이 명확하게 읽어야 할 때에는 일을 생략하지 않는다.
//예를 들어서 "현금 100,000만원 정"은 "현금 일십만원 정"으로 읽는다.


//만 이상의 수는 만 단위로 잘라내어 작은 자리로 읽고, 각 자리 사이에 한 칸을 띈다.
//큰 자릿수는 작은 것부터 만, 억, 조, 경, 해 순으로 읽는다.
//예를 들어 "1,234,567,890"은 "십이억 삼천사백오십육만 칠천팔백구십" 으로 읽는다.

	private static String intToKorean(BigInteger number, boolean official) {
		// TODO Auto-generated method stub
		return null;
	}


	static String intToKorean(int number, boolean official){
		;
        if (number < 0)
            return "마이너스 " + intToKorean(-number, official);

        if (number == 0)
            return "영";

        String digits = toString(number);
        int len = digits.length();
        StringBuilder builder = new StringBuilder();
        boolean subcount = false;

        for (int i = 0; i < len; i++){
            int base = len - i - 1; // 현재 다루고 있는 자릿수
            int baseMod4 = base % 4; // 만단위내 일십백천 단위
            int digit = digits.charAt(i) - '0';

            if (digit != 0){
                subcount = true;

                if (digit == 1){
                    if (official || baseMod4 == 0)
                        builder.append('일');
                }
                else
                   builder.append("이삼사오육칠팔구".charAt(digit - 2));

               	if (baseMod4 > 0)
                   builder.append("십백천".charAt(baseMod4 - 1));
	            }
	            
            if (baseMod4 == 0){
                if (subcount && base > 0)
                builder.append("만억조경해".charAt(base / 4 - 1)).append(' ');
	                
                subcount = false;
            }
        }
        return builder.toString();
    }


	private static String toString(int number) {
		// TODO Auto-generated method stub
		return null;
	}
}