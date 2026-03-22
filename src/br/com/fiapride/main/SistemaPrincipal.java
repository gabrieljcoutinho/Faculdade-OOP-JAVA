package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class SistemaPrincipal {

	public static void main(String[] args) {

		// Agora obrigatoriamente passando dados no construtor
		Carro meuCarro = new Carro("Preto", "Aço", 10);
		Carro carroDoJorge = new Carro("Cinza", "Aço", 15);

		System.out.println("Meu carro é: " + meuCarro.getCor());
		System.out.println("O do Jorge é: " + carroDoJorge.getCor());
	}
}