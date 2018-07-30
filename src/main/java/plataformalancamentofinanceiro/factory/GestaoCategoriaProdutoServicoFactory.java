package plataformalancamentofinanceiro.factory;

import java.util.ArrayList;
import java.util.List;

import plataformalancamentofinanceiro.domain.GestaoCategoriaProdutoServicoDomain;

public class GestaoCategoriaProdutoServicoFactory extends BaseFactory {

	private static final long serialVersionUID = 1L;
	
	public GestaoCategoriaProdutoServicoFactory() { }
	
	public static GestaoCategoriaProdutoServicoDomain gestaoCategoriaProdutoTelefoniaInternetBandaLarga() {
		GestaoCategoriaProdutoServicoDomain gestaoCategoriaProdutoServicoDomain = new GestaoCategoriaProdutoServicoDomain();
			gestaoCategoriaProdutoServicoDomain.setNome("Serviço de Telefônia e Internet Banda Larga 15MB");
		return gestaoCategoriaProdutoServicoDomain;
	}
	
	public static GestaoCategoriaProdutoServicoDomain gestaoCategoriaProdutoTelefoniaInternetMovel() {
		GestaoCategoriaProdutoServicoDomain gestaoCategoriaProdutoServicoDomain = new GestaoCategoriaProdutoServicoDomain();
			gestaoCategoriaProdutoServicoDomain.setNome("Serviço de Telefônia Móvel e Internet Móvel");
		return gestaoCategoriaProdutoServicoDomain;
	}
	
	public static GestaoCategoriaProdutoServicoDomain gestaoCategoriaProdutoDoacaoInstituicaoReligiosaJudaica() {
		GestaoCategoriaProdutoServicoDomain gestaoCategoriaProdutoServicoDomain = new GestaoCategoriaProdutoServicoDomain();
			gestaoCategoriaProdutoServicoDomain.setNome("Doação para Instituicao Religiosa Judaica");
		return gestaoCategoriaProdutoServicoDomain;
	}
	
	public static GestaoCategoriaProdutoServicoDomain gestaoCategoriaProdutoServicoDevolucaoEmprestimos() {
		GestaoCategoriaProdutoServicoDomain gestaoCategoriaProdutoServicoDomain = new GestaoCategoriaProdutoServicoDomain();
			gestaoCategoriaProdutoServicoDomain.setNome("Devolução de Empréstimos");
		return gestaoCategoriaProdutoServicoDomain;
	}
	
	public static List<GestaoCategoriaProdutoServicoDomain> findAll() {
		List<GestaoCategoriaProdutoServicoDomain> gestaoCategoriaProdutoServicoDomainResult = new ArrayList<GestaoCategoriaProdutoServicoDomain>();
			gestaoCategoriaProdutoServicoDomainResult.add(gestaoCategoriaProdutoTelefoniaInternetBandaLarga());
			gestaoCategoriaProdutoServicoDomainResult.add(gestaoCategoriaProdutoTelefoniaInternetMovel());
			gestaoCategoriaProdutoServicoDomainResult.add(gestaoCategoriaProdutoDoacaoInstituicaoReligiosaJudaica());
			gestaoCategoriaProdutoServicoDomainResult.add(gestaoCategoriaProdutoServicoDevolucaoEmprestimos());
		return gestaoCategoriaProdutoServicoDomainResult;
	}
	
}
