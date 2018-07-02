package plataformalancamentofinanceiro.test;

import plataformalancamentofinanceiro.dao.BaseGenericDao;
import plataformalancamentofinanceiro.domain.GestaoCategoriaProdutoServicoDomain;
import plataformalancamentofinanceiro.factory.GestaoCategoriaProdutoServicoFactory;

public class GestaoCategoriaProdutoServicoRepositoryTest {
	
	public static void main(String[] args) {
		save();
	}
	
	public static void save() {
		BaseGenericDao<GestaoCategoriaProdutoServicoDomain> baseGenericDao = new BaseGenericDao<GestaoCategoriaProdutoServicoDomain>();
		for(GestaoCategoriaProdutoServicoDomain gestaoCategoriaProdutoServicoDomainResult : GestaoCategoriaProdutoServicoFactory.findAll()) {
			baseGenericDao.persist(gestaoCategoriaProdutoServicoDomainResult);
		}
	}
	
}
