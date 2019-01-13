package br.com.experian.protesto.web.Response;

public class ResponseError implements Response {

	private String msg;
	private String msgException;

	public ResponseError(String msg, String msgException) {
		this.msg = msg;
		this.msgException = msgException;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMsgException() {
		return msgException;
	}

	public void setMsgException(String msgException) {
		this.msgException = msgException;
	}

}
