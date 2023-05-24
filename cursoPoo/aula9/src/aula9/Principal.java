package aula9;

public class Principal {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[3];
		p[0] = new Pessoa("Pedrin matador",57,'m');
		p[1] = new Pessoa("Joao coboatão",19,'m');
		p[2] = new Pessoa("Maria florzinha",200,'F');
		
		Livro[] l = new Livro[2];
		l[0] = new Livro("Aprendendo programacao","Joao feital",302,p[2]);
		l[0].abrir();
		l[0].setPagAtual(100);
		l[0].avancarPag();
		
		System.out.println(l[0].detalhes());
		System.out.println(l[0].getAutor());
		
		
	}
	
	
}
