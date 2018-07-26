package plataformalancamentofinanceiro.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_GESTAO_PRODUTO_SERVICO")
public class GestaoProdutoServicoDomain extends BaseDomain {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "CODIGO", nullable = false)
	private Long codigo;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	public GestaoProdutoServicoDomain() { }

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
