package plataformalancamentofinanceiro.converter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;

import org.jboss.logging.Logger;

import plataformalancamentofinanceiro.utility.DateUtility;

@SuppressWarnings("deprecation")
@FacesConverter(value = "calendarConverter", forClass = CalendarConverter.class)
public class CalendarConverter extends BaseConverter {

	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = Logger.getLogger(CalendarConverter.class);
	
	private SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtility.getDateFormatDDDMMYYYY());
	
	// Converter da View para o Controller 
	@Override
	public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String string) {
		if(string == null) {
			return null;
		}
		try { 
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(simpleDateFormat.parse(string));
			return calendar;
		} catch (Exception e) {
			getLogger().error(e.getMessage());
			return null;
		}
	}
	
	// Converter da Controller para o View 
	@Override
	public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object object) {
		Calendar calendar = (Calendar) object;
		return simpleDateFormat.format(calendar.getTime());
	}

	public SimpleDateFormat getSimpleDateFormat() {
		return simpleDateFormat;
	}

	public void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
		this.simpleDateFormat = simpleDateFormat;
	}

	public static Logger getLogger() {
		return LOGGER;
	}
	
}
