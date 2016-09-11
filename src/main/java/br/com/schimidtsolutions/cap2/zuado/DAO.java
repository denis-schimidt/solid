package br.com.schimidtsolutions.cap2.zuado;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {

	public List<Funcionario> obtemFuncionarios(){
		final String sql = "SELECT * FROM funcionario f WHERE f.deleted=0";
		ConexaoBd conexao = new Conexao().obtemConexao();
		PreparedStatement ps = conexao.preparaSql(sql);
		ResultSet rs = ps.executeQuery();

		List<Funcionario> funcionarios = new ArrayList<>();
		while(rs.next()){
			final Double salarioBase = rs.getDouble("salarioBase");
			final String cargoComoString = rs.getString("cargo");
			Funcionario funcionario = new Funcionario(salarioBase, Cargo.valueOf(cargoComoString));
			funcionarios.add(funcionario);
		}

		return funcionarios;
	}

	public void pagamento() {
		final String sql = "insert into folha_pagamento(...) values (...)";
		ConexaoBd conexao = new Conexao().obtemConexao();
		PreparedStatement ps = conexao.preparaSql(sql);
		ps.execute();
	}
}
