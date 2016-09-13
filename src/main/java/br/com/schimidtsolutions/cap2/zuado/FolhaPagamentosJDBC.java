package br.com.schimidtsolutions.cap2.zuado;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FolhaPagamentosJDBC implements FolhaPagamentos{

	@Override
	public void registrarPagamento(Funcionario f) {
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
