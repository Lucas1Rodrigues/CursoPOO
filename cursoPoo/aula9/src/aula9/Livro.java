package aula9;

public class Livro implements Publicacao {
	//atributos
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	//Metodos
	public String detalhes() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", totPaginas=" + totPaginas + ", pagAtual=" + pagAtual
				+ ", aberto=" + aberto + ", leitor=" + leitor.getNome()  + "]" + "\nSexo Leitor[ " + leitor.getSexo() + " ] idade leitor[ "+ leitor.getIdade() + "]";
	}

	//Construtor
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}

	//metodos interface
	@Override
	public void abrir() {
		this.setAberto(true);
		
	}

	@Override
	public void fechar() {
				if(this.isAberto() == true) {
					this.setAberto(false);
				}
	}

	@Override
	public void folhear(int pagAtual) {
		if(this.isAberto()) {
		this.setPagAtual(pagAtual);
		}else {
			System.out.println("Livro esta fechado");
		}
	}

	@Override
	public void avancarPag() {
		if(this.isAberto()) {
		this.setPagAtual(this.getPagAtual() + 1);
		}else {
			System.out.println("Livro esta fechado");
		}
	}

	@Override
	public void voltarPag() {
		if(this.isAberto()) {
		this.setPagAtual(this.getPagAtual() - 1);
		}else {
			System.out.println("Livro esta fechado");
		}
	}
	@Override
	public void folhear() {
		// TODO Auto-generated method stub
		
	}
	//Getters and Setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	

}