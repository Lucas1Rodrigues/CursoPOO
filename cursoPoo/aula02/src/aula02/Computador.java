package aula02;

public class Computador {
	String cor;
	float tamanhoTela;
	String marca = "Acer";
	String modelo;
	boolean estaLigado;

	void status() {
		System.out.println("Este computador possui cor " + this.cor);
		System.out.println("Com um tamanho de tela de " + this.tamanhoTela + " polegadas");
		System.out.println("Possui o modelo " + this.modelo + " da marca " + this.marca);
		System.out.println("Está ligado? (True/false) " + this.estaLigado);
		System.out.println("\n");
	}

	void praticar() {
		System.out.println("Estou praticando codigo na minha maquina ");
		
	}

	void jogar() {
		System.out.println("Estou jogando no meu computador ");

	}

	void digitar() {
		System.out.println("Estou digitando...");
		
	}
}