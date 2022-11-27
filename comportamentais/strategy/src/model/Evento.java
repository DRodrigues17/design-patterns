package model;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private LocalDateTime data;
    private int capacidade;
    private int ocupacao;
    private List<Ingresso> ingressos;

    public Evento(EventoBuilder builder) {
        this.nome = builder.nome;
        this.data = builder.data;
        this.capacidade = builder.capacidade;
        this.ocupacao = builder.ocupacao;
        this.ingressos = builder.ingressos;
    }

    public static EventoBuilder builder(){
        return new  EventoBuilder();
    }

    public static class EventoBuilder{

        private String nome;
        private LocalDateTime data;
        private int capacidade;
        private int ocupacao;
        private List<Ingresso> ingressos;

        public EventoBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public EventoBuilder data(LocalDateTime data) {
            this.data = data;
            return this;
        }

        public EventoBuilder capacidade(int capacidade) {
            this.capacidade = capacidade;
            return this;
        }

        public EventoBuilder ocupacao(int ocupacao) {
            this.ocupacao = ocupacao;
            return this;
        }

        public EventoBuilder ingressos(List<Ingresso> ingressos) {
            this.ingressos = ingressos;
            return this;
        }

        public Evento build(){
            return new Evento(this);
        }
    }

    public String comprarIngresso(String nome, Ingresso ingresso) {
        if (ocupacao == capacidade){
            return "evento lotado, não é mais possível comprar ingressos";
        }
        this.ocupacao +=1;
        this.ingressos.add(ingresso);
        return "o ingresso de id " + ingresso.getId() + " foi comprado pelo usuário " + nome + " e o valor será " +
                ingresso.getValorTotal();
    }

    public String listarIngressos(){
        return ingressos.toString();
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", data=" + data +
                ", capacidade=" + capacidade +
                ", ocupacao=" + ocupacao +
                ", ingressos=" + ingressos +
                '}';
    }
}
