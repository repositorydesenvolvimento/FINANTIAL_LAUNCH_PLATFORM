package plataformalancamentofinanceiro.domain;

import java.util.Date;

public class GestaoProtocoloDomain extends BaseDomain {

	private static final long serialVersionUID = 1L;
	
	private Long codigo;
	
	private Date dataHoraCadastro;
	
	private GestaoPessoaDomain gestaoPessoaDomain;
	
	private String titulo;
	
	private String solicitacao;
	
	private String duracaoChamada;
	
	private Date prazoAtendimento; // Exemplo: Liguei na Cetelem e eles me deram um prazo de 5 dias para me retornar
	
	private Boolean isAtendimentoConcluido;
	
	private String nomeAntendente;
	
	public GestaoProtocoloDomain() {
		
	}
	
}
