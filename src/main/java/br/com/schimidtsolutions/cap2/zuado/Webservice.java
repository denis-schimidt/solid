package br.com.schimidtsolutions.cap2.zuado;

public class Webservice {

	SOAP ws = new SOAP();

	public void atualizaRH(Funcionario f) {
		ws.setUrl("http://www.meuerp.com.br/atualizar_rh/" + f.getId());
		ws.setPort(80);
	}

}
