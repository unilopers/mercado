package com.unilopers.mercado.model;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "resumo_pedido")
public class ResumoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_resumo")
    private Long idResumo;

    @OneToOne
    @JoinColumn(name = "fk_pedido", nullable = false, unique = true)
    private Pedido pedido;

    @Column(name = "quantidade_itens", nullable = false)
    private int quantidadeItens;

    @Column(name = "valor_total_bruto", nullable = false)
    private BigDecimal valorTotalBruto;

    @Column(name = "valor_impostos", nullable = false)
    private BigDecimal valorImpostos;

    @Column(name = "valor_total_final", nullable = false)
    private BigDecimal valorTotalFinal;

    public Long getIdResumo() {
        return idResumo;
    }

    public void setIdResumo(Long idResumo) {
        this.idResumo = idResumo;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public BigDecimal getValorTotalBruto() {
        return valorTotalBruto;
    }

    public void setValorTotalBruto(BigDecimal valorTotalBruto) {
        this.valorTotalBruto = valorTotalBruto;
    }

    public BigDecimal getValorImpostos() {
        return valorImpostos;
    }

    public void setValorImpostos(BigDecimal valorImpostos) {
        this.valorImpostos = valorImpostos;
    }

    public BigDecimal getValorTotalFinal() {
        return valorTotalFinal;
    }

    public void setValorTotalFinal(BigDecimal valorTotalFinal) {
        this.valorTotalFinal = valorTotalFinal;
    }
}
