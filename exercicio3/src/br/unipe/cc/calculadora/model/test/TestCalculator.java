package br.unipe.cc.calculadora.model.test;

import br.unipe.cc.calculadora.model.Calculator;
import junit.framework.TestCase;

public class TestCalculator extends TestCase{
	
	public void testEvaluates(){
		
		Calculator calculator = new Calculator();
		int sum = calculator.evaluate("1+2+3");
				
		assertNotNull(sum);
		
		assertEquals(6, sum);
				
	}

}
