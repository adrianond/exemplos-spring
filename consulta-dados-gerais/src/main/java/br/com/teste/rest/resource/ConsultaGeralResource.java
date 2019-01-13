package br.com.teste.rest.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.teste.rest.exception.ConsultaDadosGeraisRepositoryException;
import br.com.teste.rest.model.Cliente;
import br.com.teste.rest.model.Dados;
import br.com.teste.rest.repository.ListaConsultaDadosGeraisRepository;
import br.com.teste.rest.repository.ListaConsultaDadosGeraisRepositoryImpl;

@Path("/helloworld") // o @path define a URI do recurso que nesse caso será /helloworld
public class ConsultaGeralResource {
	
	@Autowired
	private ListaConsultaDadosGeraisRepository repositorio;

	@GET // utilizando apenas o verbo GET, ou seja, vou apenas ler o recurso
	@Produces(MediaType.APPLICATION_XML) // define qual tipo MIME é retornado para o cliente
	public Dados exibir(String documento) {
		
		Dados dados = null;
		documento = "00000000191";
		try {
			repositorio = new ListaConsultaDadosGeraisRepositoryImpl();
			dados = repositorio.consultarDadosCliente(documento);
		} catch (ConsultaDadosGeraisRepositoryException e) {
			System.out.println("Erro na consulta de dados do cliente: " + e.getMensagem());
		}
		return dados;
	}

}
