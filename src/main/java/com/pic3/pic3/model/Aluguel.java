package com.pic3.pic3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tb_aluguel")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aluguel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alu_codigo")
    private Integer id;

    @Column(name = "cli_codigo", length = 200)
    private String clienteCodigo;

    @Column(name = "alu_data_inicial", nullable = false)
    private LocalDate dataInicial;

    @Column(name = "alu_data_final", nullable = false)
    private LocalDate dataFinal;

    @Column(name = "pro_codigo")
    private Integer produtoCodigo;

    @Column(name = "alu_valor", precision = 6, scale = 2)
    private BigDecimal valor;

    @Column(name = "alu_valor_sinal", precision = 6, scale = 2)
    private BigDecimal valorSinal;

    @Column(name = "alu_resta_pagar", precision = 6, scale = 2)
    private BigDecimal restaPagar;

    @Column(name = "alu_pago_total", length = 20)
    private String pagoTotal;

    @Column(name = "alu_tipo_pagamento", length = 20)
    private String tipoPagamento;

    @Column(name = "ven_nome", length = 80)
    private String vendedorNome;

    @Column(name = "alu_observacao", length = 200, nullable = false)
    private String observacao;

    @Column(name = "alu_status", length = 80)
    private String status;

    @Column(name = "alu_qtde")
    private Integer quantidade;
}
