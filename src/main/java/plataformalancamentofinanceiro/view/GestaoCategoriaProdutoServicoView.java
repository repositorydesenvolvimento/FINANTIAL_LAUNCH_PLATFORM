package plataformalancamentofinanceiro.view;

import plataformalancamentofinanceiro.domain.GestaoCategoriaProdutoServicoDomain;

public class GestaoCategoriaProdutoServicoView extends BaseView {

	private static final long serialVersionUID = 1L;
	
	private GestaoCategoriaProdutoServicoDomain gestaoCategoriaProdutoServicoDomain;
	
	public GestaoCategoriaProdutoServicoView() { 
		this.gestaoCategoriaProdutoServicoDomain = new GestaoCategoriaProdutoServicoDomain();
	}

	public GestaoCategoriaProdutoServicoDomain getGestaoCategoriaProdutoServicoDomain() {
		return gestaoCategoriaProdutoServicoDomain;
	}

	public void setGestaoCategoriaProdutoServicoDomain(
			GestaoCategoriaProdutoServicoDomain gestaoCategoriaProdutoServicoDomain) {
		this.gestaoCategoriaProdutoServicoDomain = gestaoCategoriaProdutoServicoDomain;
	}
	
}
