package com.unilopers.mercado.repository;

import com.unilopers.mercado.model.Item_pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Item_pedidoRepository extends JpaRepository<Item_pedido, Long> {
}