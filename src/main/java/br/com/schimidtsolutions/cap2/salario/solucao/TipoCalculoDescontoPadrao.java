package br.com.schimidtsolutions.cap2.salario.solucao;

import java.math.BigDecimal;

enum TipoCalculoDescontoPadrao {
	DEZ_OU_QUINZE(new CalculoDescontoPadrao(BigDecimal.valueOf(7_000L), new BigDecimal("0.1"), new BigDecimal("0.15"))),
	QUINZE_OU_VINTE(new CalculoDescontoPadrao(BigDecimal.valueOf(5_000L), new BigDecimal("0.15"), new BigDecimal("0.20"))),
	VINTE_CINCO_OU_TRINTA(new CalculoDescontoPadrao(BigDecimal.valueOf(10_000L), new BigDecimal("0.25"), new BigDecimal("0.3")));

	private final Calculo calculo;
	
	private TipoCalculoDescontoPadrao(final Calculo formulaCalculo) {
		calculo = formulaCalculo;
	}

	Calculo getCalculo() {
		return calculo;
	}
}
