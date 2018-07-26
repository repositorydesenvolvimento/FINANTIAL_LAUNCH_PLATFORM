package plataformalancamentofinanceiro.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import plataformalancamentofinanceiro.domain.GestaoDespesaDomain;
import plataformalancamentofinanceiro.service.GestaoDespesaService;
import plataformalancamentofinanceiro.view.GestaoDespesasView;

@ManagedBean(name = "gestaoDespesaController")
@SessionScoped
public class GestaoDespesasController extends BaseController {
	
	private static final long serialVersionUID = 1L;
	
	private GestaoDespesasView gestaoDespesasView;
	
	private GestaoDespesaService gestaoDespesaService;
	
	public GestaoDespesasController() {
		this.gestaoDespesasView = new GestaoDespesasView();
		this.gestaoDespesaService = new GestaoDespesaService();
	}
	
	public String persist() {
		gestaoDespesaService.persist(gestaoDespesasView.getGestaoDespesaDomain());
		return null;
	}
	
	public List<GestaoDespesaDomain> findAll() {
		return gestaoDespesaService.findAll();
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

	public GestaoDespesaService getGestaoDespesaService() {
		return gestaoDespesaService;
	}

	public void setGestaoDespesaService(GestaoDespesaService gestaoDespesaService) {
		this.gestaoDespesaService = gestaoDespesaService;
	}
	
}
