 

public class Visualizacao {
	//Atributos
	private Gafanhoto espectador;
	private Video filme;
	
	//construtor
	public Visualizacao(Gafanhoto espectador, Video filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}

	//metodos
	public void avaliar() {
		this.filme.setAvaliacao(5);
		
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
		
	}
	
	public void avaliar(float perc) {
		int tot = 0;
		if (perc < 50f) {
			tot = 4;
		} else if(perc < 70f){
			tot = 7;
		}else if(perc <90f) {
			tot = 9;
		}else {
			tot = 10;
		}
		this.filme.setAvaliacao(tot);
		
	}
	
	//Getters and setters
	public Gafanhoto getEspectador() {
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}
	
	
	
}
