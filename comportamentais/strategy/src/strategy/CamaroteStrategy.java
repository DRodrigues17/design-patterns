package strategy;

import java.math.BigDecimal;

public class CamaroteStrategy implements ValorTipoIngresso {
    @Override
    public BigDecimal calcularPrecoIngresso(int idade, boolean isEstudante) {
        return new BigDecimal(750);
    }
}
