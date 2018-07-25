package plataformalancamentofinanceiro.service;

import java.util.ArrayList;
import java.util.List;

import plataformalancamentofinanceiro.domain.GestaoPessoaDomain;
import plataformalancamentofinanceiro.enumeration.TipoCategoriaPessoaEnumeration;
import plataformalancamentofinanceiro.repository.GestaoPessoaRepository;

public class GestaoPessoaService extends BaseService {

	private static final long serialVersionUID = 1L;
	
	private GestaoPessoaRepository gestaoPessoaRepository;
	
	public GestaoPessoaService() { 
		this.gestaoPessoaRepository = new GestaoPessoaRepository();
		findAll();
	}
	
	public List<GestaoPessoaDomain> findAll() {
		return gestaoPessoaRepository.findAll();
	}
	
	/**
	 * Recuperar todas as Pessoas do sistema que sao estao cadastradas na categoria Intituicao Financeira.
	 * @return
	 */
	public List<GestaoPessoaDomain> recuperarPessoaInstituicaoFinanceira() {
		List<GestaoPessoaDomain> gestaoPessoaDomainList = new ArrayList<GestaoPessoaDomain>();
		for(GestaoPessoaDomain gestaoPessoaDomainResultado : gestaoPessoaRepository.findAll()) {
			if(gestaoPessoaDomainResultado.getTipoCategoriaPessoaEnumeration().equals(TipoCategoriaPessoaEnumeration.INTITUICAO_FINANCEIRA)) {
				gestaoPessoaDomainList.add(gestaoPessoaDomainResultado);
			}
		}
		return gestaoPessoaDomainList;
	}

	public GestaoPessoaRepository getGestaoPessoaRepository() {
		return gestaoPessoaRepository;
	}

	public void setGestaoPessoaRepository(GestaoPessoaRepository gestaoPessoaRepository) {
		this.gestaoPessoaRepository = gestaoPessoaRepository;
	}
	
}
