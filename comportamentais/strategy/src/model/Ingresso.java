package model;

import enums.TipoIngresso;
import model.pessoa.Usuario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ingresso {
    private long id;
    private Usuario usuario;
    private BigDecimal valor;
    private TipoIngresso tipoIngresso;


    public Ingresso(IngressoBuilder builder) {
        this.id = builder.id;
        this.usuario = builder.usuario;
        this.valor = builder.valor;
        this.tipoIngresso = builder.tipoIngresso;

    }

    public static IngressoBuilder builder(){
        return new IngressoBuilder();
    }

    public static class IngressoBuilder{

        private long id;
        private Usuario usuario;
        private BigDecimal valor;
        private TipoIngresso tipoIngresso;

        public IngressoBuilder id(long id) {
            this.id = id;
            return this;
        }

        public IngressoBuilder usuario(Usuario usuario) {
            this.usuario = usuario;
            return this;
        }

        public IngressoBuilder valor(BigDecimal valor) {
            this.valor = valor;
            return this;
        }

        public IngressoBuilder tipoIngresso(TipoIngresso tipoIngresso) {
            this.tipoIngresso = tipoIngresso;
            return this;
        }

        public Ingresso build(){
            return new Ingresso(this);
        }
    }

    public long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public BigDecimal getValorTotal() {
        valor = this.tipoIngresso
                .getStrategy()
                .calcularPrecoIngresso(usuario.getIdade(), usuario.isEstudante());

        return valor.setScale(2, RoundingMode.HALF_EVEN);
    }

    public TipoIngresso getTipoIngresso() {
        return tipoIngresso;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", valor=" + valor +
                ", tipoIngresso=" + tipoIngresso +
                '}';
    }
}
