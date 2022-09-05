package entities;

public class Conta {

	// atributos
	private String id;
	private String portador;
	private String nomeSocial;
	private double saldo;
	
	// construtor
	public Conta(String id, String portador) {
		this.id = id;
		this.portador = portador;
		this.saldo = 0.0;
	}
	
	public Conta(String id, String portador, String nomeSocial) {
		this.id = id;
		this.portador = portador;
		this.nomeSocial = nomeSocial;
		this.saldo = 0.0;
	}

	// getters and setters	
	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public String getId() {
		return id;
	}

	public String getPortador() {
		return portador;
	}

	public double getSaldo() {
		return saldo;
	}
	
	// metodos
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if ( saldo >= valor ) {
			saldo -= valor;
			return true;
		}
		
		return false;
	}
	
	public boolean transferir(double valor, Conta destino) {
		if( this.sacar(valor) ) {
			destino.depositar(valor);
			return true;
		}
		
		return false;
	}
	
}
