package br.edu.fatecpg.restaurante.model;

import java.util.ArrayList;

public class Restaurante {

    private ArrayList<Pedido> lista;

    public Restaurante() {
        this.lista = new ArrayList<>();
    }

    public ArrayList<Pedido> getLista() {
        return lista;
    }

    public void addPedido(Pedido l){
        this.lista.add(l);
    }

    public void removePedido(Pedido l){
        this.lista.remove(l);
    }


    public void exibirPedidos() {
        if (this.lista.isEmpty()) {
            System.out.println("Não há pedido cadastrado.");
            return;
        }
        for (Pedido p : this.lista) {
            System.out.println("Pedido Nº: " + p.getNumPedido() + " | Total: R$ " + p.calcularTotalPedido());
        }
    }

    public Pedido buscarPedido(int numero) {
        for (Pedido p : this.lista) {
            if (p.getNumPedido() == numero) {
                return p;
            }
        }
        return null;
    }

}
