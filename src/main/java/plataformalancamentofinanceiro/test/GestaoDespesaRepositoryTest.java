package plataformalancamentofinanceiro.test;

import plataformalancamentofinanceiro.dao.BaseGenericDao;
import plataformalancamentofinanceiro.domain.GestaoDespesaDomain;
import plataformalancamentofinanceiro.factory.GestaoDespesaFactory;

public class GestaoDespesaRepositoryTest {
	
	public static void main(String[] args) {
		save();
	}
	
	public static void save() {
		BaseGenericDao<GestaoDespesaDomain> baseGenericDao = new BaseGenericDao<GestaoDespesaDomain>();
			baseGenericDao.persist(GestaoDespesaFactory.despesaFixaVivoInternetTaguatinga());
	}
	
}
