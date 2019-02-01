package dantas.adriano.consulta.dados.gerais.teste;

import org.junit.Assert;
import org.junit.Test;
import dantas.adriano.consulta.dados.gerais.exception.ConsultaDadosGeraisException;
import dantas.adriano.consulta.dados.gerais.model.Clientes;
import dantas.adriano.consulta.dados.gerais.service.ConsultaServiceImpl;

public class ConsultaGeralResourceTest {
	
	@Test
	public void TestConsutla() throws ConsultaDadosGeraisException{
		Clientes dados = null;
		ConsultaServiceImpl recurso = new ConsultaServiceImpl();
		dados = recurso.consulta("00000000191");
		Assert.assertNotNull(dados);
	}

}
