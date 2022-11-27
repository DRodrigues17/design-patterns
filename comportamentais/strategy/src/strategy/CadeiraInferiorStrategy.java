package strategy;

import java.math.BigDecimal;

public class CadeiraInferiorStrategy implements ValorTipoIngresso {
    @Override
    public BigDecimal calcularPrecoIngresso(int idade, boolean isEstudante) {
        BigDecimal valor = new BigDecimal(200);
        if (idade > 59){
            return valor.multiply(BigDecimal.valueOf(0.4));
        } else if (isEstudante){
            return valor.multiply(BigDecimal.valueOf(0.5));
        }
        return valor;
    }
}
