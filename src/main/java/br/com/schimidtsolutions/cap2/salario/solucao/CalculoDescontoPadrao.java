package br.com.schimidtsolutions.cap2.salario.solucao;

import java.math.BigDecimal;

import com.google.common.base.Preconditions;

class CalculoDescontoPadrao implements Calculo {
	private final BigDecimal valorLimite;
	private final BigDecimal descontoMinimo;
	private final BigDecimal descontoMaximo;

	public CalculoDescontoPadrao(final BigDecimal valorLimite, final BigDecimal percentualDescontoMinimo, final BigDecimal percentualDescontoMaximo) {
		validarDadosEntrada(valorLimite, percentualDescontoMinimo, percentualDescontoMaximo);
		
		this.valorLimite = valorLimite;
		this.descontoMinimo = BigDecimal.ONE.subtract(percentualDescontoMinimo);
		this.descontoMaximo = BigDecimal.ONE.subtract(percentualDescontoMaximo);
	}
	
	private void validarDadosEntrada(final BigDecimal valorLimite, final BigDecimal percentualDescontoMinimo, final BigDecimal percentualDescontoMaximo) {
		Preconditions.checkArgument(valorLimite != null, "O valor limite não pode ser nulo.");
		Preconditions.checkArgument(percentualDescontoMinimo != null, "O percentual do desconto mínimo não pode ser nulo.");
		Preconditions.checkArgument(percentualDescontoMaximo != null, "O percentual do desconto máximo não pode ser nulo.");
		Preconditions.checkArgument(valorLimite.compareTo(BigDecimal.ZERO) > 0, "O percentual limite têm que ser superior a zero.");
		Preconditions.checkArgument(percentualDescontoMinimo.compareTo(BigDecimal.ZERO) > 0  && percentualDescontoMinimo.compareTo(BigDecimal.ONE) < 0 , "O percentual do desconto mínimo têm que estar entre zero e um.");
		Preconditions.checkArgument(percentualDescontoMaximo.compareTo(BigDecimal.ZERO) > 0  && percentualDescontoMaximo.compareTo(BigDecimal.ONE) < 0 , "O percentual do desconto máximo têm que estar entre zero e um.");
		Preconditions.checkArgument(percentualDescontoMaximo.compareTo(percentualDescontoMinimo) > 0, "O percentual do desconto máximo têm que superior ao do desconto mínimo.");
	}
	
	@Override
	public BigDecimal calcular(final BigDecimal valorSalario) {
		final BigDecimal valorDesconto = valorSalario.compareTo(valorLimite) > 0 ? descontoMaximo : descontoMinimo;

		return valorSalario.multiply(valorDesconto);
	}
}
