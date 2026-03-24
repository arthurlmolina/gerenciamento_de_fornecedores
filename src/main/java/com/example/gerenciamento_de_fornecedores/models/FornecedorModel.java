package com.example.gerenciamento_de_fornecedores.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_fornecedor")
public class FornecedorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeFantasia;
    @Column(name = "cnpjFornecedor")
    private String cpnj;
    @Column(name = "contatoFornecedor")
    private String contato;

    public FornecedorModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }


}
