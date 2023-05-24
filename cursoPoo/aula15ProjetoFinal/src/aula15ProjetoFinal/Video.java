 

public class Video implements AcoesVideo{
	//atributos
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	//Construtor
	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.avaliacao = 0;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}

	//Metodos
	@Override
	public void play() {
		this.setReproduzindo(true);
		
	}

	@Override
	public void pause() {
		this.setReproduzindo(false);
		
	}

	@Override
	public void like() {
		this.setCurtidas(getCurtidas()+1);
		
	}
	
	// Getters and setters
	private String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	private int getCurtidas() {
		return curtidas;
	}

	private void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	private boolean getReproduzindo() {
		return reproduzindo;
	}

	private void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}
	
	
	

}
