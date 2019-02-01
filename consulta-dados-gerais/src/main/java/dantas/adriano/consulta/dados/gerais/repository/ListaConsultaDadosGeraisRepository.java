package dantas.adriano.consulta.dados.gerais.repository;

import dantas.adriano.consulta.dados.gerais.exception.ConsultaDadosGeraisRepositoryException;
import dantas.adriano.consulta.dados.gerais.model.Clientes;

public interface ListaConsultaDadosGeraisRepository {
	
	public Clientes consultarDadosCliente(String documento) throws ConsultaDadosGeraisRepositoryException;

}
