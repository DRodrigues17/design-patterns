package model;

import java.math.BigDecimal;

public abstract class Item {

    private long id;
    private BigDecimal valor;

    public Item(long id, BigDecimal valor) {
        this.id = id;
        this.valor = valor;
    }

}
