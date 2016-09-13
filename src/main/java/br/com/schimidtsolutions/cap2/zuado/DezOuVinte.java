package br.com.schimidtsolutions.cap2.zuado;

public class DezOuVinte implements DescontoSalarial {

	@Override
	public double calcula(Double salario) {
		if (salario > 3000.0) {
			return salario * 0.8;
		}
		return salario * 0.9;
	}
}
