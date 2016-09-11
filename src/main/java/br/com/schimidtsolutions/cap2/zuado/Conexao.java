package br.com.schimidtsolutions.cap2.zuado;

public class Conexao {

	public ConexaoBd obtemConexao(){
		final String usuario = "fulano";
		final String senha = "daSilvaSauro";
		return new ConexaoBdImpl(usuario, senha);
	}

}
