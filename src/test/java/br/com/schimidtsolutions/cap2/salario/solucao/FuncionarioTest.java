package br.com.schimidtsolutions.cap2.salario.solucao;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.schimidtsolutions.cap2.salario.solucao.Cargo;
import br.com.schimidtsolutions.cap2.salario.solucao.Funcionario;
import br.com.schimidtsolutions.cap2.salario.solucao.SalarioBrasil;

public class FuncionarioTest {

	@Test
	public void deveCalcularDescontoSalarioDev() {
		final Funcionario funcionario = new Funcionario(new SalarioBrasil(BigDecimal.valueOf(10_000)), Cargo.DESENVOLVEDOR_BACKEND);

		assertThat(funcionario.getSalarioLiquido().getFormatado(), equalTo("R$ 8.000,00"));
	}
}
