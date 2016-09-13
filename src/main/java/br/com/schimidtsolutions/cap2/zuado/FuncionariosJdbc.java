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
}
