package plataformalancamentofinanceiro.controller;

import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import plataformalancamentofinanceiro.domain.GestaoPessoaDomain;
import plataformalancamentofinanceiro.service.GestaoPessoaService;
import plataformalancamentofinanceiro.view.GestaoPessoaView;

@ManagedBean(name = "gestaoPessoaController")
@SessionScoped
public class GestaoPessoaController extends BaseController {

	private static final long serialVersionUID = 1L;
	
	private GestaoPessoaView gestaoPessoaView;

	private GestaoPessoaService gestaoPessoaService;
	
	public GestaoPessoaController() { 
		this.gestaoPessoaView = new GestaoPessoaView();
		this.gestaoPessoaService = new GestaoPessoaService();
	}
	
	public List<GestaoPessoaDomain> findAll() {
		return gestaoPessoaService.findAll();
	}
	
	public List<GestaoPessoaDomain> recuperarPessoaInstituicaoFinanceira() {
		return gestaoPessoaService.recuperarPessoaInstituicaoFinanceira();
	}
	
	public GestaoPessoaView getGestaoPessoaView() {
		return gestaoPessoaView;
	}

	public void setGestaoPessoaView(GestaoPessoaView gestaoPessoaView) {
		this.gestaoPessoaView = gestaoPessoaView;
	}

	public GestaoPessoaService getGestaoPessoaService() {
		return gestaoPessoaService;
	}

	public void setGestaoPessoaService(GestaoPessoaService gestaoPessoaService) {
		this.gestaoPessoaService = gestaoPessoaService;
	}
	
}
