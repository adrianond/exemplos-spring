package com.example.cadastro.service;

import com.example.cadastro.entidades.Categoria;
import com.example.cadastro.service.util.CategoriaUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Profile("test")
public class CategoriaTest {

    @Autowired
    private CategoriaService categoriaService;

    @Test
    public void deveSalvarCategoria() {
        Categoria categoria = categoriaService.persistir(CategoriaUtil.criarCategoria());
        Assert.assertEquals(CategoriaUtil.criarCategoria().getDescricao(), categoria.getDescricao());
    }

    @Test
    public void deveConsultarCategoria() {
        Categoria categoria = categoriaService.persistir(CategoriaUtil.criarCategoria());
        Categoria c = categoriaService.consultar(categoria.getId());
        Assert.assertEquals(CategoriaUtil.criarCategoria().getDescricao(), c.getDescricao());
    }
}
