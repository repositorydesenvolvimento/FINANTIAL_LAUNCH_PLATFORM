package plataformalancamentofinanceiro.utility;

import java.io.Serializable;

public class DateUtility implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static final String DATE_FORMAT_DD_MM_YYYY = "dd/MM/yyyy";
	
	/**
	 * Data no formato: DD/MM/YYYY
	 * Exemplo: 30/01/1990
	 */
	public static String getDateFormatDDDMMYYYY() {
		return DATE_FORMAT_DD_MM_YYYY;
	} 
	
}
