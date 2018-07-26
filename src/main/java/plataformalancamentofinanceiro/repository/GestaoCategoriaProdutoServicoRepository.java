package plataformalancamentofinanceiro.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import plataformalancamentofinanceiro.dao.BaseGenericDao;
import plataformalancamentofinanceiro.domain.GestaoCategoriaProdutoServicoDomain;

@SuppressWarnings("rawtypes")
public class GestaoCategoriaProdutoServicoRepository extends BaseGenericDao {

	private static final long serialVersionUID = 1L;

	public List<GestaoCategoriaProdutoServicoDomain> findAll() {
		StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("SELECT gestaoCategoriaProdutoServicoDomain ");
			stringBuilder.append("FROM GestaoCategoriaProdutoServicoDomain gestaoCategoriaProdutoServicoDomain ");
			stringBuilder.append("ORDER BY gestaoCategoriaProdutoServicoDomain.nome ASC ");
		TypedQuery<GestaoCategoriaProdutoServicoDomain> typedQuery = getEntityManager().createQuery(stringBuilder.toString(), GestaoCategoriaProdutoServicoDomain.class);
		return typedQuery.getResultList();
	}
}
