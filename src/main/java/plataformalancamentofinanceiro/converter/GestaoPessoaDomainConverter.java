package plataformalancamentofinanceiro.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

import plataformalancamentofinanceiro.connection.EntityManagerConnection;
import plataformalancamentofinanceiro.domain.GestaoDespesaDomain;
import plataformalancamentofinanceiro.domain.GestaoPessoaDomain;

@FacesConverter(value = "gestaogestaoPessoaDomainConverter", forClass = GestaoDespesaDomain.class)
public class GestaoPessoaDomainConverter extends BaseConverter {

	private static final long serialVersionUID = 1L;
	
	private GestaoPessoaDomain gestaoPessoaDomain;

	/***
	 * Responsavel por converter da tela para o objeto.
	 */
	public Object getAsObject(FacesContext facesContext, UIComponent arg1, String string) {
		if (string == null || string.equals("Selecione")) {
			return false;
		}
		gestaoPessoaDomain = EntityManagerConnection.getEntityManager().find(GestaoPessoaDomain.class,
				Long.parseLong(string));
		return gestaoPessoaDomain;
	}

	/***
	 * Responsavel por converter do objeto para a tela.
	 */
	public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object object) {
		if (object == null) {
			return null;
		}
		GestaoPessoaDomain gestaoPessoaDomain = (GestaoPessoaDomain) object;
		return gestaoPessoaDomain.getCodigo().toString();
	}

	public GestaoPessoaDomain getGestaoPessoaDomain() {
		return gestaoPessoaDomain;
	}

	public void setGestaoPessoaDomain(GestaoPessoaDomain gestaoPessoaDomain) {
		this.gestaoPessoaDomain = gestaoPessoaDomain;
	}
	
}
