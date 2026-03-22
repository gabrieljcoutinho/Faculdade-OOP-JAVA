package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class SistemaPrincipal {
 public SistemaPrincipal() {


 }

public static void main(String[] args) {
 Carro meuCarro = new Carro();
 meuCarro.somEmDb = 10;
 meuCarro.cor = "Preto";
 meuCarro.material = "Aço";
 Carro carroDoJorge = new Carro();
 carroDoJorge.somEmDb = 15;
 carroDoJorge.cor = "Cinza";
 carroDoJorge.material = "Aço";
 System.out.println("Meu carro é: " + meuCarro.cor);
 System.out.println("O do Jorge é: " + carroDoJorge.cor);
}
}