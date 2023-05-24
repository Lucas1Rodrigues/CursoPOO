package aula11;

public class Aula11 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		
		a1.setNome("Jubiscraudio");
		a1.setIdade(19);
		a1.setSexo('M');
		a1.setCurso("Programação");
		a1.setMatricula(1112121);
		
		System.out.println(a1.dadosPessoa());
		System.out.println(a1.dadosCurso());
	
		Bolsista b1 = new Bolsista();
		b1.setNome("Paulina");
		b1.setIdade(23);
		b1.setSexo('F');
		b1.setMatricula(122121);
		b1.setCurso("Auxiliar de Programa");
		b1.setBolsa(1000);
		
		System.out.println(b1.dadosPessoa());
		System.out.println(b1.dadosCurso());
		System.out.println(b1.getBolsa());
		
		
		
	}

}
