package br.com.locadora.ui;

import java.util.Scanner;

import br.com.locadora.model.Autor;
import br.com.locadora.model.Filme;
import br.com.locadora.model.FitaLancamento;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Filme fita = new FitaLancamento();
		Autor autor = new Autor();
		
		System.out.println("Digite o Titulo do filme.");
		fita.setTitulo(leitor.nextLine());
		System.out.println("Digite o categoria do filme");
		fita.setCategoria(leitor.nextLine());
		System.out.println("Digite o preco da fita.");
		fita.setPreco(leitor.nextDouble());
		leitor.nextLine();
		
		System.out.println("Digite o autor da filme.");
		autor.setNome(leitor.nextLine());
		fita.setAutor(autor);
		
		System.out.println("Valor da locacao: " + fita.alugar(fita.getPreco()));
		
		leitor.close();
		
	}

}
