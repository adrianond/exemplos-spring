package br.com.teste.rest.service;

import java.util.List;

import br.com.teste.rest.exception.ConsultaDadosGeraisException;
import br.com.teste.rest.model.Cliente;
import br.com.teste.rest.model.Dados;

public interface ConsultaService {
	
	public Dados consulta(String documento) throws ConsultaDadosGeraisException;

}
