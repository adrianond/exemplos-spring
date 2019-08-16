package com.example.cadastro.service;

import com.example.cadastro.entidades.Produto;
import com.example.cadastro.entidades.Proposta;
import com.example.cadastro.service.util.ProdutoUtil;
import com.example.cadastro.service.util.PropostaUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Profile("test")
public class ProdutoServiceImplTest {

    @Autowired
    private ProdutoService produtoService;

    @Test
    public void deveSalvarProdutos() {
        List<Produto> produtos = produtoService.persistir(ProdutoUtil.criarProduto());
        Assert.assertEquals(ProdutoUtil.criarProduto().get(0).getNome(), produtos.get(0).getNome());
    }


    @Test
    public void deveConsultarProposta() {
        List<Produto> produtos = produtoService.persistir(ProdutoUtil.criarProduto());
        List<Produto> p = produtoService.consultar();
        Assert.assertEquals(ProdutoUtil.criarProduto().get(0).getNome(), p.get(0).getNome());
    }
}
