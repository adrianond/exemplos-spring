package experian.com.protesto.core.Exception;

public class ConsultaDadosGeriasException  extends Exception{

	private Throwable e;
	private String msgErro;

	public ConsultaDadosGeriasException(String msg, Throwable e) {
		this.msgErro = msg;
		this.e = e;
	}

	public Throwable getE() {
		return e;
	}

	public void setE(Throwable e) {
		this.e = e;
	}

	public String getMsgErro() {
		return msgErro;
	}

	public void setMsgErro(String msgErro) {
		this.msgErro = msgErro;
	}

}
