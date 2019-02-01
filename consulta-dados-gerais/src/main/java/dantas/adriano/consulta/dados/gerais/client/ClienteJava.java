package dantas.adriano.consulta.dados.gerais.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import dantas.adriano.consulta.dados.gerais.model.Cliente;
import dantas.adriano.consulta.dados.gerais.model.Clientes;

public class ClienteJava {

	private static int HTTP_COD_SUCESSO = 200;

	public static void main(String[] args) throws JAXBException {

		try {

			URL url = new URL("http://localhost:8090/consulta-dados-gerais/consulta");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			if (con.getResponseCode() != HTTP_COD_SUCESSO) {
				throw new RuntimeException("HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));

			JAXBContext jaxbContext = JAXBContext.newInstance(Clientes.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Clientes cientes = (Clientes) jaxbUnmarshaller.unmarshal(br);
			
			for (Cliente cliente : cientes.getListClientes()) {
				System.out.println("Nome do cliente: " + cliente.getNome());
				System.out.println("SobreNome do cliente: " + cliente.getSobreNome());
				System.out.println("Idade do cliente: " + cliente.getIdade());
				System.out.println("Profissão do cliente: " + cliente.getProfissao());
				System.out.println("--------------------------------------------------");
			}

			con.disconnect();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
