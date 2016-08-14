package br.com.schimidtsolutions.cap2.zuado;

public class Funcionario {
	private double salarioBase;
	private double salarioLiquido;
	private Cargo cargo;

	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(final double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double getSalarioLiquido() {
		return salarioLiquido;
	}
	
	public void setSalarioLiquido(final double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public void setCargo(final Cargo cargo) {
		this.cargo = cargo;
	}
}
