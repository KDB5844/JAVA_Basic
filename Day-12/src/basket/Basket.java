package basket;

/*
 * ������ ���� �����(Ŭ������ �̿�) 
 * �޴��� �̿��Ͽ� �ۼ�
 * while������ ����� ���� �����
 * �����ڸ� �̿��ؼ� count�� �ʱ�ȭ�ϱ�(0 �Ǵ� ���� ������ �ʱ�ȭ)
 * Getter,Setter ����Ͽ� ����� ���Ƿ� �ʱ�ȭ�� �����ϵ��� �ۼ�
 * 
 * <���>
 * 1��,2��,3�� �޴� �Է� �� �ش� �� �� ���� �Է�
 * ���� ���� ���� �� ���� �� ���� ����
 * ���α׷� ���� ��(�������) ������ �� �� �� ���
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


