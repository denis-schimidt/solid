package br.com.schimidtsolutions.cap2.salario.solucao;

import static br.com.schimidtsolutions.cap2.salario.solucao.TipoCalculoDescontoPadrao.DEZ_OU_QUINZE;
import static br.com.schimidtsolutions.cap2.salario.solucao.TipoCalculoDescontoPadrao.QUINZE_OU_VINTE;
import static br.com.schimidtsolutions.cap2.salario.solucao.TipoCalculoDescontoPadrao.VINTE_CINCO_OU_TRINTA;

public enum Cargo {
	DBA(VINTE_CINCO_OU_TRINTA.getCalculo()),
	DESENVOLVEDOR_FRONTEND(DEZ_OU_QUINZE.getCalculo()),
	DESENVOLVEDOR_BACKEND(QUINZE_OU_VINTE.getCalculo()),
	TESTER(DEZ_OU_QUINZE.getCalculo());
	
	private Calculo calculoDesconto;

	private Cargo(final Calculo calculoDesconto) {
		this.calculoDesconto = calculoDesconto;
	}
	
	Calculo getCalculoDesconto() {
		return calculoDesconto;
	}
}
