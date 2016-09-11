package br.com.schimidtsolutions.cap2.zuado;

public class Webservice {

	SOAP ws = new SOAP();

	public void atualizaRH() {
		ws.setUrl("http://www.meuerp.com.br/atualizar_rh");
		ws.setPort(80);
	}

}
