package Heranca;

public abstract class Conta {

	private int numero;
	private int agencia;
	private String banco;
	protected double saldo;
		
	public abstract double getSaldo();
	public abstract double sacar(double valor);
	public abstract double depositar(double valor);
	
	public Conta(int numero, int agencia, String banco, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.banco = banco;
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", agencia=" + agencia + ", banco=" + banco + ", saldo=" + saldo + "]";
	}	
}
