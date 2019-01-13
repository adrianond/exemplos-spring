package br.com.teste.rest.repository;

import java.util.List;

import br.com.teste.rest.exception.ConsultaDadosGeraisRepositoryException;
import br.com.teste.rest.model.Cliente;
import br.com.teste.rest.model.Dados;

public interface ListaConsultaDadosGeraisRepository {
	
	public Dados consultarDadosCliente(String documento) throws ConsultaDadosGeraisRepositoryException;

}
