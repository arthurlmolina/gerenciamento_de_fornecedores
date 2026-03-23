package com.example.gerenciamento_de_fornecedores.repositories;

import com.example.gerenciamento_de_fornecedores.models.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<FornecedorModel, Long> {
}
