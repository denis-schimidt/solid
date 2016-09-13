package br.com.schimidtsolutions.cap2.zuado;

public class Tudo implements DescontoSalarial {

	@Override
	public double calcula(Double salarioBase) {
		return salarioBase;
	}
}
