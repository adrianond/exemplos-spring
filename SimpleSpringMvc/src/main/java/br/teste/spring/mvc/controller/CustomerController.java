package br.teste.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.teste.spring.mvc.Response.Response;
import br.teste.spring.mvc.Response.ResponseError;
import br.teste.spring.mvc.Response.ResponseSucess;
import br.teste.spring.mvc.Utils.ConstantsUtils;
import br.teste.spring.mvc.model.Customer;

@Controller
public class CustomerController {

	@GetMapping(value = ConstantsUtils.INICIO)
	public String hello() {
		return ConstantsUtils.INDEX;
	}

	@PostMapping(value = ConstantsUtils.CUSTOMER_POST)
	public Response postCustomer(@RequestBody Customer customer) {
		ResponseSucess sucess = null;
		Response resposta = null;

		try {
			Customer c = new Customer();
			c.setFirstname("adriano");
			String nome = c.getFirstname().equals(customer.getFirstname()) ? "dantas" : "";
			customer.setFirstname(nome);
			// Create Response Object Sucess
			resposta = new ResponseSucess("Done", customer);
		} catch (
		   Exception e) {
			// Create Response Object Error
			resposta = new ResponseError("Erro", e);
		}
		return resposta;
	}
}
