package br.com.schimidtsolutions.cap2.salario.solucao;

import java.math.BigDecimal;
import java.util.Currency;

public interface Salario {
	
	Currency getMoeda();
	
	BigDecimal getValor();

	String getFormatado();

	Salario calcular(Calculo calculo);
}