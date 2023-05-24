package aula04;

public class Caneta {
	private String modelo;
	private String cor;
	private float ponta;
	private boolean tampada;
	
	
	public Caneta(String m) {
		this.modelo = m;
	}
	
	public void status() {
		System.out.println("O modelo é " + this.modelo);
	}
}
	