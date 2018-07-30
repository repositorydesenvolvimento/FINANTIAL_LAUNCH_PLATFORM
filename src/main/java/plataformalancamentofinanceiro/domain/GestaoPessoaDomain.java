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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((dataCadastroSistema == null) ? 0 : dataCadastroSistema.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((tipoCategoriaPessoaEnumeration == null) ? 0 : tipoCategoriaPessoaEnumeration.hashCode());
		result = prime * result + ((tipoSituacaoEnumeration == null) ? 0 : tipoSituacaoEnumeration.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GestaoPessoaDomain other = (GestaoPessoaDomain) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (dataCadastroSistema == null) {
			if (other.dataCadastroSistema != null)
				return false;
		} else if (!dataCadastroSistema.equals(other.dataCadastroSistema))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipoCategoriaPessoaEnumeration != other.tipoCategoriaPessoaEnumeration)
			return false;
		if (tipoSituacaoEnumeration != other.tipoSituacaoEnumeration)
			return false;
		return true;
	}
	
}
	