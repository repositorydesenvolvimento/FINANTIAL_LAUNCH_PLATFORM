package plataformalancamentofinanceiro.view;

import plataformalancamentofinanceiro.controller.BaseController;
import plataformalancamentofinanceiro.domain.GestaoDespesaDomain;

public class GestaoDespesasView extends BaseController {

	private static final long serialVersionUID = 1L;
	
	private GestaoDespesaDomain gestaoDespesaDomain;
	
	public GestaoDespesasView() {
		this.gestaoDespesaDomain = new GestaoDespesaDomain();
	}
	
	public String labelDemonstrativo() {
		return "Demonstrativos";
	}

	public GestaoDespesaDomain getGestaoDespesaDomain() {
		return gestaoDespesaDomain;
	}

	public void setGestaoDespesaDomain(GestaoDespesaDomain gestaoDespesaDomain) {
		this.gestaoDespesaDomain = gestaoDespesaDomain;
	}
	
}
