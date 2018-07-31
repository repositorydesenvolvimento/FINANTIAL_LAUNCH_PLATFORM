package plataformalancamentofinanceiro.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import plataformalancamentofinanceiro.enumeration.TipoCanalPagamentoEnumeration;
import plataformalancamentofinanceiro.enumeration.TipoDespesaEnumeration;
import plataformalancamentofinanceiro.enumeration.TipoFormaPagamentoEnumeration;
import plataformalancamentofinanceiro.enumeration.TipoProtocoloAtendimentoEnumeration;
import plataformalancamentofinanceiro.enumeration.TipoSituacaoEnumeration;
import plataformalancamentofinanceiro.enumeration.TipoSituacaoPagamentoEnumeration;
import plataformalancamentofinanceiro.service.BaseService;
import plataformalancamentofinanceiro.utility.ConstantantesUtility;
import plataformalancamentofinanceiro.view.BaseView;

@ManagedBean(name = "baseController")
@SessionScoped
public class BaseController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private BaseView baseView;
	
	private BaseService baseService;
	
	public BaseController() {
		this.baseService = new BaseService();
		this.baseView = new BaseView();
		this.baseView.setGestaoCategoriaProdutoServicoDomainList(baseService.getGestaoCategoriaProdutoServicoRepository().findAll());
		this.baseView.setGestaoProdutoServicoDomainList(baseService.getGestaoProdutoServicoRepository().findAll());
	}
	
	public String recuperarValorSelectView() {
		return ConstantantesUtility.VIEW_SELECT_OPTION_SELECIONE;
	}
	
	public String recuperarMensagemCampoObrigatorioView() {
		return ConstantantesUtility.MESSAGE_VIEW_CAMPO_OBRIGATORIO;
	}
	
	public TipoFormaPagamentoEnumeration[] recuperarTipoFormaPagamentoEnumeration() {
		return TipoFormaPagamentoEnumeration.values();
	}
	
	public TipoCanalPagamentoEnumeration[] recuperarTipoCanalPagamentoEnumeration() {
		return TipoCanalPagamentoEnumeration.values();
	}
	
	public TipoSituacaoEnumeration[] recuperarTipoSituacaoEnumeration() {
		return TipoSituacaoEnumeration.values();
	}
	
	public TipoDespesaEnumeration[] recuperarTipoDespesaEnumeration() {
		return TipoDespesaEnumeration.values();
	}
	
	public TipoSituacaoPagamentoEnumeration[] recuperarTipoSituacaoPagamentoEnumeration() {
		return TipoSituacaoPagamentoEnumeration.values();
	}
	
	public TipoProtocoloAtendimentoEnumeration[] recuperarTipoProtocoloAtendimentoEnumeration() {
		return TipoProtocoloAtendimentoEnumeration.values();
	}

	public BaseView getBaseView() {
		return baseView;
	}

	public void setBaseView(BaseView baseView) {
		this.baseView = baseView;
	}

	public BaseService getBaseService() {
		return baseService;
	}

	public void setBaseService(BaseService baseService) {
		this.baseService = baseService;
	}
	
}
