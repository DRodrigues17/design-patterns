package service;

import enums.SituacaoPedido;
import model.Pedido;
import repository.PedidoRepository;
import java.util.List;

public class PedidoService {

    private PedidoRepository pedidoRepository;

    public PedidoService() {
        this.pedidoRepository = new PedidoRepository();
    }

    public void realizarPedido(Pedido pedido) {
        pedido.setSituacao(SituacaoPedido.EM_ANALISE);
        pedidoRepository.armazenarPedido(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.listarPedidos();
    }

    public List<Pedido> listarPedidosPorSituacao(SituacaoPedido situacao) {
        return listarPedidos()
                .stream()
                .filter(pedido -> pedido.getSituacao().equals(situacao))
                .toList();
    }

    public int buscarQuantidadePedidos() {
        return pedidoRepository.buscarTotalPedidos();
    }

    public void pagarPedido(Pedido pedido) {
        // TODO
    }

}
