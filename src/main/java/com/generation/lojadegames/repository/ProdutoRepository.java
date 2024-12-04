package com.generation.lojadegames.repository;

import java.util.List;

import com.generation.lojadegames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojadegames.model.Categoria;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public List <Produto> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);

}

