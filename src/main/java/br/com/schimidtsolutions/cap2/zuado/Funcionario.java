package br.com.schimidtsolutions.cap2.zuado;

public class Funcionario {
	private double salarioBase;
	private Cargo cargo;

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
		switch(this.getCargo()){
		case DESENVOLVEDOR:
			return dezOuVintePorcento(this);
		case DBA:
		case TESTER:
			return quinzeOuVinteCincoPorcento(this);
		default:
			throw new RuntimeException("funcionario invalido");
		}
	}

	public Cargo getCargo() {
		return cargo;
	}

	private double quinzeOuVinteCincoPorcento(final Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 2000.0){
			return funcionario.getSalarioBase() * 0.75;
		}else{
			return funcionario.getSalarioBase() * 0.85;
		}
	}

	private double dezOuVintePorcento(final Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 3000.0){
			return funcionario.getSalarioBase() * 0.8;
		}else{
			return funcionario.getSalarioBase() * 0.9;
		}
	}

}
