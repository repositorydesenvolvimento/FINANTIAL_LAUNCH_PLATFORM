package plataformalancamentofinanceiro.enumeration;

public enum TipoCategoriaPessoaEnumeration {
	
	PESSOA_FISICA(1, "PESSOA FISICA", "Pessoa Física"), 
	PESSOA_JURIDICA(2, "PESSOA JURIDICA", "Pessoa Jurídica"),
	INTITUICAO_FINANCEIRA(3, "INTITUICAO FINANCEIRA", "Instituição Financeira");
	
	private Integer codigo;
	private String nome;
	private String descricao;
	
	TipoCategoriaPessoaEnumeration(Integer codigo, String nome, String descricao) {
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
