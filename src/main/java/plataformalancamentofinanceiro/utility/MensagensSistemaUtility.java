package plataformalancamentofinanceiro.utility;

import java.io.Serializable;

// FIXME 31/07/2018 EQUIPE_DESENVOLVIMENTO - DAR CONTIUIDADE A IMPLEMENTACAO DESSA CLASSE 
public class MensagensSistemaUtility implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Responsavel por recuperar uma mensagem de mais baixo nivel possivel.
	 * @param exception
	 * @return
	 */
	public static String getMessageError(Exception exception) {
		while(exception.getCause() != null) {
			exception = (Exception) exception.getCause();
		}
		String mensagemRetorno = exception.getMessage();
		if(mensagemRetorno.contains("foreingn key")) {
			mensagemRetorno = "[ERROR_FOREIGN_KEY]";
		}
		return mensagemRetorno;
	}
	
}
