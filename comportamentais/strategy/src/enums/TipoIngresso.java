package enums;

import strategy.*;

public enum TipoIngresso {
    PISTA(new PistaStrategy()),
    PISTA_PREMIUM(new PistaPremiumStrategy()),
    CAMAROTE(new CamaroteStrategy()),
    CADEIRA_SUPERIOR(new CadeiraSuperiorStrategy()),
    CADEIRA_INFERIOR(new CadeiraInferiorStrategy());

    private TipoIngresso(ValorTipoIngresso strategy){
        this.strategy = strategy;
    }

    private final ValorTipoIngresso strategy;

    public ValorTipoIngresso getStrategy() {
        return strategy;
    }
}
