package com.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.entidades.Livro;

@Repository
public interface LivroRepository extends CrudRepository<Livro, Long> {

}
