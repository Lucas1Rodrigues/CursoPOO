package aula05;

public class ContaBanco {
	//Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	//Metodos
	public void estadoAtual() {
		System.out.println("--------------------------------------------");
		System.out.println("Numero da conta: " + this.getNumConta());
		System.out.println("Tipo de conta: " + this.getTipo());
		System.out.println("Nome do dono: " + this.getDono());
		System.out.println("Saldo da conta: " + this.getSaldo());
		System.out.println("Conta esta ativa? " + this.isStatus());
		System.out.println("-----------------------------------------------");
	}
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		this.status = true;
		if(this.tipo=="cc") {
			this.setSaldo(50);
		}else if(this.tipo=="pp") {
			this.setSaldo(150);
		}
		
	}
	public void sacar(double dinheiro) {
		if(this.isStatus()) {
			if(this.getSaldo() >= dinheiro){
				this.setSaldo(this.getSaldo() - dinheiro);		
			}else{
				System.out.println("Saldo Insuficiente!");
			}
		}else {
			System.out.println("Imposivel sacar, regularize sua conta!");
		}
	}
	
	public void fecharConta() {
		if(this.getSaldo() == 0) {
			setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}else if(this.saldo>0){
			System.out.println("Você precisa retirar o seu dinheiro antes de fechar a conta ");
		}else if(this.saldo < 0) {
			System.out.println("Você precisa pagar o saldo devedor para fechar a conta");
		}
	}
	public void depositar(double dinheiro) {
		if(isStatus()) {
		this.setSaldo(this.getSaldo() + dinheiro);
		}
		else
		{
			System.out.println("impossivel depositar!");
		}
		
	}
		
	public void pagarMensal() {
		int valorMensal = 0;
		if(this.getTipo() == "cc") {
			valorMensal = 12;		
		}else if(this.getTipo() == "pp") {
			valorMensal = 20;
		}
		if(isStatus()) {
			if(this.getSaldo() > valorMensal) {
				this.setSaldo(this.getSaldo() - valorMensal);
			}else {
				System.out.println("Saldo insuficiente! ");
			}
		}else {
			System.out.println("Regularize sua conta.");
		}
	
	}
	
	//Contructor
	public ContaBanco() {
		this.saldo = 0;
		this.status = false;
		
	}
	
	//Getters and Setters
	public int getNumConta() {
		return numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
		
	}
	
