package plataformalancamentofinanceiro.service;

import java.io.Serializable;

import plataformalancamentofinanceiro.repository.GestaoCategoriaProdutoServicoRepository;

public class BaseService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private GestaoCategoriaProdutoServicoRepository gestaoCategoriaProdutoServicoRepository;
	
	public BaseService() {
		this.gestaoCategoriaProdutoServicoRepository = new GestaoCategoriaProdutoServicoRepository();
	}

	public GestaoCategoriaProdutoServicoRepository getGestaoCategoriaProdutoServicoRepository() {
		return gestaoCategoriaProdutoServicoRepository;
	}

	public void setGestaoCategoriaProdutoServicoRepository(
			GestaoCategoriaProdutoServicoRepository gestaoCategoriaProdutoServicoRepository) {
		this.gestaoCategoriaProdutoServicoRepository = gestaoCategoriaProdutoServicoRepository;
	}

}
