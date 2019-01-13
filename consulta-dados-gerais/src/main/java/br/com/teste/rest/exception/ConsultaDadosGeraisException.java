package br.com.teste.rest.exception;

public class ConsultaDadosGeraisException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensagem;
	private String texto;

	public ConsultaDadosGeraisException(String mensagem, String texto) {
		this.mensagem = mensagem;
		this.texto = texto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
