package br.unipe.cc.bancario.modelo;

public abstract class Conta {
	
	protected double saldo;
	
	public abstract void creditar(double valor);
	public abstract void debitar(double valor);
	public abstract void transferir(Conta conta, double valor);
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
