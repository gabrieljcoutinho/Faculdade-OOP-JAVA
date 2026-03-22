package br.com.fiapride.main;

import br.com.fiapride.model.Carro;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Instanciação segura conforme as regras do Módulo de Frota
        Carro v1 = new Carro("Carlos", "ABC-1234", 0);

        // Operações de fluxo de combustível
        v1.adicionarGasolina(50);
        v1.gastarGasolina(10);

        // Saída de dados profissional e limpa
        System.out.println("--- Relatório de Veículo FiapRide ---");
        System.out.println("Condutor: " + v1.getIndividuo());
        System.out.println("Placa: " + v1.getPlaca());
        System.out.println("Nível de Combustível: " + v1.getGasolina() + "L");
        System.out.println("-------------------------------------");
    }
}