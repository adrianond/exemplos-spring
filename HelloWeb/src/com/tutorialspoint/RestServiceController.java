package com.tutorialspoint;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tutorial.model.Item;

import tutorial.service.cliente.ItemCliente;

import org.springframework.ui.ModelMap;

@Controller
public class RestServiceController {
	
	private ItemCliente cliente;
 
	@GetMapping("/hello")
   public String inserirDadosItem(ModelMap model) {
	 
	 Item item = retornaItem();
	 cliente = new ItemCliente();
	 cliente.inserirItem(item);
	 System.out.println("RestServiceController");
	 model.addAttribute("message", "Chamando API Rest!");
     return "hello";
   }

	private Item retornaItem() {
	 Item i = new Item();
	 LocalDate date = LocalDate.now();
	 DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	 String text = date.format(formatters);
	 LocalDate parsedDate = LocalDate.parse(text, formatters);
	
	 //i.setDataAquisicao(parsedDate);
	 i.setDescricao("Meu Noute");
	 i.setEtiqueta("NT0124");
	 return i;
	}
}
