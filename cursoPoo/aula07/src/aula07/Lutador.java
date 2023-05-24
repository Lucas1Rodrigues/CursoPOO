package aula07;

public class Lutador {
	//atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//Construtor
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
			int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	//getters and setters
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getNacionalidade() {
		return nacionalidade;
	}
	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	private int getIdade() {
		return idade;
	}
	private void setIdade(int idade) {
		this.idade = idade;
	}
	private double getAltura() {
		return altura;
	}
	private void setAltura(double altura) {
		this.altura = altura;
	}
	private double getPeso() {
		return peso;
	}
	private void setPeso(double peso) {
		this.peso = peso;
		
	}
	private String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(this.getPeso()< 52.5) {
			this.categoria= "Peso inválido";
		}else if(this.getPeso() < 72.9) {
			this.categoria = "Peso Galo";
		}else if(this.getPeso() < 82.7) {
			this.categoria = "Peso médio";
		}else if(this.getPeso()< 102.1) {
			this.categoria = "Peso pesado";
		}else {
			this.categoria = "Peso inválido";
		}
	}
	private int getVitorias() {
		return vitorias;
	}
	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	private int getDerrotas() {
		return derrotas;
	}
	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	private int getEmpates() {
		return empates;
	}
	private void setEmpates(int empates) {
		this.empates = empates;
	}
	//Metodos
	public void apresentar() {
		System.out.println("Este é o " + this.getNome());
		System.out.println("nascida na  " + this.getNacionalidade());
		System.out.println("Este é o " + this.getNome());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("com "  + this.getIdade() + "de idade,");
		System.out.println("e pesando " + this.getPeso() + " kilos ");
		System.out.println("com a categoria:  " + this.getCategoria());
		System.out.println("Vitorias: " + this.getVitorias());
		System.out.println("Derrotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());
		
	}
	public void status() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Vitorias: " + this.getVitorias());
		System.out.println("Derrotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());
	}
	public void ganharLuta() {
	this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
	this.setDerrotas(this.getDerrotas() + 1);
	}
	public void empatarLuta(){
		this.setEmpates(this.getEmpates() + 1);
	}
}
