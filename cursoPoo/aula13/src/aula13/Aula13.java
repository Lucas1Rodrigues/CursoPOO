package aula13;

public class Aula13 {

	public static void main(String[] args) {
		Lobo l1 = new Lobo();
		Cachorro c1 = new Cachorro();
		Mamifero m1 = new Mamifero();
		m1.emitirSom();
		c1.emitirSom();
		l1.emitirSom();
		
		System.out.println("====================");
		c1.reagir("olá");
		c1.reagir("Vai apanhar");
		c1.reagir(11,45);
		c1.reagir(21, 0);
		c1.reagir(true);
		c1.reagir(false);
		c1.reagir(2,12.5f);
		c1.reagir(17,4.5f);
		

	}

}
