package aula10;

public class Aula10 {

	public static void main(String[] args) {
		// PROGRAMA PRINCIPAL 
		
		Pessoa p1 = new Pessoa();
		Funcionario p2 = new Funcionario();
		Aluno p3 = new Aluno();
		Professor p4 = new Professor();
		
		p1.setNome("Mariana");
		p2.setNome("Paulo");
		p3.setNome("Julio");
		p4.setNome("Romildo");
		
		p1.setIdade(18);
		p2.setIdade(50);
		p3.setIdade(20);
		p4.setIdade(46);
		
		p2.mudarTrabalho();
		p3.setSexo('M');
		
		p4.setSalario(2000);
		p4.receberUm(200);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		System.out.println(p4.getSalario());
		
		
		
	}
	

}
