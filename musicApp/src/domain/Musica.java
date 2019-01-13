package domain;

import javax.xml.bind.annotation.XmlElement;

public class Musica {

	private String nome;

	@XmlElement
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
