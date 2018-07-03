package plataformalancamentofinanceiro.enumeration;

public enum TipoCanalPagamentoEnumeration {

	PAGAMENTO_CAIXA_ESTABELECIMENTO(1, "PCE", "Pagamento em Caixa do Estabelecimento"),
	PAGAMENTO_INTERNET_BANKING(2, "PIB", "Pagamento via Internet Bancking"),
	PAGAMENTO_DESCONTO_AUTOMATICO_CONTA_CORRENTE(3, "PACC", "Desconto Automático em Conta Corrente"),
	PAGAMENTO_DINHEIRO(4, "PD", "Pagamento em Dinheiro"),
	PAGAMENTO_MERCADO_PAGO(5, "PMP", "Pagamento via Mercado Pago"),
	DEPOSITO_CAIXA_ELETRONICO(6, "DCE", "Depósito realizado em Caixa Eletrônico"),
	DEPOSITO_CAIXA_AGENCIA(7, "DCA", "Desconto realizado no Caixa da Agência");
	
	private Integer codigo;
	private String sigla;
	private String descricao;
	
	private TipoCanalPagamentoEnumeration(Integer codigo, String sigla, String descricao) {
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
