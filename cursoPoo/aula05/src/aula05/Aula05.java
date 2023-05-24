package aula05;

public class Aula05 {

	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco();
		c1.setNumConta(11111);
		c1.setDono("jubileu");
		c1.abrirConta("cc");
		c1.depositar(1000);
		c1.sacar(350);
		c1.sacar(700);
		c1.fecharConta();
		
		ContaBanco c2 = new ContaBanco();
		c2.setNumConta(22222);
		c2.setDono("Creuza");
		c2.abrirConta("pp");
		c2.sacar(150);
		c2.fecharConta();
		
		c1.estadoAtual();
		c2.estadoAtual();

	}

}
