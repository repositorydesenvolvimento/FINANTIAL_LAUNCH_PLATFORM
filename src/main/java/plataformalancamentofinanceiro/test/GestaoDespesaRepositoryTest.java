package plataformalancamentofinanceiro.test;

import org.jboss.logging.Logger;

import plataformalancamentofinanceiro.dao.BaseGenericDao;
import plataformalancamentofinanceiro.domain.GestaoDespesaDomain;
import plataformalancamentofinanceiro.factory.GestaoDespesaFactory;
import plataformalancamentofinanceiro.repository.GestaoDespesaRepository;

public class GestaoDespesaRepositoryTest {
	
	private static final Logger LOGGER = Logger.getLogger(GestaoDespesaRepositoryTest.class);
	
	public static void main(String[] args) {
		save();
		findAll();
	}
	
	public static void save() {
		BaseGenericDao<GestaoDespesaDomain> baseGenericDao = new BaseGenericDao<GestaoDespesaDomain>();
			baseGenericDao.persist(GestaoDespesaFactory.despesaFixaVivoInternetTaguatinga());
	}
	
	public static void findAll() {
		GestaoDespesaRepository gestaoDespesaRepository = new GestaoDespesaRepository();
			for(GestaoDespesaDomain gestaoDespesaDomainResult : gestaoDespesaRepository.findAll()) {
				getLogger().debug("Parcela: " + gestaoDespesaDomainResult.getNumeroParcela());
				getLogger().debug("Favorecido: " + gestaoDespesaDomainResult.getGestaoPessoaDomain().getNome());
				getLogger().debug("Valor: " + gestaoDespesaDomainResult.getValorPrevisto());
				getLogger().debug("Situação: " + gestaoDespesaDomainResult.getTipoSituacaoPagamentoEnumeration());
			}
	}

	public static Logger getLogger() {
		return LOGGER;
	}
	
}
