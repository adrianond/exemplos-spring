package com.example.cadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.cadastro.model.Convidado;
import com.example.cadastro.repository.Convidados;

@Controller
public class ConvidadosController {

	@Autowired
	private Convidados convidados;

	@RequestMapping(value = "/convidados", method = RequestMethod.GET) 
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("ListarConvidados");
		//envia objeto convidado pata view
		mv.addObject(new Convidado());
		mv.addObject("convidados", convidados.todos());
		return mv;
		
	}

	@RequestMapping(value = "/adicionaConvidado", method = RequestMethod.POST)
	public String salvar(Convidado convidado) {
		this.convidados.adicionar(convidado);
		return "redirect:/convidados";
	}
}
