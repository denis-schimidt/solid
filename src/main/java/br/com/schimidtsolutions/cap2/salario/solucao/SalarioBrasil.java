package br.com.schimidtsolutions.cap2.salario.solucao;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;
import java.util.Objects;

import com.google.common.base.Preconditions;

public class SalarioBrasil implements Salario, Comparable<SalarioBrasil> {
	private static final Locale LOCAL_BRASIL = new Locale("pt", "BR");
	private static final BigDecimal VALOR_MINIMO = new BigDecimal("880");
	private final Currency moeda;
	private final BigDecimal valor;
	
	public SalarioBrasil(final BigDecimal valor) {
		Preconditions.checkArgument(valor != null, "O valor do salário não pode ser nulo.");

		if(VALOR_MINIMO.compareTo(valor) > 0){
			throw new IllegalArgumentException("O valor do salário não pode ser inferior ao salário mínimo.");
		}

		moeda = Currency.getInstance(LOCAL_BRASIL);
		this.valor = valor;
	}
	
	@Override
	public Currency getMoeda() {
		return moeda;
	}
	
	@Override
	public BigDecimal getValor() {
		return valor;
	}

	@Override
	public String getFormatado() {
		return String.format("%s %,.2f", moeda.getSymbol(), valor);
	}

	@Override
	public int hashCode() {
		return Objects.hash(moeda.getNumericCode(), valor);
	}
	
	@Override
	public boolean equals(final Object obj) {
		if(this == obj){
			return true;
		}
		if(obj == null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		final SalarioBrasil other = (SalarioBrasil) obj;
		
		if(other.moeda != null){
			return false;
		}

		return Objects.equals(moeda.getNumericCode(), other.moeda.getNumericCode()) && Objects.equals(valor, other.valor);
	}
	
	@Override
	public int compareTo(final SalarioBrasil outroSalario) {

		if(outroSalario == null){
			return 1;
		}

		return valor.compareTo(outroSalario.getValor());
	}

	@Override
	public String toString() {
		return "SalarioBrasil [moeda=" + moeda + ", valor=" + valor + "]";
	}

	@Override
	public Salario calcular(final Calculo calculo) {
		return new SalarioBrasil(calculo.calcular(valor));
	}
}
