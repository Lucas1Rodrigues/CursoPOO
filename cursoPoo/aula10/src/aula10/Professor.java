package aula10;

public class Professor extends Pessoa {
	//atributo
	private String especialidade;
	private float salario;
	
	//metodos
	public void receberUm(float aum) {
		this.salario += aum;
	}
	//getters and setters

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	

}
