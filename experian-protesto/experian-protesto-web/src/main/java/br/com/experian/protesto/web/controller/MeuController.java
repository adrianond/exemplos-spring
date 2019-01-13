package br.com.experian.protesto.web.controller;

import org.apache.commons.lang.exception.ExceptionUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import br.com.experian.protesto.core.service.HelloService;
//import br.com.experian.protesto.core.dto.AuthenticationHandler;


@Controller
public class MeuController {

	/*@Autowired
	private AuthenticationHandler authenticationHandler;*/
	
	/*@Autowired
	private HelloService helloService;*/

	@GetMapping(UrlMapping.Protestos.HELLO_WORD)
	public String teste() {

		return UrlMapping.Protestos.HELLO_WORD;
	}

	@PostMapping(UrlMapping.Protestos.HELLO_WORD)
	public @ResponseBody ResponseEntity<?> getNome(final Model model) {

		String resultado = "teste";
		try {
			//resultado = helloService.teste("Meu Nome");
		} catch (Exception e) {

			Throwable t = ExceptionUtils.getRootCause(e);
			if (t == null) {
				t = e;
			}
			final String trace = ExceptionUtils.getFullStackTrace(t);
			model.addAttribute("trace", trace);
			return ResponseEntity.badRequest().body(e.getMessage());
		}

		return ResponseEntity.ok(resultado);
	}

}
