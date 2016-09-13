package br.com.schimidtsolutions.cap2.zuado;

public class QuinzeOuVinteCinco implements DescontoSalarial {

	@Override
	public double calcula(Double salario) {
		if (salario > 2000.0) {
			return salario * 0.75;
		}
		return salario * 0.85;
	}
}