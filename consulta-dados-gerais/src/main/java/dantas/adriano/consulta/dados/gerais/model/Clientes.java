package dantas.adriano.consulta.dados.gerais.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "clientes")
@XmlAccessorType(XmlAccessType.FIELD)
public class Clientes {
	
	@XmlElement(name = "cliente")
	private List<Cliente> listClientes = null;

	public List<Cliente> getListClientes() {
		return listClientes;
	}

	public void setListClientes(List<Cliente> listClientes) {
		this.listClientes = listClientes;
	}

}