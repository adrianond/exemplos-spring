package dantas.adriano.consulta.dados.gerais.repository;

import java.util.ArrayList;
import java.util.List;
import dantas.adriano.consulta.dados.gerais.exception.ConsultaDadosGeraisRepositoryException;
import dantas.adriano.consulta.dados.gerais.model.Cliente;
import dantas.adriano.consulta.dados.gerais.model.Clientes;

public class ListaConsultaDadosGeraisRepositoryImpl implements ListaConsultaDadosGeraisRepository {

	String documentoPessoal = "00000000191";

	public Clientes consultarDadosCliente(String documento) throws ConsultaDadosGeraisRepositoryException {
		Clientes clientes = null;

		if (documentoPessoal.equals(documento)) {
			clientes = buildObjectCliente();
		}
		return clientes;
	}

	private Clientes buildObjectCliente() {

		Clientes clientes = new Clientes();
		List<Cliente> listCliente = new ArrayList<Cliente>();

		Cliente cliente = new Cliente("Adriano", "Dantas", "39", "Analista de Sistemas");
		Cliente cliente2 = new Cliente("Pedro", "Santos", "38", "Segurança");
		Cliente cliente3 = new Cliente("Paulo", "Silva", "25", "Vendedor");
		Cliente cliente4 = new Cliente("Carlos", "Santos", "28", "Porteiro");
		Cliente cliente5 = new Cliente("Luis", "Pereira Silva", "68", "Aposentado");

		listCliente.add(cliente);
		listCliente.add(cliente2);
		listCliente.add(cliente3);
		listCliente.add(cliente4);
		listCliente.add(cliente5);
		clientes.setListClientes(listCliente);

		return clientes;
	}

}
