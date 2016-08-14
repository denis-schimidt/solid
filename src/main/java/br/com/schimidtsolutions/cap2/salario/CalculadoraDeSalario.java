package br.com.schimidtsolutions.cap2.salario;

import static br.com.schimidtsolutions.cap2.salario.Cargo.DBA;
import static br.com.schimidtsolutions.cap2.salario.Cargo.DESENVOLVEDOR;
import static br.com.schimidtsolutions.cap2.salario.Cargo.TESTER;

public class CalculadoraDeSalario {

	public double calcula(final Funcionario funcionario) {
		if(DESENVOLVEDOR.equals(funcionario.getCargo())){
			return dezOuVintePorcento(funcionario);
		}
		if(DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())){
			return quinzeOuVinteCincoPorcento(funcionario);
		}
		throw new RuntimeException("funcionario invalido");
	}

	private double dezOuVintePorcento(final Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 3000.0){
			return funcionario.getSalarioBase() * 0.8;
		}else{
			return funcionario.getSalarioBase() * 0.9;
		}
	}

	private double quinzeOuVinteCincoPorcento(final Funcionario funcionario) {
		if(funcionario.getSalarioBase() > 2000.0){
			return funcionario.getSalarioBase() * 0.75;
		}else{
			return funcionario.getSalarioBase() * 0.85;
		}
	}
}
