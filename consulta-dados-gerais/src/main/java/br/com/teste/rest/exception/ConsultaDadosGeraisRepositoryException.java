package br.com.teste.rest.exception;

public class ConsultaDadosGeraisRepositoryException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensagem;
	private Throwable excecao;

	public ConsultaDadosGeraisRepositoryException(String msg, Throwable e) {
		this.mensagem = msg;
		this.excecao = e;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Throwable getExcecao() {
		return excecao;
	}

	public void setExcecao(Throwable excecao) {
		this.excecao = excecao;
	}

}
