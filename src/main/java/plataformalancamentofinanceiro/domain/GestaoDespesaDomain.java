package plataformalancamentofinanceiro.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import plataformalancamentofinanceiro.enumeration.TipoAtivoInativoEnumeration;
import plataformalancamentofinanceiro.enumeration.TipoCanalPagamentoEnumeration;
import plataformalancamentofinanceiro.enumeration.TipoDespesaEnumeration;
import plataformalancamentofinanceiro.enumeration.TipoDocumentoEnumeration;
import plataformalancamentofinanceiro.enumeration.TipoFormaPagamentoEnumeration;
import plataformalancamentofinanceiro.enumeration.TipoPeriodoEnumeration;
import plataformalancamentofinanceiro.enumeration.TipoSituacaoPagamentoEnumeration;

/*
 * # Responsavel por estabelecer a gestao de Despesas Pessoais.
 * 
 * Esse modulo do sistema e responsavel as seguintes operacoes:
 * 	- Cadastro de Despesas 
 *  - Remocao de Despesas
 *  - Edicao de Despesas
 *  - Consulta de Despensas
 *  
 * # Regras
 * 
 * 	+ RN Ao cadastrar uma 'Nova Despesa Fixa' deve ser gravada os seguintes dados 
 * 		- Favorecido, 
 *      - Data de Vencimento, 
 *      - Data de Pagamento, 
 *      	- Valores (valor da despesa, valor do desconto, valor final do pagamento)
 *      - Canal de Pagamento 
 *      	- Forma que e realizada a transacao: Internet Bancking, Caixa, Boleto, Deposito, etc
 *      - Fonte de Pagamento
 *      	- A fonte de pagamento refere-se a conta onde ocorreu(ra) o desconto para o pagamento da referida despesa
 *      
 *  + RN Uma Despesa Variavel deve-se gravar os seguintes dados
 *  	- Favorecido,
 *  	- Data Pagamento
 *  	- Data de Vencimento
 *  	- Valores (valor da despesa, valor do desconto, valor final do pagamento)
 *      - Canal de Pagamento 
 *      	- Forma que e realizada a transacao: Internet Bancking, Caixa, Boleto, Deposito, etc
 *      - Fonte de Pagamento
 *      	- A fonte de pagamento refere-se a conta onde ocorreu(ra) o desconto para o pagamento da referida despesa
 *        
 * # Nota: Entende-se por despesa as categorias de despesas que serao gerenciadas, a saber:
 * 	- Despesas Fixas e Despesas Variaveis (doravante denominados de 'Despesas')
 * 		- As Despesas Fixas
 * 			- Sao despesas que tem perioticidade de pagamento por mais de 6 meses
 * 		- As Despesas Variaveis
 * 			- Sao despesas que tem perioticidade com menos de 6 meses
 * 
 * # Nota: Entende-se por Favorecido a Pessoa do Sistema (fisica ou juridica) ao qual devera ser quitado uma parcela
 * 
 * Despesas Fixas

Favorecido:            Sinagoga 
Produto ou Serviço:    Mensalidade Sinagogal
Categoria Despesa:     Instituição Religiosa
Valor Previsto:        R$ 155,00
Data Vencimento:       10/07/2018
Tipo de Despesa:       Despesa Fixa
Fonte de Pagamento:    Banco Santander 
Situação:              Aguardando Pagamento
Data Pagamento:        10/07/2018   
Canal Pagamento:       Internet Bancking   
Despesa Fechada:       Sim                 // Quando o Processamento estiver Concluido

Favorecido:            Banco Santander
Produto ou Serviço:    Fatura Cartão de Crédito
Categoria Despesa:     Cartão de Crédito
Valor Previsto:        R$ 1000,00
Data Vencimento:       20/08/2018
Tipo de Despesa:       Despesa Fixa
Fonte de Pagamento:    Banco Santander 
Situação:              Aguardando Pagamento
Data Pagamento:        10/07/2018   
Canal Pagamento:       Internet Bancking   
Despesa Fechada:       Sim                 // Quando o Processamento estiver Concluido

Favorecido:            DFTRANS
Produto ou Serviço:    Mensalidade Cartão DFTRANS
Categoria Despesa:     Transporte Público - Passagem
Valor Previsto:        R$ 300,00
Data Vencimento:       20/08/2018
Tipo de Despesa:       Despesa Fixa
Fonte de Pagamento:    Banco Caixa Econômica Federal
Situação:              Aguardando Pagamento
Data Pagamento:        10/07/2018   
Canal Pagamento:       Internet Bancking   
Despesa Fechada:       Sim                 // Quando o Processamento estiver Concluido

Favorecido:            TIM Telecomunicações
Produto ou Serviço:    Serviços de Internet Telefônia Móvel
Categoria Despesa:     Internet e Telefônia Móvel
Valor Previsto:        R$ 55,00
Data Vencimento:       20/08/2018
Tipo de Despesa:       Despesa Fixa
Fonte de Pagamento:    Banco Santander
Situação:              Aguardando Pagamento
Data Pagamento:        NULL   
Canal Pagamento:       Internet Bancking   
Despesa Fechada:       Não                 // Quando o Processamento estiver Concluido

Despesas Variáveis

 */
