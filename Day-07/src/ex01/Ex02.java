package ex01;

import java.util.Scanner;
import java.math.BigInteger;

// ���ڸ� �ƶ��� ���� ���·� �޾� �ѱ��� ���� ǥ����� ���� ��ȯ�ϴ� ����.

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("-2,147,483,648 ~ 2,147,483,647 ������");
	    System.out.println("�ѱ۷� ���� ���ڸ� �ƶ��� ���� ���·� �Է��ϼ���:");
	    BigInteger number = scanner.nextBigInteger();
	    System.out.println("����� <" + intToKorean((BigInteger)number, false) + ">�Դϴ�.");
	}


//������ ���ڸ� �޾� �ѱ��� ���� ǥ�� ����� ���� ��ȯ�� ���ڿ��� ��ȯ�Ѵ�.
//�ڸ����� ������ ���� �д´�. 0�� ��, 1�� ��, 2�� ��, 3�� ��, 4�� ��,
//5�� ��, 6�� ��, 7�� ĥ, 8�� ��, 9�� ���� �д´�.
//�ڸ��� 10�� ��, 100�� ��, 1,000�� õ, 10,000�� ���� �ش��Ѵ�.
//�� �ڸ��� �ڸ������� �о� �ڸ��� ¦�� ���� �д´�.
 

//���� ���� �д� ����� �ణ �ٸ���.
//���� �� ��ü�� 0�� ������ ������, �׷��� ���� ������ �ڸ����� �ڸ��� ��� �����Ѵ�.
//���� ��� 200�� �̹鿵�ʿ��� �ƴ϶� �̹����� �е�, 0�� ���̴�.

	
//���� �ڸ����� �����ϰ� �ڸ��� �ٷ� �д� ���� �������� �ϵ�,
//�������� ���� ���� �ڸ����� ���� �ڸ��� �����ϸ� �������� �ʴ´�.
//���� ��� 100�� �Ϲ��� �ƴ϶� ������ �д´�.
//�ݸ� 101�� ���Ϸ� ������ ���� �������� �ʰ� �д´�.
//���������� 110,000�� ���ϸ��̴�.


//���� ������ ���� ��Ȯ�ϰ� �о�� �� ������ ���� �������� �ʴ´�.
//���� �� "���� 100,000���� ��"�� "���� �Ͻʸ��� ��"���� �д´�.


//�� �̻��� ���� �� ������ �߶󳻾� ���� �ڸ��� �а�, �� �ڸ� ���̿� �� ĭ�� ���.
//ū �ڸ����� ���� �ͺ��� ��, ��, ��, ��, �� ������ �д´�.
//���� ��� "1,234,567,890"�� "���̾� ��õ���������� ĥõ�ȹ鱸��" ���� �д´�.

	private static String intToKorean(BigInteger number, boolean official) {
		// TODO Auto-generated method stub
		return null;
	}


	static String intToKorean(int number, boolean official){
		;
        if (number < 0)
            return "���̳ʽ� " + intToKorean(-number, official);

        if (number == 0)
            return "��";

        String digits = toString(number);
        int len = digits.length();
        StringBuilder builder = new StringBuilder();
        boolean subcount = false;

        for (int i = 0; i < len; i++){
            int base = len - i - 1; // ���� �ٷ�� �ִ� �ڸ���
            int baseMod4 = base % 4; // �������� �Ͻʹ�õ ����
            int digit = digits.charAt(i) - '0';

            if (digit != 0){
                subcount = true;

                if (digit == 1){
                    if (official || baseMod4 == 0)
                        builder.append('��');
                }
                else
                   builder.append("�̻�����ĥ�ȱ�".charAt(digit - 2));

               	if (baseMod4 > 0)
                   builder.append("�ʹ�õ".charAt(baseMod4 - 1));
	            }
	            
            if (baseMod4 == 0){
                if (subcount && base > 0)
                builder.append("����������".charAt(base / 4 - 1)).append(' ');
	                
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