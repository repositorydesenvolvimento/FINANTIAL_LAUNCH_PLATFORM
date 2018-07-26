package plataformalancamentofinanceiro.service;

import java.io.Serializable;

import plataformalancamentofinanceiro.repository.GestaoCategoriaProdutoServicoRepository;
import plataformalancamentofinanceiro.repository.GestaoProdutoServicoRepository;

public class BaseService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private GestaoCategoriaProdutoServicoRepository gestaoCategoriaProdutoServicoRepository;
	
	private GestaoProdutoServicoRepository gestaoProdutoServicoRepository;
	
	public BaseService() {
		this.gestaoProdutoServicoRepository = new GestaoProdutoServicoRepository();
		this.gestaoCategoriaProdutoServicoRepository = new GestaoCategoriaProdutoServicoRepository();
	}

	public GestaoCategoriaProdutoServicoRepository getGestaoCategoriaProdutoServicoRepository() {
		return gestaoCategoriaProdutoServicoRepository;
	}

	public void setGestaoCategoriaProdutoServicoRepository(
			GestaoCategoriaProdutoServicoRepository gestaoCategoriaProdutoServicoRepository) {
		this.gestaoCategoriaProdutoServicoRepository = gestaoCategoriaProdutoServicoRepository;
	}

	public GestaoProdutoServicoRepository getGestaoProdutoServicoRepository() {
		return gestaoProdutoServicoRepository;
	}

	public void setGestaoProdutoServicoRepository(GestaoProdutoServicoRepository gestaoProdutoServicoRepository) {
		this.gestaoProdutoServicoRepository = gestaoProdutoServicoRepository;
	}

}
