package br.com.locadora.model.test;

import br.com.locadora.model.Filme;
import br.com.locadora.model.FitaLancamento;
import junit.framework.TestCase;

public class TestFitaLancamento extends TestCase{

public void testAlugar(){
		
		Filme filme = new FitaLancamento();
		filme.setPreco(10.0);
		
		assertEquals(filme.alugar(10.0), 12.0);
		
	}
	
}
