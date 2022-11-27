package model;

import enums.TipoBebida;

import java.math.BigDecimal;

public class Bebida extends Item {

    private TipoBebida tipo;

    public Bebida(long id, BigDecimal valor, TipoBebida tipo) {
        super(id, valor);
        this.tipo = tipo;
    }

}
