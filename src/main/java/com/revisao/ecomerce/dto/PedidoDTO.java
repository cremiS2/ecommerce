package com.revisao.ecomerce.dto;

import java.time.Instant;

import com.revisao.ecomerce.entity.StatusDoPedido;

public record PedidoDTO(Long id, Instant momento, StatusDoPedido status) {

}
