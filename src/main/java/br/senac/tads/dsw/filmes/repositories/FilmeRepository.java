package br.senac.tads.dsw.filmes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.senac.tads.dsw.filmes.models.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}