@Entity
@Table(name = "TB_GESTAO_DESPESA")
public class GestaoDespesaDomain extends BaseDomain {

	 private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "CODIGO")
	private Long codigo;
	
	/**
	 * Refere-se ao Favorecido, ou seja, a empresa em que e realizado uma
	 * determinada compra.
	 */
	@OneToOne
	@JoinColumn(name = "ID_PESSOA", referencedColumnName = "CODIGO", nullable = false)
	private GestaoPessoaDomain gestaoPessoaDomain;
	
	/**
	 * Refere-se as categoria dos servicos dos produtos. Exemplo de Dominios:
	 * Servicos de Telefonia Movel, Educacao Superior (Graduacao), Fatura de Cartao
	 * de Credito, Textil, Perfumaria, Calcados, Alimentos, outros.
	 */
	@ManyToOne	
	@JoinColumn(name = "ID_PRODUTO_SERVICO", referencedColumnName = "CODIGO", nullable = true)
	private GestaoProdutoServicoDomain gestaoProdutoServicoDomain;
	
	/**
	 * Refere-se ao Favorecido, ou seja, a empresa em que e realizado uma
	 * determinada compra.
	 */
	@OneToOne
	@JoinColumn(name = "ID_CATEGORIA_PRODUTO", referencedColumnName = "CODIGO", nullable = false)
	private GestaoCategoriaProdutoServicoDomain gestaoCategoriaProdutoServicoDomain;
	
	/**
	 * Refere-se ao numero da Nota Fiscal emitida pelo estabelecimento no ato da
	 * compra.
	 */
	
	@Column(name = "NUMERO_NOTA_FISCAL", nullable = true)
	private String numeroNotaFiscal;
	
	/**
	 * O valor desse campo e calculado pelo sistema. Refere-se ao Valor Previsto
	 * Total das despesas para um determinado periodo (meses, anos).
	 */
	@Column(name = "VALOR_PREVISTO", nullable = true)
	private BigDecimal valorPrevisto;
	
	/**
	 * Refere-se ao Valor do Desconto dado por algumas empresas referente, por
	 * exemplo, quando se paga uma conta dentro de um prazo determinado.
	 */
	@Column(name = "VALOR_DESCONTO", nullable = true)
	private BigDecimal valorDesconto;
	
	/**
	 * O valor desse campo e calculado pelo sistema. Refere-se ao Valor Total de
	 * Juros e demais encargos em caso de atraso no pagamento.
	 */
	@Column(name = "VALOR_TOTAL_JUROS", nullable = true)
	private BigDecimal valorTotalJuros;
	
	/**
	 * Refere-se ao Valor do Item da Despesa.
	 */
	@Column(name = "VALOR_ITEM_DESPESA", nullable = true)
	private BigDecimal valorItemDespesa;
	
	/**
	 * O valor desse campo e calculado pelo sistema. Refere-se ao Valor Total de
	 * todas as despesas de um determinado periodo.
	 */
	@Column(name = "VALOR_TOTAL_DESPESAS", nullable = true)
	private BigDecimal valorTotalDespesa;
	
	/**
	 * Refere-se ao Valor atualizado Total de despesas ja pagas em um determinado
	 * perido.
	 */
	@Column(name = "VALOR_TOTAL_PAGO", nullable = true)
	private BigDecimal valorTotalPago;
	
	/**
	 * O valor desse campo e calculado pelo sistema. Refere-se ao Valor Restante
	 * Atualizado de despesas a serem pagas em um determinado perido.
	 */
	@Column(name = "VALOR_RESTANTE", nullable = true)
	private BigDecimal valorRestante;
	
	/**
	 * O valor desse campo e calculado pelo sistema. Refere-se a Data de Cadastro de
	 * uma determinada despesa no sistema.
	 */
	@Column(name = "DATA_CADASTRO_DESPESA", nullable = true)
	private Date dataCadastroDespesa;
	
	/**
	 * Refere-se a Data de Vencimento de uma determinada despesa no sistema.
	 */
	@Column(name = "DATA_VENCIMENTO_DESPESA", nullable = true)
	private Date dataVencimentoDespesa;
	
	/**
	 * Refere-se a Data de Termino do Pagamento de uma determinada despesa no
	 * sistema considerando se o 'NUMERO_PARCELA' maior que zero, ou seja, devera
	 * ser gravado a data das despesas para as quantidades de meses.
	 */
	@Column(name = "DATA_TERMINO_PAGAMENTO_DESPESA", nullable = true)
	private Date dataTerminoPagamentoDespesa;
	
	/**
	 * Refere-se a Data do Mes de Referencia da Despesa, ou seja, para selecionar a
	 * despesa do mes de referecia (mes atual).
	 */
	@Column(name = "DATA_MES_RFERENCIA_DESPESA", nullable = true)
	private Date dataMesReferenciaDespesa;
	
	/**
	 * Refere-se a Data de Pagamento de uma determinada despesa no sistema.
	 */
	@Column(name = "DATA_PAGAMENTO_DESPESA", nullable = true)
	private Date dataPagamentoDespesa;
	
	/**
	 * Refere-se ao Tipo da Despesa, por exemplo, Despesas Fixas ou Despesas
	 * Variaveis.
	 */
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_DESPESA", nullable = true)
	private TipoDespesaEnumeration tipoDespesaEnumeration;
	
	/**
	 * Refere-se a Instituicao Financeira (Bancos), ou seja, e a Fonte utilizada
	 * para ser debitada o valor referente ao pagamento de uma determinada despesa.
	 */
	// @Deprecated
	// @ManyToOne
	// @JoinColumn(name = "ID_INSTITUICAO_FINANCEIRA", referencedColumnName =
	// "CODIGO", nullable = true)
	// private InstituicaoFinanceiraDomain instituicaoFinanceiraDomain;
	
	/**
	 * Refere-se a Fonte do Pagamento, ou seja, de onde sera descontado o pagamento
	 * de determinada despesa.
	 */
	@OneToOne
	@JoinColumn(name = "ID_FONTE_PAGAMENTO", referencedColumnName = "CODIGO", nullable = false)
	private GestaoPessoaDomain fontePagamentoPessoa;
	
	/**
	 * Refere-se a Situacao de Pagamento de uma determinada Despesa.
	 */
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_SITUACAO_PAGAMENTO", nullable = true)
	private TipoSituacaoPagamentoEnumeration tipoSituacaoPagamentoEnumeration;
		
	/**
	 * Refere-se ao periodo, ou sejam, quantidade de meses, anos em que a despesa
	 * levara para ser liquidada efetivamente.
	 */
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_PERIODO", nullable = true)
	private TipoPeriodoEnumeration tipoPeriodoEnumeration;
	
	/**
	 * Refere-se a Forma de Pagamento de uma determinada despesa.
	 */
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_FORMA_PAGAMENTO", nullable = true)
	private TipoFormaPagamentoEnumeration tipoFormaPagamentoEnumeration;
	
	/**
	 * Refere-se ao Canal de Pagamento de uma determinada despesa, ou seja, qual
	 * meio o pagamento da despesa foi realizado.
	 */
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_CANAL_PAGAMENTO", nullable = true)
	private TipoCanalPagamentoEnumeration tipoCanalPagamentoEnumeration;
	
	/**
	 * Refere-se ao Canal de Pagamento de uma determinada despesa, ou seja, qual
	 * meio o pagamento da despesa foi realizado.
	 */
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_DOCUMENTO", nullable = true)
	private TipoDocumentoEnumeration tipoDocumentoEnumeration;
	
	/**
	 * Refere-se ao Numero de Parcelas que uma determinada Despesa devera ser
	 * liquidada.
	 */
	@Column(name = "NUMERO_PARCELA", nullable = true)
	private Integer numeroParcela;
	
	/**
	 * Refere-se a Quantidade de produtos comprados.
	 */
	@Column(name = "QUANTIDADE_PRODUTO", nullable = true)
	private Integer quantidadeProduto;
	
	/**
	 * Refere-se a Quantidade de Parcelas utilizadas para o pagamento de uma despesa
	 * variavel caso a Forma de Pagamento seja o Cartao de Credito.
	 */
	@Column(name = "QUANTIDADE_PARCELA", nullable = true)
	private Integer quantidadeParcela;
	
	/**
	 * Refere-se a Situacao da despesa para saber se e Ativa ou Inativa. As despesas
	 * variaveis dever ser do tipo 'Inativo'.
	 */
	@Column(name = "TIPO_ATIVO_INATIVO", nullable = true)
	private TipoAtivoInativoEnumeration tipoAtivoInativoEnumeration;
	
	/**
	 * Refere-se a Observacaoes necessarias para determinadas despesa.
	 */
	@Column(name = "OBSERVACAO", nullable = true)
	private String observacao;
	
	public GestaoDespesaDomain() {	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public GestaoPessoaDomain getGestaoPessoaDomain() {
		return gestaoPessoaDomain;
	}

	public void setGestaoPessoaDomain(GestaoPessoaDomain gestaoPessoaDomain) {
		this.gestaoPessoaDomain = gestaoPessoaDomain;
	}

	public GestaoProdutoServicoDomain getGestaoProdutoServicoDomain() {
		return gestaoProdutoServicoDomain;
	}

	public void setGestaoProdutoServicoDomain(GestaoProdutoServicoDomain gestaoProdutoServicoDomain) {
		this.gestaoProdutoServicoDomain = gestaoProdutoServicoDomain;
	}

	public GestaoCategoriaProdutoServicoDomain getGestaoCategoriaProdutoServicoDomain() {
		return gestaoCategoriaProdutoServicoDomain;
	}

	public void setGestaoCategoriaProdutoServicoDomain(
			GestaoCategoriaProdutoServicoDomain gestaoCategoriaProdutoServicoDomain) {
		this.gestaoCategoriaProdutoServicoDomain = gestaoCategoriaProdutoServicoDomain;
	}

	public String getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}

	public void setNumeroNotaFiscal(String numeroNotaFiscal) {
		this.numeroNotaFiscal = numeroNotaFiscal;
	}

	public BigDecimal getValorPrevisto() {
		return valorPrevisto;
	}

	public void setValorPrevisto(BigDecimal valorPrevisto) {
		this.valorPrevisto = valorPrevisto;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public BigDecimal getValorTotalJuros() {
		return valorTotalJuros;
	}

	public void setValorTotalJuros(BigDecimal valorTotalJuros) {
		this.valorTotalJuros = valorTotalJuros;
	}

	public BigDecimal getValorItemDespesa() {
		return valorItemDespesa;
	}

	public void setValorItemDespesa(BigDecimal valorItemDespesa) {
		this.valorItemDespesa = valorItemDespesa;
	}

	public BigDecimal getValorTotalDespesa() {
		return valorTotalDespesa;
	}

	public void setValorTotalDespesa(BigDecimal valorTotalDespesa) {
		this.valorTotalDespesa = valorTotalDespesa;
	}

	public BigDecimal getValorTotalPago() {
		return valorTotalPago;
	}

	public void setValorTotalPago(BigDecimal valorTotalPago) {
		this.valorTotalPago = valorTotalPago;
	}

	public BigDecimal getValorRestante() {
		return valorRestante;
	}

	public void setValorRestante(BigDecimal valorRestante) {
		this.valorRestante = valorRestante;
	}

	public Date getDataCadastroDespesa() {
		return dataCadastroDespesa;
	}

	public void setDataCadastroDespesa(Date dataCadastroDespesa) {
		this.dataCadastroDespesa = dataCadastroDespesa;
	}

	public Date getDataVencimentoDespesa() {
		return dataVencimentoDespesa;
	}

	public void setDataVencimentoDespesa(Date dataVencimentoDespesa) {
		this.dataVencimentoDespesa = dataVencimentoDespesa;
	}

	public Date getDataTerminoPagamentoDespesa() {
		return dataTerminoPagamentoDespesa;
	}

	public void setDataTerminoPagamentoDespesa(Date dataTerminoPagamentoDespesa) {
		this.dataTerminoPagamentoDespesa = dataTerminoPagamentoDespesa;
	}

	public Date getDataMesReferenciaDespesa() {
		return dataMesReferenciaDespesa;
	}

	public void setDataMesReferenciaDespesa(Date dataMesReferenciaDespesa) {
		this.dataMesReferenciaDespesa = dataMesReferenciaDespesa;
	}

	public Date getDataPagamentoDespesa() {
		return dataPagamentoDespesa;
	}

	public void setDataPagamentoDespesa(Date dataPagamentoDespesa) {
		this.dataPagamentoDespesa = dataPagamentoDespesa;
	}

	public TipoDespesaEnumeration getTipoDespesaEnumeration() {
		return tipoDespesaEnumeration;
	}

	public void setTipoDespesaEnumeration(TipoDespesaEnumeration tipoDespesaEnumeration) {
		this.tipoDespesaEnumeration = tipoDespesaEnumeration;
	}

	public GestaoPessoaDomain getFontePagamentoPessoa() {
		return fontePagamentoPessoa;
	}

	public void setFontePagamentoPessoa(GestaoPessoaDomain fontePagamentoPessoa) {
		this.fontePagamentoPessoa = fontePagamentoPessoa;
	}

	public TipoSituacaoPagamentoEnumeration getTipoSituacaoPagamentoEnumeration() {
		return tipoSituacaoPagamentoEnumeration;
	}

	public void setTipoSituacaoPagamentoEnumeration(TipoSituacaoPagamentoEnumeration tipoSituacaoPagamentoEnumeration) {
		this.tipoSituacaoPagamentoEnumeration = tipoSituacaoPagamentoEnumeration;
	}

	public TipoPeriodoEnumeration getTipoPeriodoEnumeration() {
		return tipoPeriodoEnumeration;
	}

	public void setTipoPeriodoEnumeration(TipoPeriodoEnumeration tipoPeriodoEnumeration) {
		this.tipoPeriodoEnumeration = tipoPeriodoEnumeration;
	}

	public TipoFormaPagamentoEnumeration getTipoFormaPagamentoEnumeration() {
		return tipoFormaPagamentoEnumeration;
	}

	public void setTipoFormaPagamentoEnumeration(TipoFormaPagamentoEnumeration tipoFormaPagamentoEnumeration) {
		this.tipoFormaPagamentoEnumeration = tipoFormaPagamentoEnumeration;
	}

	public TipoCanalPagamentoEnumeration getTipoCanalPagamentoEnumeration() {
		return tipoCanalPagamentoEnumeration;
	}

	public void setTipoCanalPagamentoEnumeration(TipoCanalPagamentoEnumeration tipoCanalPagamentoEnumeration) {
		this.tipoCanalPagamentoEnumeration = tipoCanalPagamentoEnumeration;
	}

	public Integer getNumeroParcela() {
		return numeroParcela;
	}

	public void setNumeroParcela(Integer numeroParcela) {
		this.numeroParcela = numeroParcela;
	}

	public Integer getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(Integer quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public Integer getQuantidadeParcela() {
		return quantidadeParcela;
	}

	public void setQuantidadeParcela(Integer quantidadeParcela) {
		this.quantidadeParcela = quantidadeParcela;
	}

	public TipoAtivoInativoEnumeration getTipoAtivoInativoEnumeration() {
		return tipoAtivoInativoEnumeration;
	}

	public void setTipoAtivoInativoEnumeration(TipoAtivoInativoEnumeration tipoAtivoInativoEnumeration) {
		this.tipoAtivoInativoEnumeration = tipoAtivoInativoEnumeration;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public TipoDocumentoEnumeration getTipoDocumentoEnumeration() {
		return tipoDocumentoEnumeration;
	}

	public void setTipoDocumentoEnumeration(TipoDocumentoEnumeration tipoDocumentoEnumeration) {
		this.tipoDocumentoEnumeration = tipoDocumentoEnumeration;
	}
	
}