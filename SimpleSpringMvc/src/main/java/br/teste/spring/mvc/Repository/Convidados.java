package br.teste.spring.mvc.Repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import br.teste.spring.mvc.model.Convidado;



@Repository
public class Convidados {

	private static final List<Convidado> LISTA_CONVIDADOS = new ArrayList<Convidado>();
	static {
		LISTA_CONVIDADOS.add(new Convidado("Pedro", 2));
		LISTA_CONVIDADOS.add(new Convidado("Maria", 3));
		LISTA_CONVIDADOS.add(new Convidado("Ricardo", 1));
	}

	public List<Convidado> todos() {
		return Convidados.LISTA_CONVIDADOS;
	}

	public void adicionar(Convidado convidado) {
		Convidados.LISTA_CONVIDADOS.add(convidado);
	}

}
