package JUnit.src.br.com.alura.TDD.model;

import java.math.BigDecimal;

public enum Desempenho { // Constantes
    A_DESEJAR {
        @Override
        public BigDecimal percentualReajuste() {

            return new BigDecimal("0.03");
        }
    },
    BOM {
        @Override
        public BigDecimal percentualReajuste() {

            return new BigDecimal("0.15");
        }
    },
    OTIMO {
        @Override
        public BigDecimal percentualReajuste() {

            return new BigDecimal("0.2");
        }
    };

    public abstract BigDecimal percentualReajuste();

}
