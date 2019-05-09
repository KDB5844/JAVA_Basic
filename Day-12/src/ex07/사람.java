package ex07;

public class 사람 {
	private String 생각;
	private String 지식;
	public String 생각말하기() {
		return 생각;
	}
	public String 지식말하기() {
		return 지식;
	}
	public void 학습(String info) {
		지식 = info;
	}
	public void 정보(String i) {
		생각 = i;
	}
}
