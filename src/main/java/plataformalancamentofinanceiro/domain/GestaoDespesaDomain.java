package plataformalancamentofinanceiro.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.oracle.webservices.internal.api.EnvelopeStyle;

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
 */
@Entity
@Table(name = "TB_DESPESA")
public class GestaoDespesaDomain extends BaseDomain {

	private static final long serialVersionUID = 1L;
	
	private Long codigo;
	
	private GestaoPessoaDomain favorecido;
	
	private BigDecimal valorPagamento;
	
	private Date dataVencimento;
	
	public GestaoDespesaDomain() {  }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public GestaoPessoaDomain getFavorecido() {
		return favorecido;
	}

	public void setFavorecido(GestaoPessoaDomain favorecido) {
		this.favorecido = favorecido;
	}

	public BigDecimal getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(BigDecimal valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
}