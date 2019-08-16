package com.example.cadastro.validate;

import com.example.cadastro.dto.CadastroModelDTO;
import com.example.cadastro.dto.VeiculoDTO;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@Component
public class CadastroValidate {

    public Set<ConstraintViolation<CadastroModelDTO>> validarDados(CadastroModelDTO cadastroModelDTO) {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<CadastroModelDTO>> constraintViolations = validator.validate(cadastroModelDTO);
        return constraintViolations;
    }
}



