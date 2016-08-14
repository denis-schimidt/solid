package br.com.schimidtsolutions.cap2.zuado;

import java.sql.PreparedStatement;

public class ConexaoBdImpl implements ConexaoBd {
	private final String usuario;
	private final String senha;

	public ConexaoBdImpl(final String usuario, final String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
	
	@Override
	public PreparedStatement preparaSql(final String sql) {
		// TODO Auto-generated method stub
		return null;
	}
}
