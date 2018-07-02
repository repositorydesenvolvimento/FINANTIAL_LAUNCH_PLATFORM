package plataformalancamentofinanceiro.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import plataformalancamentofinanceiro.domain.GestaoDespesaDomain;
import plataformalancamentofinanceiro.view.GestaoDespesasView;

@ManagedBean(name = "gestaoDespesaController")
@SessionScoped
public class GestaoDespesasController extends BaseController {
	
	private static final long serialVersionUID = 1L;
	
	private GestaoDespesasView gestaoDespesasView;
	
	public GestaoDespesasController() {
		this.gestaoDespesasView = new GestaoDespesasView();
	}

	public String labelDemonstrativo() {
		return "Demonstrativos";
	}
	
	public GestaoDespesaDomain findOne() {
		return null;
	}

	public GestaoDespesasView getGestaoDespesasView() {
		return gestaoDespesasView;
	}

	public void setGestaoDespesasView(GestaoDespesasView gestaoDespesasView) {
		this.gestaoDespesasView = gestaoDespesasView;
	}
	
}
