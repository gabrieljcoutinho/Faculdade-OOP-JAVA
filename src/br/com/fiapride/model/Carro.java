package br.com.fiapride.model;

public class Carro {

	// Características do objeto (agora encapsuladas)
	private String cor;
	private int somEmDb;
	private String material;

	// Construtor com atributos essenciais
	public Carro(String cor, String material, int somEmDb) {
		this.setCor(cor);
		this.setMaterial(material);
		this.setSomEmDb(somEmDb);
	}

	// Getters e Setters
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getSomEmDb() {
		return somEmDb;
	}

	public void setSomEmDb(int somEmDb) {
		this.somEmDb = somEmDb;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}