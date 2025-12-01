package com.unilopers.mercado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.unilopers.mercado.model.ResumoPedido;
import com.unilopers.mercado.service.ResumoPedidoService;

@RestController
@RequestMapping("/resumo")
public class ResumoPedidoController {

    @Autowired
    private ResumoPedidoService resumoService;

    @PostMapping("/gerar/{idPedido}")
    public ResumoPedido gerarResumo(@PathVariable Long idPedido) {
        return resumoService.gerarResumo(idPedido);
    }
}

