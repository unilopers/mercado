package com.unilopers.mercado.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pedido")  
public class Pedido {

 @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Long idPedido;

    @Column(name = "preco_total", nullable = false)
    private double precoTotal;

    @Column(name = "tipo_pagamento", nullable = false, length = 50)
    private String tipoPagamento;

    @Column(nullable = false)
    private boolean pago;

    @ManyToOne
    @JoinColumn(name = "fk_cliente", nullable = false)
    private Cliente cliente;
    

}


