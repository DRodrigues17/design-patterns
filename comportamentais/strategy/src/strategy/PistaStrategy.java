package strategy;

import java.math.BigDecimal;

public class PistaStrategy implements ValorTipoIngresso {

    @Override
    public BigDecimal calcularPrecoIngresso(int idade, boolean isEstudante) {
        BigDecimal valor = new BigDecimal(250);
        if (idade >= 60 || isEstudante){
            valor = valor.multiply(BigDecimal.valueOf(0.5));
        }
        return valor;
    }
}
