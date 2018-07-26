package plataformalancamentofinanceiro.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import plataformalancamentofinanceiro.domain.GestaoCategoriaProdutoServicoDomain;
import plataformalancamentofinanceiro.domain.GestaoProdutoServicoDomain;
import plataformalancamentofinanceiro.repository.GestaoCategoriaProdutoServicoRepository;

public class BaseView implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private GestaoProdutoServicoDomain gestaoProdutoServicoDomain;
	
	private GestaoCategoriaProdutoServicoDomain gestaoCategoriaProdutoServicoDomain;
	
	private GestaoCategoriaProdutoServicoRepository gestaoCategoriaProdutoServicoRepository;
	
	private List<GestaoProdutoServicoDomain> gestaoProdutoServicoDomainList;
	
	private List<GestaoCategoriaProdutoServicoDomain> gestaoCategoriaProdutoServicoDomainList;
	
	public BaseView() {
		this.gestaoProdutoServicoDomain = new GestaoProdutoServicoDomain();
		this.gestaoCategoriaProdutoServicoDomain = new GestaoCategoriaProdutoServicoDomain();
		this.gestaoCategoriaProdutoServicoRepository = new GestaoCategoriaProdutoServicoRepository();
		this.gestaoProdutoServicoDomainList = new ArrayList<GestaoProdutoServicoDomain>();
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

	public GestaoProdutoServicoDomain getGestaoProdutoServicoDomain() {
		return gestaoProdutoServicoDomain;
	}

	public void setGestaoProdutoServicoDomain(GestaoProdutoServicoDomain gestaoProdutoServicoDomain) {
		this.gestaoProdutoServicoDomain = gestaoProdutoServicoDomain;
	}

	public List<GestaoProdutoServicoDomain> getGestaoProdutoServicoDomainList() {
		return gestaoProdutoServicoDomainList;
	}

	public void setGestaoProdutoServicoDomainList(List<GestaoProdutoServicoDomain> gestaoProdutoServicoDomainList) {
		this.gestaoProdutoServicoDomainList = gestaoProdutoServicoDomainList;
	}
	
}
