package br.unipe.cc.bancario.ui;

import br.unipe.cc.bancario.modelo.ContaCorrente;

public class Principal {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente();
		cc1.setSaldo(100.00);
		cc1.creditar(50.00);
		cc1.debitar(25.00);
		
		System.out.println(cc1.getSaldo());
		
		ContaCorrente cc2 = new ContaCorrente();
		cc2.setSaldo(20.00);
		
		cc1.transferir(cc2, 20.00);
		
		System.out.println(cc2.getSaldo());
	}
}
