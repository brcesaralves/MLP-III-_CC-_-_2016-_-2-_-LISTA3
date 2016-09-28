package br.com.locadora.model.test;

import br.com.locadora.model.Filme;
import br.com.locadora.model.FitaInfantil;
import junit.framework.TestCase;

public class TestFitaInfantil extends TestCase{
	
	public void testAlugar(){
		
		Filme filme = new FitaInfantil();
		filme.setPreco(10.0);
		
		assertEquals(filme.alugar(10.0), 6.0);
		
	}
	
}
