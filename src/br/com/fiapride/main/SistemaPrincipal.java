package br.com.fiapride.main;
import br.com.fiapride.model.Violao;
public class SistemaPrincipal {
	public static void main(String[] args) {

		// Exercicio do Violao
		// Dentro do main...// Fabriquei a primeira (Instância 1)
		Violao meuViolao = new Violao();
		meuViolao.somEmDb = 10;
		meuViolao.cor = "Amarelo";
		meuViolao.material = "Madeira";
		// Fabriquei a segunda (Instância 2)
		Violao violaoDoJorge = new Violao();
		violaoDoJorge.somEmDb = 15;
		violaoDoJorge.cor = "Laranja";
		violaoDoJorge.material = "Cano de Madeira";
		System.out.println("Meu violão é da cor: " + meuViolao.cor);
		System.out.println("O do Madara é: " + violaoDoJorge.cor);


		}
		}
