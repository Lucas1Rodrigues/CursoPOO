package aula7;
import java.util.Random;

public class Luta {
//atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

// getter and setters
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	//metodos públicos
	public void marcarLuta(Lutador l1, Lutador l2) {
			if(l1.getCategoria().equals(l2.getCategoria()) 
				&& l1 != l2) {
				setAprovada(true);
				setDesafiado(l1);
				setDesafiante(l2);
			}else {
				setAprovada(false);
				setDesafiado(null);
				setDesafiante(null);
			}
	}

	public void lutar() {
		if(getAprovada()) {
			System.out.println("DESAFIANTE***");
			desafiante.apresentar();
			System.out.println("DESAFIADO***");
			desafiado.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // do 0 ao 2 aleatorio
			switch(vencedor) {
			case 0: //empate
				System.out.println("### Empatou ###");
				desafiante.empatarLuta();
				desafiado.empatarLuta();
				break;
			case 1: // Desafiante Venceu
				System.out.println("===========================================");
				System.out.println("DESAFIANTE VENCEU*** " + desafiante.getNome());
				System.out.println("===========================================");
				desafiante.ganharLuta();
				desafiado.perderLuta();
				break;
			case 2: //Desafiado Ganhou
				System.out.println("===========================================");
				System.out.println("DESAFIADO GANHOU*** " + desafiado.getNome());
				System.out.println("===========================================");
				desafiado.ganharLuta();
				desafiante.perderLuta();
				break;
				}
		}else {
			System.out.println("LUTA NAO PODE SER REALIZADA!!!!!");
		}
	}
}