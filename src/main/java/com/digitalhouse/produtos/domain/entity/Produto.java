package com.digitalhouse.produtos.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Produto {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(length = 80)
    private String nome;
    private Integer quantidade;
    @Column(length = 80)
    private String descricao;
    
}
