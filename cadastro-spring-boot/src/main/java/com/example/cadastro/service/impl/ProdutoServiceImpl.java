package com.example.cadastro.service.impl;

import com.example.cadastro.entidades.Categoria;
import com.example.cadastro.entidades.Produto;
import com.example.cadastro.repository.CategoriaRepository;
import com.example.cadastro.repository.ProdutoRepository;
import com.example.cadastro.service.ProdutoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private static final Logger log = LoggerFactory.getLogger(ProdutoServiceImpl.class);

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    CategoriaRepository categoriaRepository;


    @Override
    public List<Produto> persistir(List<Produto> produtos) {
        log.info("Salvando Produtos {}: ", produtos);
        Produto p = null;
        Categoria categoria = null;
        List<Produto> produtoList = new ArrayList<>();
        for (Produto produto : produtos) {
            categoria = categoriaRepository.save(produto.getCategoria());
            p = produtoRepository.save(produto);
            p.setCategoria(categoria);
            produtoList.add(p);
        }
        return produtoList;
    }

    @Override
    public List<Produto> consultar() {
        log.info("Consultando  Produtos {}:");
        return produtoRepository.findAll();
    }
}
