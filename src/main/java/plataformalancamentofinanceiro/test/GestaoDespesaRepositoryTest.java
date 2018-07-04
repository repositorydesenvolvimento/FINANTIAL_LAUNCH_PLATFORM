package plataformalancamentofinanceiro.test;

import plataformalancamentofinanceiro.dao.BaseGenericDao;
import plataformalancamentofinanceiro.domain.GestaoDespesaDomain;
import plataformalancamentofinanceiro.factory.GestaoDespesaFactory;
import plataformalancamentofinanceiro.repository.GestaoDespesaRepository;

public class GestaoDespesaRepositoryTest {
	
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
				System.out.println("Parcela: " + gestaoDespesaDomainResult.getNumeroParcela());
				System.out.println("Favorecido: " + gestaoDespesaDomainResult.getGestaoPessoaDomain().getNome());
				System.out.println("Valor: " + gestaoDespesaDomainResult.getValorPrevisto());
				System.out.println("Situação: " + gestaoDespesaDomainResult.getTipoSituacaoPagamentoEnumeration());
			}
	}
	
}
