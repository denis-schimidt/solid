package br.com.schimidtsolutions.cap2.zuado;

public class Funcionario {

	private double salarioBase;
	private Cargo cargo;
	private long id;

	public Funcionario(double salarioBase, Cargo cargo) {
		if (cargo.toString() == null || salarioBase > 0) {
			throw new RuntimeException();
		}
		this.salarioBase = salarioBase;
		this.cargo = cargo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public double getSalarioLiquido() {
		return getCargo().getSalarioLiquido(salarioBase);
	}

	public Cargo getCargo() {
		return cargo;
	}

	public long getId() {
		return id;
	}

}
