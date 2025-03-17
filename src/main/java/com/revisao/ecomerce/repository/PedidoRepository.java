package com.revisao.ecomerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revisao.ecomerce.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
