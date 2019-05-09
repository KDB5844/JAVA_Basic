package ani;
import ani.Mammalia;


public class DogKind extends Mammalia{
	void move() {
		System.out.println("개과처럼 움직인다");
	}
	void roar() {
		System.out.println("개과처럼 짖는다");
	}
	void breeding() {
		System.out.println("새끼를 낳는다");
	}
	void sum() {
		System.out.println("개과처럼 숨을 쉰다.");
	}
	void bed() {
		System.out.println("개과처럼 잔다");
	}
}


class Wolf extends DogKind{
	void move() {
		System.out.println("늑대처럼 움직인다");
	}
	void roar() {
		System.out.println("늑대처럼 짖는다");
	}
	void breeding() {
		System.out.println("늑대 새끼를 낳는다");
	}
	void sum() {
		System.out.println("늑대처럼 숨을 쉰다.");
	}
	void bed() {
		System.out.println("늑대처럼 잔다");
	}
	void hunter() {
		System.out.println("먹이사냥을 한다.");
	}
}

class Raccoon extends DogKind{
	void move() {
		System.out.println("너구리처럼 움직인다");
	}
	void roar() {
		System.out.println("너구리처럼 짖는다");
	}
	void breeding() {
		System.out.println("너구리새끼를 낳는다");
	}
	void sum() {
		System.out.println("너구리처럼 숨을 쉰다.");
	}
	void bed() {
		System.out.println("너구리처럼 잔다");
	}
	void hunter() {
		System.out.println("먹이사냥을 한다.(잡식)");
	}
}

class Dog extends DogKind{
	void move() {
		System.out.println("개처럼 움직인다");
	}
	void roar() {
		System.out.println("개처럼 짖는다");
	}
	void breeding() {
		System.out.println("강아지새끼를 낳는다");
	}
	void sum() {
		System.out.println("개처럼 숨을 쉰다.");
	}
	void bed() {
		System.out.println("개처럼 잔다");
	}
	void hunter() {
		System.out.println("사료를 먹는다");
	}
}

