package plataformalancamentofinanceiro.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_GESTAO_CATEGORIA_PRODUTO_SERVICO")
public class GestaoCategoriaProdutoServicoDomain extends BaseDomain {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "CODIGO", nullable = false)
	private Long codigo;
	
	private String nome;
	
	public GestaoCategoriaProdutoServicoDomain() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
