package br.com.locadora.model;

public class FitaInfantil extends Filme{
	
	public double alugar(double preco){
		return preco - (preco*0.4);
	}

}
