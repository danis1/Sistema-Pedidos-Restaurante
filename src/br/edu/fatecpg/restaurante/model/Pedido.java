package br.edu.fatecpg.restaurante.model;

import java.util.ArrayList;

public class Pedido {
    private int numPedido;
    private ArrayList<ItemPedido> itens;
    private double txEntrega = 2;
    private int reservarMesa;


    public Pedido(int numPedido) {
        this.numPedido = numPedido;
        this.itens = new ArrayList<>();
    }

    public int getNumPedido() {
        return numPedido;
    }

    public double calcularTotalPedido(){
        double total = 0;
        for(ItemPedido item : this.itens){
            total += item.getQtd()*item.getPrecoUnitario();
        };
        return total + this.txEntrega;
    }

    public void adicionarItem(ItemPedido item){
        this.itens.add(item);
    }

    public void removerItem(ItemPedido item){
        this.itens.remove(item);
    }

    public void reservarMesa(int numMesa){
        this.reservarMesa = numMesa;
        System.out.println("A mesa " + reservarMesa + " foi reservada com sucesso");;
    }



}
