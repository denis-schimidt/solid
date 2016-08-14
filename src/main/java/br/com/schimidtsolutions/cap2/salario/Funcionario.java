package br.com.schimidtsolutions.cap2.salario;

public class Funcionario {
	private double salarioBase;
	private Cargo cargo;
	
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(final double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(final Cargo cargo) {
		this.cargo = cargo;
	}
}
