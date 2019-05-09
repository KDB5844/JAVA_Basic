package ani;

class CatKind extends Mammalia{
	void move() {
		System.out.println("°í¾çÀÌ°úÃ³·³ ¿òÁ÷ÀÎ´Ù");
	}
	void roar() {
		System.out.println("°í¾çÀÌ°úÃ³·³ Â¢´Â´Ù");
	}
	void breeding() {
		System.out.println("»õ³¢¸¦ ³º´Â´Ù");
	}
	void sum() {
		System.out.println("°í¾çÀÌ°úÃ³·³ ¼ûÀ» ½®´Ù.");
	}
	void bed() {
		System.out.println("°í¾çÀÌ°úÃ³·³ ÀÜ´Ù");
	}
}

class Tiger extends CatKind{
	void move() {
		System.out.println("È£¶ûÀÌÃ³·³ ¿òÁ÷ÀÎ´Ù");
	}
	void roar() {
		System.out.println("È£¶ûÀÌÃ³·³ Â¢´Â´Ù");
	}
	void breeding() {
		System.out.println("È£¶ûÀÌ»õ³¢¸¦ ³º´Â´Ù");
	}
	void sum() {
		System.out.println("È£¶ûÀÌÃ³·³ ¼ûÀ» ½®´Ù.");
	}
	void bed() {
		System.out.println("È£¶ûÀÌÃ³·³ ÀÜ´Ù");
	}
	void hunter() {
		System.out.println("¸ÔÀÌ »ç³ÉÀ» ÇÑ´Ù.");
	}
}

class Lion extends CatKind{
	void move() {
		System.out.println("»çÀÚÃ³·³ ¿òÁ÷ÀÎ´Ù");
	}
	void roar() {
		System.out.println("»çÀÚÃ³·³ Â¢´Â´Ù");
	}
	void breeding() {
		System.out.println("»çÀÚ»õ³¢¸¦ ³º´Â´Ù");
	}
	void sum() {
		System.out.println("»çÀÚÃ³·³ ¼ûÀ» ½®´Ù.");
	}
	void bed() {
		System.out.println("»çÀÚÃ³·³ ÀÜ´Ù");
	}
	void hunter() {
		System.out.println("¸ÔÀÌ »ç³ÉÀ» ÇÑ´Ù.");
	}
}


class Cat extends CatKind{
	void move() {
		System.out.println("°í¾çÀÌÃ³·³ ¿òÁ÷ÀÎ´Ù");
	}
	void roar() {
		System.out.println("°í¾çÀÌÃ³·³ Â¢´Â´Ù");
	}
	void breeding() {
		System.out.println("°í¾çÀÌ»õ³¢¸¦ ³º´Â´Ù");
	}
	void sum() {
		System.out.println("°í¾çÀÌÃ³·³ ¼ûÀ» ½®´Ù.");
	}
	void bed() {
		System.out.println("°í¾çÀÌÃ³·³ ÀÜ´Ù");
	}
	void hunter() {
		System.out.println("»ç·á¸¦ ¸Ô´Â´Ù");
	}
}

	
	