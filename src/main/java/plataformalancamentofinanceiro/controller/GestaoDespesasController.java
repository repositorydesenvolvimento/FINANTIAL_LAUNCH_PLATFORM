package plataformalancamentofinanceiro.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import plataformalancamentofinanceiro.domain.GestaoDespesaDomain;

@ManagedBean(name = "gestaoDespesaController")
@SessionScoped
public class GestaoDespesasController {
	
	public String labelDemonstrativo() {
		return "Demonstrativos";
	}
	
	public GestaoDespesaDomain findOne() {
		return null;
	}
	
}
