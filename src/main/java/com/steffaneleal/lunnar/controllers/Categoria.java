package com.steffaneleal.lunnar.controllers;


import jakarta.persistence.*;

import java.util.UUID;
import java.util.List;

@Entity
@Table(name = "tbl_categoria")
public class Categoria {
    @Id
    @GeneratedValue
    private UUID id_categoria;

    private String nome;
    private String descricao;

    @OneToMany(mappedBy = "categoria")
    private List<Produto> produtos;
}
