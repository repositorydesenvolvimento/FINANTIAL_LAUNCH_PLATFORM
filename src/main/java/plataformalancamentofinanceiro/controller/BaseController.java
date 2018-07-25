package plataformalancamentofinanceiro.controller;

import java.io.Serializable;

import plataformalancamentofinanceiro.utility.ConstantantesUtility;

public class BaseController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public String recuperarValorSelectView() {
		return ConstantantesUtility.VIEW_SELECT_OPTION_SELECIONE;
	}
	
}
