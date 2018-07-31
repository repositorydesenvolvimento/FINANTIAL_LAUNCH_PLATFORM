package plataformalancamentofinanceiro.enumeration;

public enum TipoProtocoloAtendimentoEnumeration {

	ATENDIMENTO_VIA_TELEFONE(1, "AVT", "Atendimento via Telefone"),
	ATENDIMENTO_VIA_CHAT_ONLINE(2, "AVCO", "Atendimento via Chat Online"),
	ATENDIMENTO_VIA_EMAIL(3, "AVE", "Atendimento via E-mail"),
	ATENDIMENTO_PRESENCIALMENTE(4, "AP", "Atendimento Presencial"),
	ATENDIMENTO_VIA_CARTA(5, "AVC", "Atendimento via Carta");
	
	private Integer codigo;
	private String sigla;
	private String descricao;
	
	private TipoProtocoloAtendimentoEnumeration(Integer codigo, String sigla, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}	
	
}
