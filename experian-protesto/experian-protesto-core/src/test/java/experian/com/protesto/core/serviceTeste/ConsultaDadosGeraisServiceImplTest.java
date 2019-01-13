package experian.com.protesto.core.serviceTeste;

import org.junit.Test;
import org.springframework.util.Assert;

import br.com.teste.rest.model.Dados;
import experian.com.protesto.core.Exception.ConsultaDadosGeriasException;
import experian.com.protesto.core.service.ConsultaDadosGeraisServiceImpl;

public class ConsultaDadosGeraisServiceImplTest {

	@Test
	public void consultaTest() throws ConsultaDadosGeriasException{
		
		ConsultaDadosGeraisServiceImpl consulta = new ConsultaDadosGeraisServiceImpl();
		Dados retorno = consulta.consultar("00000000191");
		Assert.notNull(retorno);
		
	}
}
