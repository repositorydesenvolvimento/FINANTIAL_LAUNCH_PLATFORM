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
	
	public static List<GestaoCategoriaProdutoServicoDomain> findAll() {
		List<GestaoCategoriaProdutoServicoDomain> gestaoCategoriaProdutoServicoDomainResult = new ArrayList<GestaoCategoriaProdutoServicoDomain>();
			gestaoCategoriaProdutoServicoDomainResult.add(gestaoCategoriaProdutoTelefoniaInternetBandaLarga());
		return gestaoCategoriaProdutoServicoDomainResult;
	}
	
}
