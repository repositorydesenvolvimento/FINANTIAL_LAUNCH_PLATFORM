package plataformalancamentofinanceiro.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "gestaoDespesaController")
@SessionScoped
public class GestaoDespesasController {
	
	public String labelDemonstrativo() {
		return "Demonstrativos";
	}
	
}
