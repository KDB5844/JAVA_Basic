package ex01;

import java.util.Scanner;

/*
 * Ű���� �Է� / �ܼ� ���
 * 
 * �޼��� �Է�(�Ű�����) �޼��� ���(��ȯ)
 * 
 * */

	

public class Qz01 {
public static int bigNum(int n1,int n2) {
	int ret = 0;	
	if(n1 > n2) {
			ret = n1;
		}
	else {
		ret = n2;
		}
	return ret;
	}

	
	public static void main(String[] args) {
		//�� ���� �Է¹޾� ū ���� ����ϴ� �޼���
		int n1 = 10;
		int n2 = 20;
		int ret = bigNum(n1, n2);
		System.out.println(ret);
		System.out.println(bigNum(n2,n1));
	}
}
