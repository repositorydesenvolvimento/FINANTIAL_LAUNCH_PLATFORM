package plataformalancamentofinanceiro.service;

import java.util.List;

import plataformalancamentofinanceiro.domain.GestaoDespesaDomain;
import plataformalancamentofinanceiro.repository.GestaoDespesaRepository;

public class GestaoDespesaService extends BaseService {

	private static final long serialVersionUID = 1L;
	
	private GestaoDespesaRepository gestaoDespesaRepository;
	
	public GestaoDespesaService() {
		this.gestaoDespesaRepository = new GestaoDespesaRepository();
	}
	
	public List<GestaoDespesaDomain> findAll() {
		return gestaoDespesaRepository.findAll();
	}

	public GestaoDespesaRepository getGestaoDespesaRepository() {
		return gestaoDespesaRepository;
	}

	public void setGestaoDespesaRepository(GestaoDespesaRepository gestaoDespesaRepository) {
		this.gestaoDespesaRepository = gestaoDespesaRepository;
	}
	
}
