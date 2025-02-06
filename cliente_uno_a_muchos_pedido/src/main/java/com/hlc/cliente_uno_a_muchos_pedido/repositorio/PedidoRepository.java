package com.hlc.cliente_uno_a_muchos_pedido.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hlc.cliente_uno_a_muchos_pedido.entidad.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {}