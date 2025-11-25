package com.unilopers.mercado.controller;

import java.util.List;


import org.springframework.web.bind.annotation.*;

import com.unilopers.mercado.model.Pedido;
import com.unilopers.mercado.repository.PedidoRepository;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    private final PedidoRepository pedidoRepository;

     public PedidoController(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @PostMapping
    public Pedido create(@RequestBody Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @GetMapping
    public List<Pedido> listAll() {
        return pedidoRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Pedido findById(@PathVariable Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

       @PutMapping("/{id}")
    public Pedido update(@PathVariable Long id, @RequestBody Pedido dados) {
        return pedidoRepository.findById(id).map(u -> {
            u.setPrecoTotal(dados.getPrecoTotal());
            u.setTipoPagamento(dados.getTipoPagamento());
            u.setPago(dados.isPago());
            u.setCliente(dados.getCliente());
            return pedidoRepository.save(u);
        }).orElse(null);
    }

   
     @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        pedidoRepository.deleteById(id);
    }

}
