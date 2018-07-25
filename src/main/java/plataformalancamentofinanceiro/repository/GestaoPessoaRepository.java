package plataformalancamentofinanceiro.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import plataformalancamentofinanceiro.dao.BaseGenericDao;
import plataformalancamentofinanceiro.domain.GestaoPessoaDomain;

@SuppressWarnings("rawtypes")
public class GestaoPessoaRepository extends BaseGenericDao {

	private static final long serialVersionUID = 1L;
	
	public GestaoPessoaRepository() { }
	
	public List<GestaoPessoaDomain> findAll() {
		StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("SELECT gestaoPessoaDomain ");
			stringBuilder.append("FROM GestaoPessoaDomain gestaoPessoaDomain ");
			stringBuilder.append("ORDER BY gestaoPessoaDomain.nome ASC ");
		TypedQuery<GestaoPessoaDomain> typedQuery = getEntityManager().createQuery(stringBuilder.toString(), GestaoPessoaDomain.class);
		return typedQuery.getResultList();
	}
	
}
