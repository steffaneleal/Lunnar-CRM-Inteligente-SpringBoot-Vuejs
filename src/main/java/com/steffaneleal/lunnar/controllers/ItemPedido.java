package com.steffaneleal.lunnar.controllers;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "tbl_item_pedido")
public class ItemPedido {
    @Id
    @GeneratedValue
    private UUID id_item_pedido;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedidos pedido;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;

    private Integer quantidade;

    @Column(name = "preco_unitario")
    private BigDecimal precoUnitario;
}
