package com.unilopers.mercado.model;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_categoria", nullable = false)
    private String categoria;

    public  Categoria() {
    }
    public Categoria(String categoria) {
        this.categoria = categoria;
    }
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
