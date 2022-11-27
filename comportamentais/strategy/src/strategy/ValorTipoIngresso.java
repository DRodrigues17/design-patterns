package strategy;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface ValorTipoIngresso {

    public BigDecimal calcularPrecoIngresso(int idade, boolean isEstudante);
}
