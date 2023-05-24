package aula10;

public class Aluno extends Pessoa {
	//atributos
	private int mat;
	private String curso;
	
	//metodos
	public void cancelarMat() {
		System.out.println("Matricula será cancelada!!");
	}
	//Getters and setters

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	

}
