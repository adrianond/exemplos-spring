package br.com.experian.protesto.web.Response;

public class ResponseSucess implements Response {

	private Object object;
	
	public ResponseSucess(Object object){
		this.object = object;
		
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

}
