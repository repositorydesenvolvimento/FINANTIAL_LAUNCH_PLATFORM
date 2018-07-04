package plataformalancamentofinanceiro.factory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import plataformalancamentofinanceiro.dao.BaseGenericDao;
import plataformalancamentofinanceiro.domain.GestaoCategoriaProdutoServicoDomain;
import plataformalancamentofinanceiro.domain.GestaoDespesaDomain;
import plataformalancamentofinanceiro.domain.GestaoPessoaDomain;
import plataformalancamentofinanceiro.enumeration.TipoDespesaEnumeration;
import plataformalancamentofinanceiro.enumeration.TipoPeriodoEnumeration;
import plataformalancamentofinanceiro.enumeration.TipoSituacaoPagamentoEnumeration;

public class GestaoDespesaFactory extends BaseFactory {

	private static final long serialVersionUID = 1L;
	
	public static BaseGenericDao<GestaoPessoaDomain> gestaoPessoaDao = new BaseGenericDao<GestaoPessoaDomain>();
	public static BaseGenericDao<GestaoCategoriaProdutoServicoDomain> gestaoCategoriaProdutoServicoDao = new BaseGenericDao<GestaoCategoriaProdutoServicoDomain>();
	
	public GestaoDespesaFactory() { }
	
	public static GestaoDespesaDomain getGestaoDespesaFixaMensalAguardandoPagamento(GestaoDespesaDomain gestaoDespesaDomain) {
		GestaoDespesaDomain gestaoDespesaDomainResult = new GestaoDespesaDomain();
			gestaoDespesaDomainResult.setDataCadastroDespesa(gestaoDespesaDomain.getDataCadastroDespesa());
			gestaoDespesaDomainResult.setDataMesReferenciaDespesa(gestaoDespesaDomain.getDataMesReferenciaDespesa());
			gestaoDespesaDomainResult.setDataPagamentoDespesa(gestaoDespesaDomain.getDataPagamentoDespesa());
			gestaoDespesaDomainResult.setDataTerminoPagamentoDespesa(gestaoDespesaDomain.getDataTerminoPagamentoDespesa());
			gestaoDespesaDomainResult.setDataVencimentoDespesa(gestaoDespesaDomain.getDataVencimentoDespesa());
			gestaoDespesaDomainResult.setNumeroParcela(gestaoDespesaDomain.getNumeroParcela());
			gestaoDespesaDomainResult.setQuantidadeParcela(gestaoDespesaDomain.getQuantidadeParcela());
			gestaoDespesaDomainResult.setGestaoPessoaDomain(gestaoDespesaDomain.getGestaoPessoaDomain());
			gestaoDespesaDomainResult.setGestaoCategoriaProdutoServicoDomain(gestaoDespesaDomain.getGestaoCategoriaProdutoServicoDomain());
			gestaoDespesaDomainResult.setValorItemDespesa(gestaoDespesaDomain.getValorDesconto());
			gestaoDespesaDomainResult.setTipoSituacaoPagamentoEnumeration(gestaoDespesaDomain.getTipoSituacaoPagamentoEnumeration());
			gestaoDespesaDomainResult.setTipoDespesaEnumeration(gestaoDespesaDomain.getTipoDespesaEnumeration());
			gestaoDespesaDomainResult.setTipoPeriodoEnumeration(gestaoDespesaDomain.getTipoPeriodoEnumeration());
			gestaoDespesaDomainResult.setFontePagamentoPessoa(gestaoDespesaDomain.getFontePagamentoPessoa());	
		return gestaoDespesaDomainResult;
	}
	
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
			gestaoDespesaDomain.setTipoDespesaEnumeration(TipoDespesaEnumeration.DESPESA_FIXA);
			gestaoDespesaDomain.setTipoPeriodoEnumeration(TipoPeriodoEnumeration.MENSAL);
			gestaoDespesaDomain.setFontePagamentoPessoa(gestaoPessoaDao.findOne(GestaoPessoaDomain.class, 1L));	
			gestaoDespesaDomain.setGestaoCategoriaProdutoServicoDomain(gestaoCategoriaProdutoServicoDao.findOne(GestaoCategoriaProdutoServicoDomain.class, 1L));
		return gestaoDespesaDomain;
	}
	
	public static List<GestaoDespesaDomain> findAll() {
		List<GestaoDespesaDomain> gestaoDespesaDomainList = new ArrayList<GestaoDespesaDomain>();
			gestaoDespesaDomainList.add(despesaFixaVivoInternetTaguatinga());
		return gestaoDespesaDomainList;
	}

}
