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
}
