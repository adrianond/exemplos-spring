package resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import domain.Album;
import domain.Banda;
import domain.Musica;

@Path("/banda")
public class BandaService {

	@GET
	@Path("/get")
	@Produces("application/xml")
	public Banda getUserInXML() {

		Banda banda = new Banda();
		banda.setNome("Led Zeppelin");

		Album album = new Album();
		album.setAno(1969);
		album.setNome("Led Zeppelin");

		Musica musica1 = new Musica();
		Musica musica2 = new Musica();
		List<Musica> musicas = new ArrayList<Musica>();

		musica1.setNome("Good Times Bad Times");
		musica2.setNome("You Shook Me");
		musicas.add(musica1);
		musicas.add(musica2);

		album.setMusicas(musicas);
		banda.setAlbum(album);

		return banda;
	}

}
