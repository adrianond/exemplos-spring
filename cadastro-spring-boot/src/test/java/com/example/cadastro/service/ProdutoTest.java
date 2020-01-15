package com.example.cadastro.service;

import com.example.cadastro.entidades.Categoria;
import com.example.cadastro.service.util.ProdutoUtil;
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
public class ProdutoTest {

    @Autowired
    private CategoriaService categoriaService;

    @Test
    public void deveSalvarProdutos() {
        Categoria categoria = categoriaService.persistir(ProdutoUtil.criarProduto());
        Assert.assertEquals(ProdutoUtil.criarProduto().getProdutos().get(0).getNome(), categoria.getProdutos().get(0).getNome());
    }


    @Test
    public void deveConsultarProposta() {
        Categoria categoria  = categoriaService.persistir(ProdutoUtil.criarProduto());
        Categoria c = categoriaService.consultar(categoria.getId());
        Assert.assertEquals(ProdutoUtil.criarProduto().getProdutos().get(0).getNome(), c.getProdutos().get(0).getNome());
    }
}
