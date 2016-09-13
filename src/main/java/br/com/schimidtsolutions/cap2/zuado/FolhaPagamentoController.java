package br.com.schimidtsolutions.cap2.zuado;

public class FolhaPagamentoController {
	private FolhaPagamentos folhaPagamentos;
	private Funcionarios funcionarios;

	//@Inject
	public FolhaPagamentoController(FolhaPagamentos folhaPagamentos, Funcionarios funcionarios) {
		this.folhaPagamentos = folhaPagamentos;
		this.funcionarios = funcionarios;
	}

	public void processarFolhaPagamento(){
		funcionarios.obtemFuncionarios().forEach(f -> {
			folhaPagamentos.registrarPagamento(f);
			Webservice webservice = new Webservice();
			webservice.atualizaRH(f);
		});
	}
}
