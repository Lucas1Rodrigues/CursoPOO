package aula12;

public class Peixe extends Animal{
	//atributos
	private String corEscama;
	
	public void soltarBolhas() {
		
	}

	@Override
	public void locomover() {
		System.out.println("Nadando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("comendo algas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("peixe nao faz som...");
		
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	

}
