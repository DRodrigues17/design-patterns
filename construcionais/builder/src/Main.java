import enums.*;
import model.Bebida;
import model.Comida;
import model.Item;
import model.Pedido;
import model.cliente.Cliente;
import model.cliente.Contato;
import model.cliente.Endereco;
import service.PedidoService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PedidoService pedidoService = new PedidoService();

        Contato contato = Contato.builder()
                .telefoneResidencial("3333-3333")
                .telefoneCelular("9999-9999")
                .email("adanielluiz71@gmail.com")
                .build();


        Endereco endereco = Endereco.builder()
                .logradouro("Rua XPTO")
                .numero("123")
                .cep("90000-000")
                .estado("RS")
                .contatoCLiente(contato)
                .build();

        Cliente cliente =  Cliente.builder()
                .nome("Daniel")
                .documento("111222333-44")
                .dataNascimento(LocalDate.of(2004, 02, 17))
                .endereco(endereco)
                .build();

        Comida pizzaMatheus = new Comida(1, new BigDecimal(25), TipoComida.PIZZA_SALGADA, TamanhoComida.FAMILIA);
        Bebida sucoMatheus = new Bebida(1, new BigDecimal(12.90), TipoBebida.SUCO_UVA);
        Bebida cervejaMatheus = new Bebida(2, new BigDecimal(16.90), TipoBebida.CERVEJA);
        List<Item> itensMatheus = Arrays.asList(pizzaMatheus, sucoMatheus, cervejaMatheus);

        Pedido pedido = new Pedido (1, null, itensMatheus, null, cliente, MetodoPagamento.PIX);

        System.out.println(pedidoService.listarPedidos());
        System.out.println("Quantidade Pedidos da Pizzaria: " + pedidoService.buscarQuantidadePedidos());
        System.out.println("Quantidade Pedidos em Análise da Pizzaria: " + pedidoService.listarPedidosPorSituacao(SituacaoPedido.EM_ANALISE).size());

        pedidoService.realizarPedido(pedido);

        System.out.println("Quantidade Pedidos da Pizzaria: " + pedidoService.buscarQuantidadePedidos());

        System.out.println("Valor do pedido do " +
                pedido.getCliente().getNome() +
                " é R$" +
                pedido.getValorTotal());
    }
}
