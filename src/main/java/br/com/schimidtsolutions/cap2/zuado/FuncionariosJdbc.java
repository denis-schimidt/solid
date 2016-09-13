package br.com.schimidtsolutions.cap2.zuado;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionariosJdbc implements Funcionarios {

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.schimidtsolutions.cap2.zuado.Funcionarios#obtemFuncionarios()
	 */
	@Override
	public List<Funcionario> obtemFuncionarios() {
		final String sql = "SELECT * FROM funcionario f WHERE f.deleted=0";
		ConexaoBd conexao = new Conexao().obtemConexao();
		PreparedStatement ps = conexao.preparaSql(sql);
		List<Funcionario> funcionarios = new ArrayList<>();
		try {
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				final Double salarioBase = rs.getDouble("salarioBase");
				final String cargoComoString = rs.getString("cargo");
				Funcionario funcionario = new Funcionario(salarioBase, Cargo.valueOf(cargoComoString));
				funcionarios.add(funcionario);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return funcionarios;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.schimidtsolutions.cap2.zuado.Funcionarios#pagamento(br.com.
	 * schimidtsolutions.cap2.zuado.Funcionario)
	 */
	@Override
	public void pagamento(Funcionario f) {
		final String sql = "insert into folha_pagamento(id_funcionario, salario_base, salario_liquido, data) " + "values (?,?,?,?)";

		ConexaoBd conexao = new Conexao().obtemConexao();
		PreparedStatement ps = conexao.preparaSql(sql);
		try {
			ps.setLong(0, f.getId());
			ps.setDouble(1, f.getSalarioBase());
			ps.setDouble(2, f.getSalarioLiquido());
			ps.setDate(3, new Date(new java.util.Date().getTime()));
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
