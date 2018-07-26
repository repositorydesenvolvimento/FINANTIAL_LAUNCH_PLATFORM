package plataformalancamentofinanceiro.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import plataformalancamentofinanceiro.dao.BaseGenericDao;
import plataformalancamentofinanceiro.domain.GestaoProdutoServicoDomain;

@SuppressWarnings("rawtypes")
public class GestaoProdutoServicoRepository extends BaseGenericDao {

	private static final long serialVersionUID = 1L;
	
	public GestaoProdutoServicoRepository() { }
	
	public List<GestaoProdutoServicoDomain> findAll() {
		StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("SELECT gestaoProdutoServicoDomain ");
			stringBuilder.append("FROM GestaoProdutoServicoDomain gestaoProdutoServicoDomain ");
			stringBuilder.append("ORDER BY gestaoProdutoServicoDomain.nome ASC ");
		TypedQuery<GestaoProdutoServicoDomain> typedQuery = getEntityManager().createQuery(stringBuilder.toString(), GestaoProdutoServicoDomain.class);
		return typedQuery.getResultList();
	}
	
}
