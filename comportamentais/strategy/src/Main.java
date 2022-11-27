import enums.TipoIngresso;
import model.Evento;
import model.Ingresso;
import model.pessoa.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Usuario daniel = (Usuario) Usuario.builder()
                .nome("daniel")
                .nascimento(LocalDate.of(2004,02,17))
                .documento("123456789")
                .isEstudante(false)
                .build();

        Ingresso cadeiraInferior = Ingresso.builder().id(1).usuario(daniel).tipoIngresso(TipoIngresso.CADEIRA_INFERIOR).build();
        Ingresso cadeiraSuperior = Ingresso.builder().id(2).usuario(daniel).tipoIngresso(TipoIngresso.CADEIRA_SUPERIOR).build();
        Ingresso camarote = Ingresso.builder().id(3).usuario(daniel).tipoIngresso(TipoIngresso.CAMAROTE).build();
        Ingresso pista = Ingresso.builder().id(4).usuario(daniel).tipoIngresso(TipoIngresso.PISTA).build();
        Ingresso pistaPremium = Ingresso.builder().id(5).usuario(daniel).tipoIngresso(TipoIngresso.PISTA_PREMIUM).build();

        Evento evento = Evento.builder()
                .nome("south summit")
                .data(LocalDateTime.of(2022, 12, 05, 14, 00, 00))
                .capacidade(15)
                .ocupacao(0)
                .ingressos(new ArrayList<>())
                .build();

        System.out.println(evento.comprarIngresso(daniel.getNome(), pista));
        daniel.adcionarEvento(evento);

        System.out.println(evento.listarIngressos());
        System.out.println(daniel.listarEventos());
    }

}