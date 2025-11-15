package com.pic3.pic3.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "for_codigo")
    private Integer id;

    @Column(name = "for_pessoa")
    private String pessoa;

    @Column(name = "for_cnpj")
    private String cnpj;

    @Column(name = "for_razao")
    private String razao;

    @Column(name = "for_fantasia")
    private String fantasia;

    @Column(name = "for_endereco")
    private String endereco;

    @Column(name = "for_numero")
    private String numero;

    @Column(name = "for_cidade")
    private String cidade;

    @Column(name = "for_estado")
    private String estado;

    @Column(name = "for_telefone")
    private String telefone;

    @Column(name = "for_data_cadastro", nullable = false)
    private LocalDateTime dataCadastro = LocalDateTime.now();

}
