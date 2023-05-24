package aula02;

public class Sofa {
	String cor;
	int qtsLugares;
	boolean isConfortavel;
	boolean isRasgado;
	
	void status() {
		System.out.println("Cor: " + this.cor);
		System.out.println("Lugares " + this.qtsLugares);
	}
	void estado() {
		if(this.isConfortavel) {
			if(this.isRasgado) { //true
				System.out.println("Vamos consertar"); //true
			}
			else 
			{
				System.out.println("Está perfeito para uso"); //false
			}
			
	}
}
}
