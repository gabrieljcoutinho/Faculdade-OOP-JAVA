package br.com.fiapride.main;
import br.com.fiapride.model.Carro;
public class SistemaPrincipal {
	public static void main(String[] args) {

		// Exercicio do Violao
		// Dentro do main...// Fabriquei a primeira (Instância 1)
		Carro meuCarro = new Carro();
		meuCarro.somEmDb = 10;
		meuCarro.cor = "Preto";
		meuCarro.material = "Aço";
		// Fabriquei a segunda (Instância 2)
		Carro carroDoJorge = new Carro();
		carroDoJorge.somEmDb = 15;
		carroDoJorge.cor = "Cinza";
		carroDoJorge.material = "Aço";
		System.out.println("Meu carro é: " + meuCarro.cor);
		System.out.println("O do Jorge é: " + carroDoJorge.cor);


		}
		}
