package com.example.cadastro.controller;

import com.example.cadastro.constantes.URLMapping;
import com.example.cadastro.dto.VeiculoDTO;
import com.example.cadastro.entidades.Veiculo;
import com.example.cadastro.response.Response;
import com.example.cadastro.service.VeiculoService;
import com.example.cadastro.validate.CadastroValidate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(value = URLMapping.API_VEICULO)
public class VeiculoController {

    private static final Logger log = LoggerFactory.getLogger(VeiculoController.class);

    @Autowired
    private VeiculoService veiculoService;
    @Autowired
    private CadastroValidate validate;

    @PostMapping(value = URLMapping.CADASTRAR)
    public ResponseEntity<Response> cadastrarVeiculo(@Valid @RequestBody VeiculoDTO veiculoDTO) {
        Response response = new Response();

        if (!validate.validarDados(veiculoDTO).isEmpty()) {
            validate.validarDados(veiculoDTO).forEach(error -> {
                response.setErros(new ArrayList<>());
                response.getErros().add(error);
            });
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
        response.setData(converterVeiculo(veiculoService.persistir(converterVeiculoDTO(veiculoDTO))));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    private Veiculo converterVeiculoDTO(VeiculoDTO veiculoDTO) {
        Veiculo veiculo = new Veiculo();
        veiculo.setAnoModelo(veiculoDTO.getAnoModelo());
        veiculo.setAnoFabricacao(veiculoDTO.getAnoFabricacao());
        veiculo.setCotacao(veiculoDTO.getCotacao());
        //veiculo.setProprietario(veiculoDTO.getProprietario());
        if (Optional.ofNullable(veiculoDTO.getAcessorios()).isPresent())
           veiculo.setAcessorios(veiculoDTO.getAcessorios());
        return veiculo;
    }

    private VeiculoDTO converterVeiculo(Veiculo veiculo) {
        VeiculoDTO veiculoDTO = new VeiculoDTO();
        veiculoDTO.setAnoModelo(veiculo.getAnoModelo());
        veiculoDTO.setAnoFabricacao(veiculo.getAnoFabricacao());
        veiculoDTO.setCotacao(veiculo.getCotacao());
       // veiculoDTO.setProprietario(veiculo.getProprietario());
        if (Optional.ofNullable(veiculo.getAcessorios()).isPresent())
            veiculoDTO.setAcessorios(veiculo.getAcessorios());
        return veiculoDTO;
    }
}
