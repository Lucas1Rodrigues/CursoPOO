package aula7;

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
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNacionalidade() {
			return nacionalidade;
		}
		public void setNacionalidade(String nacionalidade) {
			this.nacionalidade = nacionalidade;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
			if(this.getPeso()< 52.5) {
				this.categoria= "Peso inválido";
			}else if(this.getPeso() < 72.9) {
				this.categoria = "Peso Galo";
			}else if(this.getPeso() < 82.7) {
				this.categoria = "Peso médio";
			}else if(this.getPeso()< 110.1) {
				this.categoria = "Peso pesado";
			}else {
				this.categoria = "Peso inválido";
			}
			
		}
		public String getCategoria() {
			return categoria;
		}
		public void setCategoria(String categoria) {
			
		}
		public int getVitorias() {
			return vitorias;
		}
		public void setVitorias(int vitorias) {
			this.vitorias = vitorias;
		}
		public int getDerrotas() {
			return derrotas;
		}
		public void setDerrotas(int derrotas) {
			this.derrotas = derrotas;
		}
		public int getEmpates() {
			return empates;
		}
		public void setEmpates(int empates) {
			this.empates = empates;
		}
		//Metodos
		public void apresentar() {
			System.out.println("============================================");
			System.out.println("Este é o " + this.getNome());
			System.out.println("nascido na  " + this.getNacionalidade());
			System.out.println("Altura: " + this.getAltura());
			System.out.println("com "  + this.getIdade() + "de idade,");
			System.out.println("e pesando " + this.getPeso() + " kilos ");
			System.out.println("com a categoria:  " + this.getCategoria());
			System.out.println("Vitorias: " + this.getVitorias());
			System.out.println("Derrotas: " + this.getDerrotas());
			System.out.println("Empates: " + this.getEmpates());
			System.out.println("=======================================");
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
