package br.com.experian.protesto.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.experian.protesto.web.Response.Response;
import br.com.experian.protesto.web.Response.ResponseError;
import br.com.experian.protesto.web.Response.ResponseSucess;
import experian.com.protesto.core.Exception.ConsultaDadosGeriasException;
import experian.com.protesto.core.service.ConsultaDadosGeraisService;
import experian.com.protesto.core.service.ConsultaDadosGeraisServiceImpl;

@RestController
public class ConsultaDadosGeraisController {
	
	//@Autowired
	ConsultaDadosGeraisService service;
	
	@GetMapping
	public String ConsultaDadosGeraisView(){
		return UrlMapping.Protestos.CONSULTA_DADOS_GERAIS;
	}
	
	@PostMapping
	public Response ListarDadosGeraisConsulta(String documento){
		Response resposta;
		
		try {
			service = new ConsultaDadosGeraisServiceImpl();
			String retorno = (String) service.consultar(documento);
			resposta = new ResponseSucess(retorno);
			
		} catch (ConsultaDadosGeriasException e) {
			resposta = new ResponseError("Erro na consulta dados gerais -> ConsultaDadosGeraisController.ListarDadosGeraisConsulta()" , e.getMessage());
		}
		return resposta;
	}
}
