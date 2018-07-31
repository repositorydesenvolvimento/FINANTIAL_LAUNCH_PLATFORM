package plataformalancamentofinanceiro.controller;

import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import plataformalancamentofinanceiro.domain.GestaoCategoriaProdutoServicoDomain;
import plataformalancamentofinanceiro.service.GestaoCategoriaProdutoServicoService;
import plataformalancamentofinanceiro.view.GestaoCategoriaProdutoServicoView;

@ManagedBean(name = "gestaoCategoriaProdutoServicoController")
@SessionScoped
public class GestaoCategoriaProdutoServicoController extends BaseController {

	private static final long serialVersionUID = 1L;
	
	private GestaoCategoriaProdutoServicoView gestaoCategoriaProdutoServicoView;

	private GestaoCategoriaProdutoServicoService gestaoCategoriaProdutoServicoService;
	
	public GestaoCategoriaProdutoServicoController() {
		this.gestaoCategoriaProdutoServicoView = new GestaoCategoriaProdutoServicoView();
		this.gestaoCategoriaProdutoServicoService = new GestaoCategoriaProdutoServicoService();
	}
	
	public String save() {
		gestaoCategoriaProdutoServicoService.save(gestaoCategoriaProdutoServicoView.getGestaoCategoriaProdutoServicoDomain());
		reset();
		return "";
	}
	
	public void reset() {
		gestaoCategoriaProdutoServicoView.setGestaoCategoriaProdutoServicoDomain(new GestaoCategoriaProdutoServicoDomain());
	}
	
	public List<GestaoCategoriaProdutoServicoDomain> findAll() {
		return gestaoCategoriaProdutoServicoService.findAll();
	}

	public GestaoCategoriaProdutoServicoView getGestaoCategoriaProdutoServicoView() {
		return gestaoCategoriaProdutoServicoView;
	}

	public void setGestaoCategoriaProdutoServicoView(GestaoCategoriaProdutoServicoView gestaoCategoriaProdutoServicoView) {
		this.gestaoCategoriaProdutoServicoView = gestaoCategoriaProdutoServicoView;
	}

	public GestaoCategoriaProdutoServicoService getGestaoCategoriaProdutoServicoService() {
		return gestaoCategoriaProdutoServicoService;
	}

	public void setGestaoCategoriaProdutoServicoService(
			GestaoCategoriaProdutoServicoService gestaoCategoriaProdutoServicoService) {
		this.gestaoCategoriaProdutoServicoService = gestaoCategoriaProdutoServicoService;
	}
	
}
