package com.pic3.pic3.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_produto")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pro_codigo")
    private Integer id;

    @Column(name = "pro_foto", nullable = false, length = 250)
    private String foto;

    @Column(name = "for_fantasia", nullable = false, length = 120)
    private String fornecedorFantasia;

    @Column(name = "pro_descricao", nullable = false, length = 250)
    private String descricao;

    @Column(name = "pro_descricao_add", nullable = false, length = 250)
    private String descricaoAdicional;

    @Column(name = "pro_custo", nullable = false, precision = 6, scale = 2)
    private BigDecimal custo;

    @Column(name = "pro_indice", nullable = false)
    private Integer indice;

    @Column(name = "pro_valor", nullable = false, precision = 6, scale = 2)
    private BigDecimal valor;

    @Column(name = "pro_tamanho", nullable = false, length = 30)
    private String tamanho;

    @Column(name = "pro_aluguel", nullable = false, length = 100)
    private String aluguel;

    @Column(name = "pro_qtde", nullable = false)
    private Integer quantidade;

    @Column(name = "pro_cor", nullable = false, length = 10)
    private String cor;

    @Column(name = "pro_status", nullable = false, length = 10)
    private String status;

    @Column(name = "pro_tipo", nullable = false, length = 255)
    private String tipo;

    @Column(name = "pro_data_cadastro", nullable = false)
    private LocalDateTime dataCadastro = LocalDateTime.now();

    // Getters e Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getFoto() { return foto; }
    public void setFoto(String foto) { this.foto = foto; }

    public String getFornecedorFantasia() { return fornecedorFantasia; }
    public void setFornecedorFantasia(String fornecedorFantasia) { this.fornecedorFantasia = fornecedorFantasia; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getDescricaoAdicional() { return descricaoAdicional; }
    public void setDescricaoAdicional(String descricaoAdicional) { this.descricaoAdicional = descricaoAdicional; }

    public BigDecimal getCusto() { return custo; }
    public void setCusto(BigDecimal custo) { this.custo = custo; }

    public Integer getIndice() { return indice; }
    public void setIndice(Integer indice) { this.indice = indice; }

    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }

    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }

    public String getAluguel() { return aluguel; }
    public void setAluguel(String aluguel) { this.aluguel = aluguel; }

    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public LocalDateTime getDataCadastro() { return dataCadastro; }
    public void setDataCadastro(LocalDateTime dataCadastro) { this.dataCadastro = dataCadastro; }
}
