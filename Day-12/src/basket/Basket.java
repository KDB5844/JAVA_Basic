package basket;

/*
 * 농구점수 계산기 만들기(클래스를 이용) 
 * 메뉴를 이용하여 작성
 * while문으로 만들고 종료 만들기
 * 생성자를 이용해서 count값 초기화하기(0 또는 임의 값으로 초기화)
 * Getter,Setter 사용하여 사용자 임의로 초기화가 가능하도록 작성
 * 
 * <기능>
 * 1점,2점,3점 메뉴 입력 시 해당 골 과 득점 입력
 * 각각 골의 수와 총 골의 수 개별 누적
 * 프로그램 종료 시(경기종료) 총점과 총 골 수 출력
 */
//count
public class Basket {
	private int[] cnt = {0,0,0};
	
	private int[] sum = {0,0,0};

	public int[] getCnt() {
		return cnt;
	}

	public void setCnt(int[] cnt) {
		this.cnt = cnt;
	}

	public int[] getSum() {
		return sum;
	}

	public void setSum(int[] sum) {
		this.sum = sum;
	}
	

}


