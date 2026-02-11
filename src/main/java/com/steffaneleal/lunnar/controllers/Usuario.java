package com.steffaneleal.lunnar.controllers;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.List;

@Entity
@Table(name = "tbl_usuarios")
public class Usuario {
    @Id
    @GeneratedValue
    private UUID id_usuario;

    private String nome;
    private String email;
    private String senha;
    private String papel;
    private String provedor;

    @Column(name = "provedor_id")
    private Integer provedorId;

    @Column(name = "criado_em")
    private LocalDateTime criadoEm = LocalDateTime.now();

    @OneToMany(mappedBy = "usuario")
    private List<Pedidos> id_pedido;
}
