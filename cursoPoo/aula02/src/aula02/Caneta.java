package aula02;

public class Caneta {
	public String modelo;
	public String cor;
	public float ponta;
	public int carga;
	protected boolean tampado;
	void status() {
		System.out.println("A cor da caneta é " + this.cor);
		System.out.println("O modelo da caneta é a " + this.modelo);
		System.out.println("A ponta da caneta é " + this.ponta);
		System.out.println("Ela possui " + this.carga + "% de carga");
		System.out.println("Esta tampado?" + this.tampado);
		System.out.println("\n");
	}
	public void rabiscar() {
		if(this.tampado == false) {
			System.out.println("Estou rabiscando com a caneta ");
		}else {
			System.out.println("Erro! preciso estar destampada ");
		}
		
	}
	
	protected void tampar() {
		this.tampado = true;
		
	}

	void destampar() {
		this.tampado = false;
		
	}
}
