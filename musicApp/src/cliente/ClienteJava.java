package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import domain.Banda;
import domain.Musica;

public class ClienteJava {

	private static int HTTP_COD_SUCESSO = 200;

	public static void main(String[] args) throws JAXBException {

		try {

			URL url = new URL("http://localhost:8090/musicApp/banda/get");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			if (con.getResponseCode() != HTTP_COD_SUCESSO) {
				throw new RuntimeException("HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));

			JAXBContext jaxbContext = JAXBContext.newInstance(Banda.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Banda banda = (Banda) jaxbUnmarshaller.unmarshal(br);

			System.out.println("------  Dados da Banda  -------- \n");
			System.out.println("Nome da Banda : " + banda.getNome());
			System.out.println("Nome do Álbum : " + banda.getAlbum().getNome());
			System.out.println("Ano de Lançamento: " + banda.getAlbum().getAno());

			int count = 1;

			for (Musica musica : banda.getAlbum().getMusicas()) {
				System.out.println("Música " + count + ": " + musica.getNome());
				count++;
			}

			con.disconnect();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
