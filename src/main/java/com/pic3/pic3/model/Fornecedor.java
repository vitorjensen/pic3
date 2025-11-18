package com.pic3.pic3.model;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor {

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
    private LocalDate dataCadastro = LocalDate.now();

    public Fornecedor(){}
    public Integer getId() { return id; }
    public void setId(Integer id){this.id = id;}

    public String getPessoa(){ return pessoa; }
    public void setPessoa(String pessoa){ this.pessoa = pessoa; }

    public String getCnpj(){ return cnpj; }
    public void setCnpj(String cnpj){ this.cnpj = cnpj; }

    public String getRazao(){ return razao; }
    public void setRazao(String razao){ this.razao = razao; }

    public String getFantasia() { return fantasia; }
    public void setFantasia(String fantasia){ this.fantasia = fantasia; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco){ this.endereco = endereco; }

    public String getNumero(){ return numero; }
    public void setNumero(String numero){ this.numero = numero; }

    public String getCidade(){ return cidade; }
    public void setCidade(String cidade){ this.cidade = cidade; }

    public String getEstado(){ return estado; }
    public  void setEstado(String estado){ this.estado = estado; }

    public String getTelefone(){ return telefone; }
    public void setTelefone(String telefone){ this.telefone = telefone; }

    public LocalDate getDataCadastro(){ return dataCadastro; }
    public void setDataCadastro(LocalDate dataCadastro){ this.dataCadastro = dataCadastro; }
}
