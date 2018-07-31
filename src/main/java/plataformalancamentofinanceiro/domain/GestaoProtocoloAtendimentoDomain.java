package plataformalancamentofinanceiro.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import plataformalancamentofinanceiro.enumeration.TipoProtocoloAtendimentoEnumeration;

/**
 * Futuramente deve ter ligacao com a tabela TB_CONTRATO prevista no modulo de Gestao de Contratos.
 * @author desenvolvimento
 *
 */

@Entity
@Table(name = "TB_GESTAO_PROTOCOLO_ATENDIMENTO")
public class GestaoProtocoloAtendimentoDomain extends BaseDomain {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "CODIGO")
	private Long codigo;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_PROTOCOLO_ATENDIMENTO")
	private TipoProtocoloAtendimentoEnumeration TipoProtocoloAtendimentoEnumeration;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_HORA_INICIO_ATENDIMENTO")
	private Date dataHoraInicioAtendimento;
	
	@Column(name = "ID_PESSOA")
	private GestaoPessoaDomain gestaoPessoaDomain;
	
	@Column(name = "TITULO")
	private String titulo;
	
	@Column(name = "SOLICITACAO")
	private String solicitacao;
	
	@Column(name = "DURACAO_ATENDIMENTO")
	private String duracaoChamada;
	
	@Column(name = "PRAZO_ATENDIMENTO")
	private Date prazoAtendimento; // Exemplo: Liguei na Cetelem e eles me deram um prazo de 5 dias para me retornar
	
	@Column(name = "IS_ATENDIMENTO_CONCLUIDO")
	private Boolean isAtendimentoConcluido;
	
	@Column(name = "NOME_ATENDENTE")
	private String nomeAntendente;
	
	/**
	 * Se o atendimento for via E-mail: <e-mail de atendimento>
	 * Se o atendimento for via Telefone: <numero do telefone>
	 * Se o atendimento for via E-mail: <endereco atendimento>
	 */
	@Column(name = "CANAL_ATENDIMENTO")
	private String canalAtendimento;
	
	public GestaoProtocoloAtendimentoDomain() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public TipoProtocoloAtendimentoEnumeration getTipoProtocoloAtendimentoEnumeration() {
		return TipoProtocoloAtendimentoEnumeration;
	}

	public void setTipoProtocoloAtendimentoEnumeration(
			TipoProtocoloAtendimentoEnumeration tipoProtocoloAtendimentoEnumeration) {
		TipoProtocoloAtendimentoEnumeration = tipoProtocoloAtendimentoEnumeration;
	}

	public Date getDataHoraInicioAtendimento() {
		return dataHoraInicioAtendimento;
	}

	public void setDataHoraInicioAtendimento(Date dataHoraInicioAtendimento) {
		this.dataHoraInicioAtendimento = dataHoraInicioAtendimento;
	}

	public GestaoPessoaDomain getGestaoPessoaDomain() {
		return gestaoPessoaDomain;
	}

	public void setGestaoPessoaDomain(GestaoPessoaDomain gestaoPessoaDomain) {
		this.gestaoPessoaDomain = gestaoPessoaDomain;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(String solicitacao) {
		this.solicitacao = solicitacao;
	}

	public String getDuracaoChamada() {
		return duracaoChamada;
	}

	public void setDuracaoChamada(String duracaoChamada) {
		this.duracaoChamada = duracaoChamada;
	}

	public Date getPrazoAtendimento() {
		return prazoAtendimento;
	}

	public void setPrazoAtendimento(Date prazoAtendimento) {
		this.prazoAtendimento = prazoAtendimento;
	}

	public Boolean getIsAtendimentoConcluido() {
		return isAtendimentoConcluido;
	}

	public void setIsAtendimentoConcluido(Boolean isAtendimentoConcluido) {
		this.isAtendimentoConcluido = isAtendimentoConcluido;
	}

	public String getNomeAntendente() {
		return nomeAntendente;
	}

	public void setNomeAntendente(String nomeAntendente) {
		this.nomeAntendente = nomeAntendente;
	}

	public String getCanalAtendimento() {
		return canalAtendimento;
	}

	public void setCanalAtendimento(String canalAtendimento) {
		this.canalAtendimento = canalAtendimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((TipoProtocoloAtendimentoEnumeration == null) ? 0 : TipoProtocoloAtendimentoEnumeration.hashCode());
		result = prime * result + ((canalAtendimento == null) ? 0 : canalAtendimento.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((dataHoraInicioAtendimento == null) ? 0 : dataHoraInicioAtendimento.hashCode());
		result = prime * result + ((duracaoChamada == null) ? 0 : duracaoChamada.hashCode());
		result = prime * result + ((gestaoPessoaDomain == null) ? 0 : gestaoPessoaDomain.hashCode());
		result = prime * result + ((isAtendimentoConcluido == null) ? 0 : isAtendimentoConcluido.hashCode());
		result = prime * result + ((nomeAntendente == null) ? 0 : nomeAntendente.hashCode());
		result = prime * result + ((prazoAtendimento == null) ? 0 : prazoAtendimento.hashCode());
		result = prime * result + ((solicitacao == null) ? 0 : solicitacao.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		GestaoProtocoloAtendimentoDomain other = (GestaoProtocoloAtendimentoDomain) obj;
		if (TipoProtocoloAtendimentoEnumeration != other.TipoProtocoloAtendimentoEnumeration)
			return false;
		if (canalAtendimento == null) {
			if (other.canalAtendimento != null)
				return false;
		} else if (!canalAtendimento.equals(other.canalAtendimento))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (dataHoraInicioAtendimento == null) {
			if (other.dataHoraInicioAtendimento != null)
				return false;
		} else if (!dataHoraInicioAtendimento.equals(other.dataHoraInicioAtendimento))
			return false;
		if (duracaoChamada == null) {
			if (other.duracaoChamada != null)
				return false;
		} else if (!duracaoChamada.equals(other.duracaoChamada))
			return false;
		if (gestaoPessoaDomain == null) {
			if (other.gestaoPessoaDomain != null)
				return false;
		} else if (!gestaoPessoaDomain.equals(other.gestaoPessoaDomain))
			return false;
		if (isAtendimentoConcluido == null) {
			if (other.isAtendimentoConcluido != null)
				return false;
		} else if (!isAtendimentoConcluido.equals(other.isAtendimentoConcluido))
			return false;
		if (nomeAntendente == null) {
			if (other.nomeAntendente != null)
				return false;
		} else if (!nomeAntendente.equals(other.nomeAntendente))
			return false;
		if (prazoAtendimento == null) {
			if (other.prazoAtendimento != null)
				return false;
		} else if (!prazoAtendimento.equals(other.prazoAtendimento))
			return false;
		if (solicitacao == null) {
			if (other.solicitacao != null)
				return false;
		} else if (!solicitacao.equals(other.solicitacao))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
}
