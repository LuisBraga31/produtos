package com.digitalhouse.produtos.domain.service;

import com.digitalhouse.produtos.domain.entity.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {

    List<Produto> criarProduto (List<Produto> produtos);
    Optional<Produto> buscarPorId(Integer id);
    List<Produto> buscarTodosProdutos();
    void excluirProduto(Integer id);

}
