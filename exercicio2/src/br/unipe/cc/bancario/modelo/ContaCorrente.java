package br.unipe.cc.bancario.modelo;


public class ContaCorrente extends Conta {
	
	public void debitar(double valor) {
		if (this.saldo > valor) {
			this.saldo -= valor;
		}
	}

	public void creditar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}

	public void transferir(Conta destino, double valor) {
		if (this.saldo > valor) {
			this.debitar(valor);
			destino.creditar(valor);
		}
	}

}
