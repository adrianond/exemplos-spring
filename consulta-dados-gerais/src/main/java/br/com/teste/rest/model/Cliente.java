package br.com.teste.rest.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public class Cliente {

	private String nome;
	private String sobreNome;
	private String idade;
	private String endereco;
	private String cep;
	private String telefone;
	private String bairro;

	public Cliente(String nome, String sobreNome, String idade, String endereco, String cep, String telefone,
			String bairro) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
		this.endereco = endereco;
		this.cep = cep;
		this.telefone = telefone;
		this.bairro = bairro;
	}
	
	@XmlElement
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@XmlElement
	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	@XmlElement
	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	@XmlElement
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@XmlElement
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@XmlElement
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@XmlElement
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
