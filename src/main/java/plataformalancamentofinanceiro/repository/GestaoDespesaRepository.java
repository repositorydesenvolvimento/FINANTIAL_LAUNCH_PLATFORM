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
			stringBuilder.append(" SELECT pessoaDomain");
			stringBuilder.append(" FROM PessoaDomain pessoaDomain");
			stringBuilder.append(" ORDER BY pessoaDomain.nome");
		TypedQuery<GestaoDespesaDomain> typedQuery = getEntityManager().createQuery(stringBuilder.toString(), GestaoDespesaDomain.class);		
		return typedQuery.getResultList();
	}
	
}
