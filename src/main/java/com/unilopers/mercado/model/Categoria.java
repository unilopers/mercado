package com.unilopers.mercado.model;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_categoria", nullable = false)
    private String categoria;

}
