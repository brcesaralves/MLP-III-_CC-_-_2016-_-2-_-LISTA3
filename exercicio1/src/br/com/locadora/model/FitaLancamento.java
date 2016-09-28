package br.com.locadora.model;

public class FitaLancamento extends Filme{
	
	public double alugar(double preco){
		return (preco*0.2)+ preco;
	}

}
