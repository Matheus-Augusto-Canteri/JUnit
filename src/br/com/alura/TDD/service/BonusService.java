package JUnit.src.br.com.alura.TDD.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import JUnit.src.br.com.alura.TDD.model.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			// throw new IllegalArgumentException("Funcionario com salario maior do que R$1000 não pode receber bônus");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}
}
