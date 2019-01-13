package br.com.teste.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.teste.rest.exception.ConsultaDadosGeraisException;
import br.com.teste.rest.model.Cliente;
import br.com.teste.rest.model.Dados;
import br.com.teste.rest.resource.ConsultaGeralResource;

@Service
public class ConsultaServiceImpl implements ConsultaService{
	private static int TAMANHO = 11;

	public Dados consulta(String documento) throws ConsultaDadosGeraisException {
		
		Dados dados;
		ConsultaGeralResource recurso = new ConsultaGeralResource();
		documento = ValidaDocumento(documento);
		dados = recurso.exibir(documento);
		
		return dados;
	}

	private String ValidaDocumento(String documento) throws ConsultaDadosGeraisException {
		
		if(documento.length() != TAMANHO){
			throw new ConsultaDadosGeraisException("Tamnho do documento inválido", "Tamanho deve ser igual a 11");
		}
		return documento;
	}
}
