package br.edu.fatecpg.restaurante.model;

public class ItemPedido {
    private String nomeDoPrato;
    private int qtd;
    private double precoUnitario;

    public ItemPedido(String nomeDoPrato, int qtd, double precoUnitario) {
        this.nomeDoPrato = nomeDoPrato;
        this.qtd = qtd;
        this.precoUnitario = precoUnitario;
    }

    public String getNomeDoPrato() {
        return nomeDoPrato;
    }

    public int getQtd() {
        return qtd;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}
