package br.com.schimidtsolutions.cap2.zuado;

public enum Cargo {
	DBA(new QuinzeOuVinteCinco()), DESENVOLVEDOR(new DezOuVinte()), TESTER(new QuinzeOuVinteCinco()), DONO(new Tudo());
	
	private DescontoSalarial desc;

	Cargo(DescontoSalarial desc) {
		this.desc = desc;
	}
	
	public double getSalarioLiquido(Double salarioBase) {
		return desc.calcula(salarioBase);
	}
}
