package com.pic3.pic3.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cliente")

// --- Classe criada para o Modelo de Cliente declarando seus seus atributos ---
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cli_codigo")
    private Integer id;

    @Column(name = "cli_nome", nullable = false)
    private String nome;

    @Column(name = "cli_telefone", nullable = false)
    private String telefone;

    @Column(name = "cli_cpf", nullable = false)
    private String cpf;

    @Column(name = "cli_rua", nullable = false)
    private String rua;

    @Column(name = "cli_numero", nullable = false)
    private String numero;

    @Column(name = "cli_bairro", nullable = false)
    private String bairro;

    @Column(name = "cli_cidade", nullable = false)
    private String cidade;

    @Column(name = "cli_estado", nullable = false, length = 2)
    private String estado;

    @Column(name = "cli_complemento", nullable = false)
    private String complemento;

    // --- GETTERS e SETTERS de CLIENTE ---
    public Cliente(){}
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }


    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getRua() { return rua; }
    public void setRua(String rua) { this.rua = rua; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }
}
