package com.steffaneleal.lunnar.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "tbl_produto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_produto;

    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Integer qtd_estoque;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;
}
