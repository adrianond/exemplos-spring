package dantas.adriano.simples.exemplo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicRestControler {

	@GetMapping("/hello")
	public String inserirDadosItem(ModelMap model) {

		model.addAttribute("message", "Chamando API Rest!");
		return "index";
	}

}
