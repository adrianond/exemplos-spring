package br.teste.spring.mvc.Response;

public class ResponseError implements Response{

	private String status;
	private Throwable erro;

	public ResponseError() {

	}

	public ResponseError(String status, Throwable erro) {
		this.status = status;
		this.erro = erro;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getErro() {
		return erro;
	}

	public void setErro(Throwable erro) {
		this.erro = erro;
	}

}
