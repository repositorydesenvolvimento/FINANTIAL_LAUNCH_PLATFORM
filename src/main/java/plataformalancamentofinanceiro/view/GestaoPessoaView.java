package plataformalancamentofinanceiro.view;

import java.util.ArrayList;
import java.util.List;

import plataformalancamentofinanceiro.domain.GestaoPessoaDomain;

public class GestaoPessoaView extends BaseView {

	private static final long serialVersionUID = 1L;
	
	public GestaoPessoaDomain gestaoPessoaDomain;
	
	private List<GestaoPessoaDomain> gestaoPessoaDomainList = new ArrayList<GestaoPessoaDomain>();
	
	public GestaoPessoaView() { 
		this.gestaoPessoaDomain = new GestaoPessoaDomain();
	}

	public GestaoPessoaDomain getGestaoPessoaDomain() {
		return gestaoPessoaDomain;
	}

	public void setGestaoPessoaDomain(GestaoPessoaDomain gestaoPessoaDomain) {
		this.gestaoPessoaDomain = gestaoPessoaDomain;
	}

	public List<GestaoPessoaDomain> getGestaoPessoaDomainList() {
		return gestaoPessoaDomainList;
	}

	public void setGestaoPessoaDomainList(List<GestaoPessoaDomain> gestaoPessoaDomainList) {
		this.gestaoPessoaDomainList = gestaoPessoaDomainList;
	}
	
}
