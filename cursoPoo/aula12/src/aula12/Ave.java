package aula12;

public class Ave extends Animal {
	//atributos
	private String corPena;
	
	//metodos
	public void fazerNinho() {
		System.out.println("Construiu um ninho");
	}
	@Override
	public void locomover() {
		System.out.println("Voando...");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo frutos");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Ave");
		
	}
	public String getCorPena() {
		return corPena;
	}
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	
			
}
