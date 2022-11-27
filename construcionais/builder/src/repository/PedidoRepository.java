package repository;

import model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoRepository {

    private List<Pedido> pedidos;

    public PedidoRepository() {
        pedidos = new ArrayList<>();
    }

    public void armazenarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidos;
    }

    public int buscarTotalPedidos() {
        return pedidos.size();
    }

}
