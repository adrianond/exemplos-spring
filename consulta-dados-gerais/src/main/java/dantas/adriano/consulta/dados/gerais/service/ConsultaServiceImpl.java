package dantas.adriano.consulta.dados.gerais.service;

import com.sun.jersey.spi.inject.Inject;
import dantas.adriano.consulta.dados.gerais.exception.ConsultaDadosGeraisException;
import dantas.adriano.consulta.dados.gerais.exception.ConsultaDadosGeraisRepositoryException;
import dantas.adriano.consulta.dados.gerais.model.Clientes;
import dantas.adriano.consulta.dados.gerais.repository.ListaConsultaDadosGeraisRepositoryImpl;

public class ConsultaServiceImpl implements ConsultaService{
	
	@Inject
	private ListaConsultaDadosGeraisRepositoryImpl repositorio = null;
	private static int TAMANHO = 11;

	public Clientes consulta(String documento) throws ConsultaDadosGeraisException {
		
		Clientes clientes;
		try {
			return clientes = repositorio.consultarDadosCliente(validarDocumento(documento));
		} catch (ConsultaDadosGeraisRepositoryException e) {
			throw new ConsultaDadosGeraisException("", "");
		}
	}

	private String validarDocumento(String documento) throws ConsultaDadosGeraisException {
		
		if(documento.length() != TAMANHO){
			throw new ConsultaDadosGeraisException("Tamnho do documento inválido", "Tamanho deve ser igual a 11");
		}
		return documento;
	}
}
