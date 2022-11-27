package model;

import enums.TamanhoComida;
import enums.TipoComida;

import java.math.BigDecimal;

public class Comida extends Item {

    private TipoComida tipo;
    private TamanhoComida tamanho;

    public Comida(long id, BigDecimal valor, TipoComida tipo,
                  TamanhoComida tamanho) {
        super(id, valor);
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

}
