package plataformalancamentofinanceiro.factory;

import java.math.BigDecimal;
import java.util.Date;

import plataformalancamentofinanceiro.dao.BaseGenericDao;
import plataformalancamentofinanceiro.domain.GestaoCategoriaProdutoServicoDomain;
import plataformalancamentofinanceiro.domain.GestaoDespesaDomain;
import plataformalancamentofinanceiro.domain.GestaoPessoaDomain;
import plataformalancamentofinanceiro.enumeration.TipoSituacaoPagamentoEnumeration;

public class GestaoDespesaFactory extends BaseFactory {

	private static final long serialVersionUID = 1L;
	
	public static BaseGenericDao<GestaoPessoaDomain> gestaoPessoaDao = new BaseGenericDao<GestaoPessoaDomain>();
	public static BaseGenericDao<GestaoCategoriaProdutoServicoDomain> gestaoCategoriaProdutoServicoDao = new BaseGenericDao<GestaoCategoriaProdutoServicoDomain>();
	
	public GestaoDespesaFactory() { }
	
	public static GestaoDespesaDomain despesaFixaVivoInternetTaguatinga() {
		GestaoDespesaDomain gestaoDespesaDomain = new GestaoDespesaDomain();
			gestaoDespesaDomain.setDataCadastroDespesa(new Date());
			gestaoDespesaDomain.setDataMesReferenciaDespesa(gestaoDespesaDomain.getDataCadastroDespesa());
			gestaoDespesaDomain.setDataPagamentoDespesa(new Date());
			gestaoDespesaDomain.setDataTerminoPagamentoDespesa(new Date());
			gestaoDespesaDomain.setDataVencimentoDespesa(new Date());
			gestaoDespesaDomain.setNumeroParcela(1);
			gestaoDespesaDomain.setQuantidadeParcela(12);
			gestaoDespesaDomain.setGestaoPessoaDomain(gestaoPessoaDao.findOne(GestaoPessoaDomain.class, 5L));
			gestaoDespesaDomain.setGestaoCategoriaProdutoServicoDomain(gestaoCategoriaProdutoServicoDao.findOne(GestaoCategoriaProdutoServicoDomain.class, 2L));
			gestaoDespesaDomain.setValorItemDespesa(new BigDecimal(89.00));
			gestaoDespesaDomain.setTipoSituacaoPagamentoEnumeration(TipoSituacaoPagamentoEnumeration.AGUARDANDO_PAGAMENTO);
			gestaoDespesaDomain.setFontePagamentoPessoa(gestaoPessoaDao.findOne(GestaoPessoaDomain.class, 4L));	
		return gestaoDespesaDomain;
	}

}
