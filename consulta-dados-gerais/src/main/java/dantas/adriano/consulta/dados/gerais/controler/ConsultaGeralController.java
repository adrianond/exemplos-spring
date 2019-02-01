package dantas.adriano.consulta.dados.gerais.controler;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.sun.jersey.spi.inject.Inject;
import dantas.adriano.consulta.dados.gerais.exception.ConsultaDadosGeraisException;
import dantas.adriano.consulta.dados.gerais.model.Clientes;
import dantas.adriano.consulta.dados.gerais.service.ConsultaServiceImpl;

@Path("/consulta")
public class ConsultaGeralController {
	
	@Inject
	private ConsultaServiceImpl consultaService;

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Clientes exibir(String documento)  {

		Clientes clientes = null;
		documento = "00000000191";
		try {
			clientes = consultaService.consulta(documento);
		} catch (ConsultaDadosGeraisException e) {
			System.out.println("Erro na consulta de dados do cliente: " + e.getMensagem());
		}
		return clientes;
	}

}
