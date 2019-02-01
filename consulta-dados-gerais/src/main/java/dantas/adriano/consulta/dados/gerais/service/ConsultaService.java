package dantas.adriano.consulta.dados.gerais.service;

import dantas.adriano.consulta.dados.gerais.exception.ConsultaDadosGeraisException;
import dantas.adriano.consulta.dados.gerais.model.Clientes;

public interface ConsultaService {
	
	public Clientes consulta(String documento) throws ConsultaDadosGeraisException;

}
