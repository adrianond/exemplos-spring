package experian.com.protesto.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.rest.model.Dados;
import br.com.teste.rest.resource.ConsultaGeralResource;
import br.com.teste.rest.service.ConsultaService;
import experian.com.protesto.core.Exception.ConsultaDadosGeriasException;

@Service
public class ConsultaDadosGeraisServiceImpl implements ConsultaDadosGeraisService {
	
	@Autowired
	ConsultaService service;

	@Override
	//public Object consultar(String documento) throws ConsultaDadosGeriasException {
		public Dados consultar(String documento) throws ConsultaDadosGeriasException {
		
		try{
			Dados teste = service.consulta(documento);
		
		return teste;
		}catch(Exception e){
			 throw new ConsultaDadosGeriasException("Erro na Consulta", e);
		}
	}

}
