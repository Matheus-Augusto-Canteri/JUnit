package JUnit.src.br.com.alura.TDD.service;

import java.math.BigDecimal;

import JUnit.src.br.com.alura.TDD.model.Desempenho;
import JUnit.src.br.com.alura.TDD.model.Funcionario;

public class ReajusteService {

    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
            BigDecimal percentual = desempenho.percentualReajuste();
            BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
            funcionario.reajustarSalario(reajuste);
    }
}
