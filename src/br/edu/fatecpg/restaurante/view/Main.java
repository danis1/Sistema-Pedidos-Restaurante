package br.edu.fatecpg.restaurante.view;
import br.edu.fatecpg.restaurante.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ItemPedido item1 = new ItemPedido("Hambúrguer Artesanal", 2, 30.0);
        ItemPedido item2 = new ItemPedido("Batata Frita", 1, 15.0);
        ItemPedido item3 = new ItemPedido("Refrigerante", 2, 7.0);


        Pedido pedido1 = new Pedido(101);
        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);
        pedido1.adicionarItem(item3);


        pedido1.reservarMesa(4);
        System.out.println("Total do Pedido " + pedido1.getNumPedido() + ": R$ " + pedido1.calcularTotalPedido());

        System.out.println("\n==============================\n");

        Restaurante restaurante = new Restaurante();
        restaurante.addPedido(pedido1);

        restaurante.exibirPedidos();

        System.out.println("\nBuscando o pedido 101:");
        Pedido encontrado = restaurante.buscarPedido(101);
        if (encontrado != null) {
            System.out.println("Pedido " + encontrado.getNumPedido() + " localizado com sucesso!");
        }
    }
}

