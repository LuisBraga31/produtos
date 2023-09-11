package com.digitalhouse.produtos.domain.service.impl;

import com.digitalhouse.produtos.ProdutosApplication;
import com.digitalhouse.produtos.dao.ProdutoRepository;
import com.digitalhouse.produtos.domain.entity.Produto;
import com.digitalhouse.produtos.domain.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }


    @Override
    public List<Produto> criarProduto(List<Produto> produtos) {
        return produtoRepository.saveAll(produtos);
    }

    @Override
    public Optional<Produto> buscarPorId(Integer id) {
        return produtoRepository.findByIdAndQuantidadeGreaterThan(id, 0);
    }

    @Override
    public List<Produto> buscarTodosProdutos() {
        return produtoRepository.findAllByQuantidadeIsGreaterThan(0);
    }

    @Override
    public void excluirProduto(Integer id) {
        produtoRepository.deleteById(id);
    }
}
