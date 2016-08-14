package br.com.schimidtsolutions.cap2.salario.solucao;

import com.google.common.base.Preconditions;

public class Funcionario {
	private final Salario salarioBruto;
	private final Cargo cargo;

	public Funcionario(final Salario salarioBruto, final Cargo cargo) {
		Preconditions.checkArgument(salarioBruto != null, "O salário bruto não pode ser nulo.");
		Preconditions.checkArgument(cargo != null, "O cargo não pode ser nulo.");
		
		this.salarioBruto = salarioBruto;
		this.cargo = cargo;
	}
	
	public Salario getSalarioBruto() {
		return salarioBruto;
	}
	
	public Cargo getCargo() {
		return cargo;
	}

	public Salario getSalarioLiquido() {
		return salarioBruto.calcular(cargo.getCalculoDesconto());
	}

	@Override
	public String toString() {
		return "Funcionario [salarioBruto=" + salarioBruto + ", cargo=" + cargo + "]";
	}
}
