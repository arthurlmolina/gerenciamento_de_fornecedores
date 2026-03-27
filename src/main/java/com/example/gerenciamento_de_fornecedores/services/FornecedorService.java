package com.example.gerenciamento_de_fornecedores.services;

import com.example.gerenciamento_de_fornecedores.models.FornecedorModel;
import com.example.gerenciamento_de_fornecedores.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public List<FornecedorModel> findAll(){
        return fornecedorRepository.findAll();
    }

    public Optional<FornecedorModel> buscarPorId(Long id){
        return fornecedorRepository.findById(id);
    }

    public FornecedorModel criar(FornecedorModel fornecedorModel){
        return fornecedorRepository.save(fornecedorModel);
    }

    public FornecedorModel atualizar(FornecedorModel fornecedorModel, Long id){
        FornecedorModel fornecedor = fornecedorRepository.findById(id).get();
        fornecedor.setNomeFantasia(fornecedorModel.getNomeFantasia());
        return fornecedorRepository.save(fornecedor);
    }

    public void deletar(Long id){
        fornecedorRepository.deleteById(id);
    }

}
