package ani;

public class Ex01 {
	public static void main(String[] args) {
		
	
		Wolf w1 = new Wolf();
		Raccoon r1 = new Raccoon();
		Dog d1 = new Dog();
		Lion l1 = new Lion();
		Tiger t1 = new Tiger();
		Cat c1 = new Cat();
		
		Ani[] ani = new Ani[] {
				d1,l1,t1,c1,r1,w1
		};
		
		for(int i = 0 ; i < ani.length; i++) {
			ani[i].bed();
			ani[i].move();
			ani[i].roar();
			ani[i].sum();
		}
	}
}
