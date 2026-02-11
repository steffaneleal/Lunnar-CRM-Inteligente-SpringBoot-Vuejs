package com.steffaneleal.lunnar.controllers;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;
import java.util.List;

@Entity
@Table(name = "tbl_produto")
@Data
public class Produto {
    @Id
    @GeneratedValue
    private UUID id_produto;

    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Integer qtd_estoque;

    @OneToMany
    List<Categoria> id_categoria;
}
