 

public class Gafanhoto extends Pessoa{
	// Atributos
	private String login;
	private int totAssistindo;
	
	//construtor
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistindo = 0;
	}

	//metodos
	public void viuMaisUm() {
		this.setExperiencia(this.getExperiencia()+1);
	}
	
	//getters and setters
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistindo() {
		return totAssistindo;
	}

	public void setTotAssistindo(int totAssistindo) {
		this.totAssistindo = totAssistindo;
	}

	@Override
	public String toString() {
		return "Gafanhoto [login=" + login + "\n" + super.toString() + ", totAssistindo=" + totAssistindo + "]";
	}
	
	
	

}
