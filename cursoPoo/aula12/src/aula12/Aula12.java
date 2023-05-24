package aula12;

public class Aula12 {

	public static void main(String[] args) {
		// Programa principal
		
		Mamifero m = new Mamifero();
		m.setPeso(21.2f);
		m.setIdade(12);
		m.setMembros(4);
		m.setCorPelo("preto");
		
		//Cachorro
		Cachorro c = new Cachorro();
		c.setPeso(12.7f);
		c.setIdade(3);
		c.setMembros(4);
		c.setCorPelo("Caramelo");
		c.locomover();
		c.emitirSom();
		System.out.println("Cachorro " + c.toString());
		
		System.out.println("------------------------------------");
		
		//Mamifero
		m.locomover();
		m.emitirSom();
		System.out.println(m.toString());
	}

}
