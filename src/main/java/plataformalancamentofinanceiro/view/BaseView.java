package plataformalancamentofinanceiro.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import plataformalancamentofinanceiro.domain.GestaoCategoriaProdutoServicoDomain;
import plataformalancamentofinanceiro.repository.GestaoCategoriaProdutoServicoRepository;

public class BaseView implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private GestaoCategoriaProdutoServicoDomain gestaoCategoriaProdutoServicoDomain;
	
	private GestaoCategoriaProdutoServicoRepository gestaoCategoriaProdutoServicoRepository;
	
	private List<GestaoCategoriaProdutoServicoDomain> gestaoCategoriaProdutoServicoDomainList;
	
	public BaseView() {
		this.gestaoCategoriaProdutoServicoDomain = new GestaoCategoriaProdutoServicoDomain();
		this.gestaoCategoriaProdutoServicoRepository = new GestaoCategoriaProdutoServicoRepository();
		this.gestaoCategoriaProdutoServicoDomainList = new ArrayList<GestaoCategoriaProdutoServicoDomain>();
	}

	public List<GestaoCategoriaProdutoServicoDomain> getGestaoCategoriaProdutoServicoDomainList() {
		return gestaoCategoriaProdutoServicoDomainList;
	}

	public void setGestaoCategoriaProdutoServicoDomainList(
			List<GestaoCategoriaProdutoServicoDomain> gestaoCategoriaProdutoServicoDomainList) {
		this.gestaoCategoriaProdutoServicoDomainList = gestaoCategoriaProdutoServicoDomainList;
	}

	public GestaoCategoriaProdutoServicoRepository getGestaoCategoriaProdutoServicoRepository() {
		return gestaoCategoriaProdutoServicoRepository;
	}

	public void setGestaoCategoriaProdutoServicoRepository(
			GestaoCategoriaProdutoServicoRepository gestaoCategoriaProdutoServicoRepository) {
		this.gestaoCategoriaProdutoServicoRepository = gestaoCategoriaProdutoServicoRepository;
	}

	public GestaoCategoriaProdutoServicoDomain getGestaoCategoriaProdutoServicoDomain() {
		return gestaoCategoriaProdutoServicoDomain;
	}

	public void setGestaoCategoriaProdutoServicoDomain(
			GestaoCategoriaProdutoServicoDomain gestaoCategoriaProdutoServicoDomain) {
		this.gestaoCategoriaProdutoServicoDomain = gestaoCategoriaProdutoServicoDomain;
	}
	
}
