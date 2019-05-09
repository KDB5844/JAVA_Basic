package ex01;


/*
 *	무한배열 만들기 - 1
 *	정수가 저장하는 매열을 무한대로 늘어나도록 작성 
 */

public class Qz03 {
	public static void main(String[] args) {
		//배열은 늘어나지 않는다.
		//자바에서 배열은 객체이며 동적으로 생성된다.
		int[] arr = {1, 2, 3};	//3칸 짜리 배열
		System.out.println("길이:"+arr.length);
		int[] tmp = arr;
		arr = new int[6];	//6칸 짜리 배열 생성
		for(int i = 0; i < tmp.length; i++) {
			arr[i] = tmp[i]; //기존 값 대입
		}
		tmp = null;	//기존 배열 참조 해제
		System.out.println("길이:"+arr.length);
		arr[3] = 4;	arr[4] = 5;	arr[5] = 6;
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
