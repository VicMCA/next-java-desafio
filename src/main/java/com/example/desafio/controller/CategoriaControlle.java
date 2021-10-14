package com.example.desafio.controller;

import java.util.List;

import com.example.desafio.model.Categoria;
import com.example.desafio.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriaControlle {
  

  @Autowired
  private CategoriaRepository categoriaRepository;

  @GetMapping("/categorias")
  public List<Categoria> listarCategorias() {
    return categoriaRepository.findAll();
  }

}
