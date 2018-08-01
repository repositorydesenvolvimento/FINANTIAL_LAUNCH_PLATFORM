package plataformalancamentofinanceiro.utility;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

public class MensagensSistemaUtility implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public MensagensSistemaUtility() {	}
	
	/**
	 * Responsavel por recuperar uma mensagem de mais baixo nivel possivel.
	 * Essas mensagens devem ser apresentadas na 'View'.
	 * @param exception
	 * @return
	 */
	public static String recuperarMensagemError(Exception exception) {
		while(exception.getCause() != null) {
			exception = (Exception) exception.getCause();
		}
		String mensagemRetorno = exception.getMessage();
		if(mensagemRetorno.contains("foreingn key")) {
			mensagemRetorno = "Erro de Chave Primária!";
		} if(mensagemRetorno.contains("Duplicate entry")) {
			mensagemRetorno = "Registro Duplicado. Esses dados já foram cadastrados no Banco de Dados!";
		}
		return mensagemRetorno;
	}
	
	public static void mensagemInformacao(String mensagem) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
			facesContext.getExternalContext().getFlash().setKeepMessages(true); // Mantem mensagens ativas em redirecionamentos completos.
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, mensagem, null);
			facesContext.addMessage(null, facesMessage);
	}
	
	@Deprecated
	public static void mensagemErro(String mensagem) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
			facesContext.getExternalContext().getFlash().setKeepMessages(true); // Mantem mensagens ativas em redirecionamentos completos.
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, null);
			facesContext.addMessage(null, facesMessage);
	}
	
	public static void getMensagemInformacao(String mensagem) {
		criarMensagemInterna(mensagem, FacesMessage.SEVERITY_INFO);
	}
	
	public static void getMensagemFatal(String mensagem) {
		criarMensagemInterna(mensagem, FacesMessage.SEVERITY_FATAL);
	}
	
	public static void getMensagemAdvertencia(String mensagem) {
		criarMensagemInterna(mensagem, FacesMessage.SEVERITY_WARN);
	}
	
	public static void getMensagemErro(String mensagem) {
		criarMensagemInterna(mensagem, FacesMessage.SEVERITY_ERROR);
	}

	private static void criarMensagemInterna(String mensagem, Severity severity) {
		FacesMessage facesMessage = new FacesMessage(mensagem);
			facesMessage.setSeverity(severity);
		adicionarMensagemContexto(facesMessage);
	}
	
	private static void adicionarMensagemContexto(FacesMessage facesMessage) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
			facesContext.getExternalContext().getFlash().setKeepMessages(true); // Mantem mensagens ativas em redirecionamentos completos.
			facesContext.addMessage(null, facesMessage);
	}
	
}
