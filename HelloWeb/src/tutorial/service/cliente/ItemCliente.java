package tutorial.service.cliente;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.tutorial.model.Item;



public class ItemCliente {
	
	private RestTemplate restTempalte = new RestTemplate();
	
	public void  inserirItem(Item item){
		restTempalte.postForEntity("http://localhost:8080/itens", item, Item.class);
	}

}
