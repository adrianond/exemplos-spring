package experian.com.protesto.core.service;

import experian.com.protesto.core.Exception.ConsultaDadosGeriasException;

public interface ConsultaDadosGeraisService {
	
	public Object consultar(String documento) throws ConsultaDadosGeriasException;

}
