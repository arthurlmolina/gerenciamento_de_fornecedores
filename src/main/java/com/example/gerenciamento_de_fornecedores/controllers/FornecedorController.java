package com.example.gerenciamento_de_fornecedores.controllers;

import com.example.gerenciamento_de_fornecedores.models.FornecedorModel;
import com.example.gerenciamento_de_fornecedores.services.FornecedorService;
import com.fasterxml.jackson.annotation.OptBoolean;
import jakarta.servlet.Servlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.awt.*;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/fornecedores")
public class FornecedorController {

    @Autowired
    FornecedorService fornecedorService;

    @GetMapping
    public ResponseEntity<List<FornecedorModel>> findAll(){
        List<FornecedorModel> request = fornecedorService.findAll();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public Optional<FornecedorModel> buscarPorId(@PathVariable Long id){
        return fornecedorService.buscarPorId(id);
    }

    @PostMapping
    public ResponseEntity<FornecedorModel> criar(@RequestBody FornecedorModel fornecedorModel){
        FornecedorModel request = fornecedorService.criar(fornecedorModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(fornecedorModel.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @PutMapping("/{id}")
    public FornecedorModel atualizar(@RequestBody FornecedorModel fornecedorModel, @PathVariable Long id){
        return fornecedorService.atualizar(fornecedorModel, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Long id){
        fornecedorService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
