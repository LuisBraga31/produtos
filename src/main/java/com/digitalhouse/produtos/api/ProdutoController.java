package com.digitalhouse.produtos.api;

import com.digitalhouse.produtos.domain.entity.Produto;
import com.digitalhouse.produtos.domain.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    List<Produto> buscarTodosProdutos() {
        return produtoService.buscarTodosProdutos();
    }

    @GetMapping("{id}")
    Produto buscarPorId(@PathVariable Integer id) {
        return produtoService.buscarPorId(id).orElseThrow();
    }

    @PostMapping
    ResponseEntity<List<Produto>> criarProduto(@RequestBody List<Produto> produtos) {
        return ResponseEntity.ok(produtoService.criarProduto(produtos));
    }

    @DeleteMapping("{id}")
    void excluirProduto(@PathVariable Integer id) {
        produtoService.excluirProduto(id);
    }


}
