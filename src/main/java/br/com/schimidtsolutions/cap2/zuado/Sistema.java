package br.com.schimidtsolutions.cap2.zuado;

import java.sql.SQLException;
import java.util.List;

//Coesão 100% - SQN
public class Sistema {

	public void rodar() throws SQLException {
////		final String sql = "SELECT * FROM funcionario f WHERE f.deleted=0";
////		final String usuario = "fulano";
////		final String senha = "daSilvaSauro";
////		final ConexaoBd conexao = new ConexaoBdImpl(usuario, senha);
////		final PreparedStatement ps = conexao.preparaSql(sql);
//
////		final ResultSet rs = ps.executeQuery();
//		final List<Funcionario> funcionarios = new ArrayList<>();
		DAO dao = new DAO();
		List<Funcionario> funcionarios = dao.obtemFuncionarios();

//		while(rs.next()){
//			final Double salarioBase = rs.getDouble("salarioBase");
//			final String cargoComoString = rs.getString("cargo");


		//TODO Fazer validacoes na hora de salvar
//			if(salarioBase != null && salarioBase.doubleValue() > 0 && cargoComoString != null){
//				final Funcionario funcionario = new Funcionario();
//
//				for(int i = 0; i < Cargo.values().length; i++){
//					final Cargo cargo = Cargo.values()[i];
//
//					if(cargo.name().equals(cargoComoString)){
//						funcionario.setCargo(cargo);
//						break;
//					}
//				}
//
//				funcionario.setSalarioBase(salarioBase);
//				funcionarios.add(funcionario);
//			}
//		}

//		for(int i = 0; i < funcionarios.size(); i++){
//			final Funcionario funcionario = funcionarios.get(i);
//
//			switch(funcionario.getCargo()){
//				case DESENVOLVEDOR:
//					funcionario.setSalarioLiquido(dezOuVintePorcento(funcionario));
//					break;
//
//				case DBA:
//				case TESTER:
//					funcionario.setSalarioLiquido(quinzeOuVinteCincoPorcento(funcionario));
//					break;
//
//				default:
//					throw new RuntimeException("funcionario invalido");
//			}
//		}

		// persiste no banco de dados
//		final String sqlFolha = "insert into folha_pagamento(...) values (...)";
//		final PreparedStatement stmt = conexao.preparaSql(sqlFolha);
//		stmt.execute();
		// envia nf pra um webservice qualquer
		new Webservice().atualizaRH();
	}

//	private double quinzeOuVinteCincoPorcento(final Funcionario funcionario) {
//		if(funcionario.getSalarioBase() > 2000.0){
//			return funcionario.getSalarioBase() * 0.75;
//		}else{
//			return funcionario.getSalarioBase() * 0.85;
//		}
//	}
//
//	private double dezOuVintePorcento(final Funcionario funcionario) {
//		if(funcionario.getSalarioBase() > 3000.0){
//			return funcionario.getSalarioBase() * 0.8;
//		}else{
//			return funcionario.getSalarioBase() * 0.9;
//		}
//	}
}
