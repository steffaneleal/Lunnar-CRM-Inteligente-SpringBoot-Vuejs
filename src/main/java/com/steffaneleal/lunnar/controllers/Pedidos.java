package com.steffaneleal.lunnar.controllers;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tbl_pedido")
public class Pedidos {
    @Id
    @GeneratedValue
    private UUID id_pedido;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "preco_total")
    private BigDecimal precoTotal;

    private String status;

    @Column(name = "criado_em")
    private LocalDateTime criadoEm = LocalDateTime.now();

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<ItemPedido> itens;
}
