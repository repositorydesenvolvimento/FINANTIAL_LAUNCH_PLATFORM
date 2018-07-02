package plataformalancamentofinanceiro.test;

import plataformalancamentofinanceiro.dao.BaseGenericDao;
import plataformalancamentofinanceiro.domain.GestaoPessoaDomain;
import plataformalancamentofinanceiro.factory.GestaoPessoaFactory;

public class GestaoPessoaRepositoryTest {
	
	public static void main(String[] args) {
		save();
	}
	
	public static void save() {
		BaseGenericDao<GestaoPessoaDomain> baseGenericDao = new BaseGenericDao<GestaoPessoaDomain>();
		for(GestaoPessoaDomain gestaoPessoaDomainResult: GestaoPessoaFactory.findAll()) {
			baseGenericDao.persist(gestaoPessoaDomainResult);
		}
	}
	
}
