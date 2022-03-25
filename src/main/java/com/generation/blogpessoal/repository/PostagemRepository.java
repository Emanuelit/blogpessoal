package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;

//Long está recebendo o objeto da classe postagem e também o identificador único da tabela Primary key Long
//jpa repository tem todos os métodos para trabalhar com o banco de dados
//método find, save, delete
@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
//métodos para implementar interface

	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
}
