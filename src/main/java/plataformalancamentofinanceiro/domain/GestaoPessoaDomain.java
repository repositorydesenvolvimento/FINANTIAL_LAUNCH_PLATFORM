package plataformalancamentofinanceiro.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import plataformalancamentofinanceiro.enumeration.TipoCategoriaPessoaEnumeration;
import plataformalancamentofinanceiro.enumeration.TipoSituacaoEnumeration;

@Entity
@Table(name = "TB_GESTAO_PESSOA")
public class GestaoPessoaDomain extends BaseDomain {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO")
	private Long codigo;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_CATEGORIA_PESSOA", length = 100, nullable = true)
	private TipoCategoriaPessoaEnumeration tipoCategoriaPessoaEnumeration;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_ATIVO_INATIVO", length = 100, nullable = true)
	private TipoSituacaoEnumeration tipoSituacaoEnumeration;
	
	@NotNull
	@NotEmpty
	@Column(name = "NOME", length = 100, nullable = false, unique = true)
	private String nome;
	
	@Column(name = "DATA_CADASTRO", nullable = false)
	private Date dataCadastroSistema;
	
	public GestaoPessoaDomain() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public TipoCategoriaPessoaEnumeration getTipoCategoriaPessoaEnumeration() {
		return tipoCategoriaPessoaEnumeration;
	}

	public void setTipoCategoriaPessoaEnumeration(TipoCategoriaPessoaEnumeration tipoCategoriaPessoaEnumeration) {
		this.tipoCategoriaPessoaEnumeration = tipoCategoriaPessoaEnumeration;
	}

	public TipoSituacaoEnumeration getTipoSituacaoEnumeration() {
		return tipoSituacaoEnumeration;
	}

	public void setTipoSituacaoEnumeration(TipoSituacaoEnumeration tipoSituacaoEnumeration) {
		this.tipoSituacaoEnumeration = tipoSituacaoEnumeration;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataCadastroSistema() {
		return dataCadastroSistema;
	}

	public void setDataCadastroSistema(Date dataCadastroSistema) {
		this.dataCadastroSistema = dataCadastroSistema;
	}

	@Override
	public String toString() {
		return "GestaoPessoaDomain [Nome=" + nome + "]";
	}
	
}
	