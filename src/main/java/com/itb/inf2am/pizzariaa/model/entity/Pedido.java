package com.itb.inf2am.pizzariaa.model.entity;

import java.time.LocalDateTime;

public class Pedido {

    private Long id;
    private double valorPedido;
    private LocalDateTime dataHoraPedido;
    private LocalDateTime dataHoraEntrega;
    private String status;
    private boolean codStatus;

}
