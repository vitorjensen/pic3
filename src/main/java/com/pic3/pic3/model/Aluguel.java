package com.pic3.pic3.model;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tb_aluguel")
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

    // --- GETTERS e SETTERS ---

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClienteCodigo() {
        return clienteCodigo;
    }

    public void setClienteCodigo(String clienteCodigo) {
        this.clienteCodigo = clienteCodigo;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Integer getProdutoCodigo() {
        return produtoCodigo;
    }

    public void setProdutoCodigo(Integer produtoCodigo) {
        this.produtoCodigo = produtoCodigo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValorSinal() {
        return valorSinal;
    }

    public void setValorSinal(BigDecimal valorSinal) {
        this.valorSinal = valorSinal;
    }

    public BigDecimal getRestaPagar() {
        return restaPagar;
    }

    public void setRestaPagar(BigDecimal restaPagar) {
        this.restaPagar = restaPagar;
    }

    public String getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(String pagoTotal) {
        this.pagoTotal = pagoTotal;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getVendedorNome() {
        return vendedorNome;
    }

    public void setVendedorNome(String vendedorNome) {
        this.vendedorNome = vendedorNome;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}
