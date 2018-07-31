package plataformalancamentofinanceiro.service;

import java.util.List;

import org.jboss.logging.Logger;

import plataformalancamentofinanceiro.domain.GestaoCategoriaProdutoServicoDomain;
import plataformalancamentofinanceiro.repository.GestaoCategoriaProdutoServicoRepository;

public class GestaoCategoriaProdutoServicoService extends BaseService {

	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = Logger.getLogger(GestaoCategoriaProdutoServicoService.class);
	
	private GestaoCategoriaProdutoServicoRepository gestaoCategoriaProdutoServicoRepository;	
	
	public GestaoCategoriaProdutoServicoService() {
		this.gestaoCategoriaProdutoServicoRepository = new GestaoCategoriaProdutoServicoRepository();
	}
	
	@SuppressWarnings("unchecked")
	public void save(GestaoCategoriaProdutoServicoDomain gestaoCategoriaProdutoServicoDomain) {
		if(gestaoCategoriaProdutoServicoRepository.persist(gestaoCategoriaProdutoServicoDomain)) {
			getLogger().info("[MENSAGEM_SUCESSO] Dados cadastrados com Sucesso!");
		} else {
			getLogger().error("[MENSAGEM_ERROR] Erro ao tentar cadastrar os dados!");
		}
	}
	
	/**
	 * Responsavel por recuperar todos os dados de 'GestaoCategoriaProdutoServicoDomain'
	 * @return
	 */
	public List<GestaoCategoriaProdutoServicoDomain> findAll() {
		return gestaoCategoriaProdutoServicoRepository.findAll();
	}

	public GestaoCategoriaProdutoServicoRepository getGestaoCategoriaProdutoServicoRepository() {
		return gestaoCategoriaProdutoServicoRepository;
	}

	public void setGestaoCategoriaProdutoServicoRepository(
			GestaoCategoriaProdutoServicoRepository gestaoCategoriaProdutoServicoRepository) {
		this.gestaoCategoriaProdutoServicoRepository = gestaoCategoriaProdutoServicoRepository;
	}

	public static Logger getLogger() {
		return LOGGER;
	}
	
}
