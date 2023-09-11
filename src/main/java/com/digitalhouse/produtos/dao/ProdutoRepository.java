package com.digitalhouse.produtos.dao;

import com.digitalhouse.produtos.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    
    Optional<Produto> findByIdAndQuantidadeGreaterThan(Integer id, Integer quantidade);

    List<Produto> findAllByQuantidadeIsGreaterThan(Integer quantidade);

}
