package plataformalancamentofinanceiro.factory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import plataformalancamentofinanceiro.domain.GestaoPessoaDomain;
import plataformalancamentofinanceiro.enumeration.TipoCategoriaPessoaEnumeration;
import plataformalancamentofinanceiro.enumeration.TipoSituacaoEnumeration;

public class GestaoPessoaFactory extends BaseFactory {

	private static final long serialVersionUID = 1L;
	
	public GestaoPessoaFactory() { }
	
	public static GestaoPessoaDomain instituicaoFinanceiraBancoSantanderBrasil() {
		GestaoPessoaDomain gestaoPessoaDomain = new GestaoPessoaDomain();
			gestaoPessoaDomain.setDataCadastroSistema(new Date());
			gestaoPessoaDomain.setNome("Banco Santander Brasil SA");
			gestaoPessoaDomain.setTipoCategoriaPessoaEnumeration(TipoCategoriaPessoaEnumeration.INTITUICAO_FINANCEIRA);
			gestaoPessoaDomain.setTipoSituacaoEnumeration(TipoSituacaoEnumeration.ATIVO);
		return gestaoPessoaDomain;
	}
	
	public static GestaoPessoaDomain instituicaoFinanceiraBancoDoBrasilBrasil() {
		GestaoPessoaDomain gestaoPessoaDomain = new GestaoPessoaDomain();
			gestaoPessoaDomain.setDataCadastroSistema(new Date());
			gestaoPessoaDomain.setNome("Banco do Brasil SA");
			gestaoPessoaDomain.setTipoCategoriaPessoaEnumeration(TipoCategoriaPessoaEnumeration.INTITUICAO_FINANCEIRA);
			gestaoPessoaDomain.setTipoSituacaoEnumeration(TipoSituacaoEnumeration.ATIVO);
		return gestaoPessoaDomain;
	}
	
	public static GestaoPessoaDomain instituicaoFinanceiraBancoNubankBrasil() {
		GestaoPessoaDomain gestaoPessoaDomain = new GestaoPessoaDomain();
			gestaoPessoaDomain.setDataCadastroSistema(new Date());
			gestaoPessoaDomain.setNome("Banco Nubank do Brasil SA");
			gestaoPessoaDomain.setTipoCategoriaPessoaEnumeration(TipoCategoriaPessoaEnumeration.INTITUICAO_FINANCEIRA);
			gestaoPessoaDomain.setTipoSituacaoEnumeration(TipoSituacaoEnumeration.ATIVO);
		return gestaoPessoaDomain;
	}
	
	public static GestaoPessoaDomain instituicaoFinanceiraBancoCetelemBrasil() {
		GestaoPessoaDomain gestaoPessoaDomain = new GestaoPessoaDomain();
			gestaoPessoaDomain.setDataCadastroSistema(new Date());
			gestaoPessoaDomain.setNome("Banco Cetelem Brasil SA");
			gestaoPessoaDomain.setTipoCategoriaPessoaEnumeration(TipoCategoriaPessoaEnumeration.INTITUICAO_FINANCEIRA);
			gestaoPessoaDomain.setTipoSituacaoEnumeration(TipoSituacaoEnumeration.ATIVO);
		return gestaoPessoaDomain;
	}
	
	public static GestaoPessoaDomain instituicaoTelefoniaInternetVivoTelecomunicacoes() {
		GestaoPessoaDomain gestaoPessoaDomain = new GestaoPessoaDomain();
			gestaoPessoaDomain.setDataCadastroSistema(new Date());
			gestaoPessoaDomain.setNome("Telefônica do Brasil Vivo SA");
			gestaoPessoaDomain.setTipoCategoriaPessoaEnumeration(TipoCategoriaPessoaEnumeration.PESSOA_JURIDICA);
			gestaoPessoaDomain.setTipoSituacaoEnumeration(TipoSituacaoEnumeration.ATIVO);
		return gestaoPessoaDomain;
	}
	
	public static List<GestaoPessoaDomain> findAll() {
		List<GestaoPessoaDomain> gestaoPessoaDomainList = new ArrayList<GestaoPessoaDomain>();
			gestaoPessoaDomainList.add(instituicaoFinanceiraBancoCetelemBrasil());
			gestaoPessoaDomainList.add(instituicaoFinanceiraBancoDoBrasilBrasil());
			gestaoPessoaDomainList.add(instituicaoFinanceiraBancoNubankBrasil());
			gestaoPessoaDomainList.add(instituicaoFinanceiraBancoSantanderBrasil());
			gestaoPessoaDomainList.add(instituicaoTelefoniaInternetVivoTelecomunicacoes());
		return gestaoPessoaDomainList;
	}

}
