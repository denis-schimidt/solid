package br.com.schimidtsolutions.cap2.salario.solucao;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

import org.junit.Test;

import br.com.schimidtsolutions.cap2.salario.solucao.SalarioBrasil;

public class SalarioBrasilTest {
	private static final Currency REAL = Currency.getInstance(new Locale("pt", "BR"));
	private static final BigDecimal VALOR_SALARIO_MINIMO = new BigDecimal("880.00");
	private static final SalarioBrasil SALARIO_MINIMO = new SalarioBrasil(VALOR_SALARIO_MINIMO);
	
	@Test(expected = IllegalArgumentException.class)
	public void deveLancarExcecaoValorNulo() {
		new SalarioBrasil(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void deveLancarExcecaoValorInferiorAoMinimo() {
		new SalarioBrasil(new BigDecimal("879.99"));
	}

	@Test
	public void deveCriarUmSalarioMinimo() {
		assertThat(SALARIO_MINIMO.getMoeda(), equalTo(REAL));
		assertThat(SALARIO_MINIMO.getValor(), equalTo(VALOR_SALARIO_MINIMO));
	}
	
	@Test
	public void deveformatarSalario() {
		assertThat(SALARIO_MINIMO.getFormatado(), equalTo("R$ 880,00"));
	}
}
