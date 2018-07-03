package plataformalancamentofinanceiro.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.TypedQuery;

import plataformalancamentofinanceiro.dao.BaseGenericDao;
import plataformalancamentofinanceiro.domain.GestaoDespesaDomain;

@SuppressWarnings("rawtypes")
@ApplicationScoped
public class GestaoDespesaRepository extends BaseGenericDao {

	private static final long serialVersionUID = 1L;
	
	public List<GestaoDespesaDomain> findAll() {
		StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(" SELECT gestaoDespesaDomain");
			stringBuilder.append(" FROM GestaoDespesaDomain gestaoDespesaDomain");
			stringBuilder.append(" ORDER BY gestaoDespesaDomain.gestaoPessoaDomain.nome");
		TypedQuery<GestaoDespesaDomain> typedQuery = getEntityManager().createQuery(stringBuilder.toString(), GestaoDespesaDomain.class);		
		return typedQuery.getResultList();
	}
	
}
