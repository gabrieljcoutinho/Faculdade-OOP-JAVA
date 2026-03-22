package br.com.fiapride.model;

public class Carro {

    private String individuo;
    private String placa;
    private double gasolina;

    // Construtor robusto: garante que o objeto não nasça com dados inválidos
    public Carro(String individuo, String placa, double gasolina) {
        this.individuo = individuo;
        this.placa = placa;
        setGasolina(gasolina);
    }

    // Método de negócio: Abastecer (impede valores negativos ou zerados)
    public void adicionarGasolina(double quantidade) {
        if (quantidade > 0) {
            this.gasolina += quantidade;
            System.out.println("Sucesso: Abastecimento de " + quantidade + "L realizado.");
        } else {
            System.out.println("Erro: Quantidade de abastecimento inválida.");
        }
    }

    // Método de negócio: Consumo (impede que o carro rode sem combustível)
    public void gastarGasolina(double quantidade) {
        if (quantidade > 0 && (this.gasolina - quantidade >= 0)) {
            this.gasolina -= quantidade;
        } else {
            System.out.println("Alerta: Combustível insuficiente para esta operação.");
        }
    }

    // Getters e Setters com proteção
    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        // Blindagem: se tentarem setar valor negativo, o sistema assume 0
        this.gasolina = Math.max(0, gasolina);
    }
}