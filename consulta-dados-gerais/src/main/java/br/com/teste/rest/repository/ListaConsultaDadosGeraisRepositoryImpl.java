package br.com.teste.rest.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import br.com.teste.rest.exception.ConsultaDadosGeraisRepositoryException;
import br.com.teste.rest.model.Cliente;
import br.com.teste.rest.model.Dados;

@Repository
public class ListaConsultaDadosGeraisRepositoryImpl implements ListaConsultaDadosGeraisRepository{
    
	String documentoPessoal = "00000000191";
	
	
		public Dados consultarDadosCliente(String documento) throws ConsultaDadosGeraisRepositoryException {
		Dados dados  = null;
		
		if(documentoPessoal.equals(documento)){
			dados = buildObjectCliente();
		}
		return dados;
	}


		private Dados buildObjectCliente() {
		List<Cliente> lista = new ArrayList<Cliente>();
		Dados dado = new Dados();
		Cliente cliente  = new Cliente("Pedro", "Santos", "18", "Av.Dos Palmares 43", "05348010", "1199999999", "Pompeia");
		Cliente cliente2  = new Cliente("Paulo", "Silva", "28", "Av.Dos Palmas 434", "05348010", "1199999999", "Barra Funda");
		Cliente cliente3 = new Cliente("Andre", "Siqueira", "38", "Av.Torres 43", "05348010", "1199999999", "Aclimação");
		Cliente cliente4 = new Cliente("Rick", "Marques", "48", "Av.Dos Pedro Torres 403", "05348010", "1199999999", "Pompeia");
		Cliente cliente5 = new Cliente("Alex", "Lima", "58", "Av.Dos Capitaes 4334", "05348010", "1199999999", "Pompeia");
		lista.add(cliente);
		lista.add(cliente2);
		lista.add(cliente3);
		lista.add(cliente4);
		lista.add(cliente5);
	
		dado.setListCliente(lista);
        return dado;
	}

}
