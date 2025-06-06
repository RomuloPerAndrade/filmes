package br.senac.tads.dsw.filmes.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.senac.tads.dsw.filmes.models.Filme;
import br.senac.tads.dsw.filmes.repositories.FilmeRepository;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/filmes")
public class FilmeController {

    @Autowired
    private FilmeRepository filmeRepository;

    @GetMapping
    public List<Filme> listarFilmes() {
        return filmeRepository.findAll();
    }

    @PostMapping
    public Filme adicionarFilme(@RequestBody @Valid Filme filme) {
        return filmeRepository.save(filme);
    }
}