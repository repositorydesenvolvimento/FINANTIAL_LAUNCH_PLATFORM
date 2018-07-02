package plataformalancamentofinanceiro.enumeration;

public enum TipoSituacaoEnumeration {
	
	ATIVO(1, "ATIVO", "Ativo"),
	INATIVO(2, "INATIVO", "Inativo"),
	BLOQUEADO(3, "BLOQUEADO", "Bloqueado");
	
	private Integer codigo;
	private String nome;
	private String descricao;
	
	TipoSituacaoEnumeration(Integer codigo, String nome, String descricao) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
