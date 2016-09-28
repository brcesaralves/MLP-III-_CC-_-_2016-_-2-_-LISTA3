package br.unipe.cc.bancario.modelo.test;

import br.unipe.cc.bancario.modelo.Conta;
import br.unipe.cc.bancario.modelo.ContaCorrente;
import junit.framework.TestCase;

public class TestContaCorrente extends TestCase {
	
	private Conta cc;
	
	public void setUp() {
		System.out.println("setUp().");
		cc = new ContaCorrente();	
		cc.setSaldo(10.00);
	}
	
	public void tearDown() {
		System.out.println("tearDown().");
		cc = null;
	}

	
	public void testDebitar() {
		System.out.println("testDebitar().");
		cc.debitar(5.00);
		assertEquals(cc.getSaldo(), 5.00);
	}

	public void testCreditar() {
		System.out.println("testCreditar().");
		cc.creditar(100.00);
		assertEquals(cc.getSaldo(), 110.00);
	}
	
	public void testTransferir(){
		System.out.println("testTransferir().");
		Conta contaDestino = new ContaCorrente();
		cc.creditar(100.00);

		cc.transferir(contaDestino, 100.00);
		assertEquals(cc.getSaldo(), 10.00);
		
	}
	
}
