package aula02;

public class Aula02 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampado = false;
		c1.modelo = "Bic";
		c1.carga = 90;
		c1.tampar();
		c1.rabiscar();
		
		
		c1.status();
		//Objeto computador
		Computador pc1 = new Computador();
		pc1.cor = "Preto";
		pc1.estaLigado = true;
		pc1.modelo = "Acer aspire 3";
		pc1.tamanhoTela = 15.5f;
		
		pc1.status();
		pc1.digitar();
		
		//objeto sofa
		Sofa sf1 = new Sofa();
		sf1.cor = "Bege";
		sf1.qtsLugares = 2;
		sf1.isConfortavel = true;
		sf1.isRasgado = true;
		sf1.status();
		sf1.estado();
		
		//objeto aula
		Aula a1 = new Aula();
		a1.data="10/04/2023";
		a1.disciplina = "Programaçao orientada a objetos";
		a1.duracao = 1.30f;
		a1.nomeProfessor = "Lucas";
		a1.status();
	

}
}
