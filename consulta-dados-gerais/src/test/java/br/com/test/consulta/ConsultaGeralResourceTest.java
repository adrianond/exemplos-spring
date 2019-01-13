package br.com.test.consulta;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.teste.rest.exception.ConsultaDadosGeraisException;
import br.com.teste.rest.model.Cliente;
import br.com.teste.rest.model.Dados;
import br.com.teste.rest.resource.ConsultaGeralResource;
import br.com.teste.rest.service.ConsultaServiceImpl;

public class ConsultaGeralResourceTest {
	
	@Test
	public void TestConsutla() throws ConsultaDadosGeraisException{
		Dados dados = null;
		ConsultaServiceImpl recurso = new ConsultaServiceImpl();
		dados = recurso.consulta("00000000191");
		Assert.assertNotNull(dados);
	}

}
