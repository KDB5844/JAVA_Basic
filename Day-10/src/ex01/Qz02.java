package ex01;

import java.util.Scanner;

public class Qz02 {
	public static void main(String[] args) {
		int[] arr = {10,17,3,9,27,10,8,9,13,21};
		int[] invertArr = null;
		invertArr = new int[10];
		
		int min;
		int tmp;
		
		for (int i = 0; i < arr.length - 1; i++) {
		     min = i;
		     for (int j = i + 1; j < arr.length; j++) {
		    	 min = j;
		     	}
		     tmp = arr[i];
		     arr[i] = arr[min];
		     arr[min] = tmp;
		    }
		    
		for(int i = 0; i < arr.length; i++) {
		    	System.out.print(arr[i]+" ");
		    }
		
		System.out.println("");
		     
		int sum = 0;
		int sum1 = 0;
		
		for(int i = 0; i < arr.length; i+=2) {
			sum = arr[i] + invertArr[i];
		}
		for(int i = 1; i < arr.length; i+=2) {
			sum1 = arr[i] + invertArr[i];
		}
		System.out.println("(¦�� ��° ������ ��) - (Ȧ�� ��° ������ ��) : "+(sum - sum1));
		
		
		int[] sortArr = null;
		sortArr = new int[10];
		
		sortArr = arr;
		
		int min1;
		int tmp1;
		   for (int i = 0; i < sortArr.length - 1; i++) {
		     min = i;
		     for (int j = i + 1; j < sortArr.length; j++) {
		       if (sortArr[j] < sortArr[min])
		    	   min = j;
		       	 }
		      tmp = sortArr[i];
		      sortArr[i] = sortArr[min];
		      sortArr[min] = tmp;
		    }
		    for(int i = 0; i < sortArr.length; i++) {
		    	System.out.print(sortArr[i]+" ");
		    }
		    System.out.println("");
		    //���� ���ڸ� ���� ���ڰ� 1���� �ǰ� �Ͽ� rankArr��� �迭�� ������ �Է�		    		 
		    
		    int input;
		    int[] score = new int[10];
		    score = arr;
		    int[] rank = new int[10];
		    
		    Scanner sc = new Scanner(System.in);
		    
		    for(int i = 0 ; i < 10 ; i++){
		     rank[i] = 1;
		    }
		    
		    
		    for(int i = 0 ; i < 10 ; i++){
		     for(int j = 0 ; j < 10 ; j++){
		      if(score[i] < score[j])
		       rank[i] = rank[i] + 1;
		     }
		    }
		    
		    for(int i = 0 ; i < 10 ; i++){
		     System.out.println((score[i]) + "�� ���� : " + rank[i] + "��");
		    }
		
		    //���� �迭�� 1���� �迭�� �Է��ϰ� �ߺ��� ���� üũ�Ͽ� �ߺ��� ���� overArr��
		    //�ְ� �ߺ����� ���� ���� retArr�� �Է��Ͻÿ�.
	
		    
		    
	}
	
}
