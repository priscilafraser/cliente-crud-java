package com.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.entidades.Livro;
import com.api.repository.LivroRepository;

@Controller
public class LivroController {
	
	@Autowired
	LivroRepository repo;
	
	
	@GetMapping
	public String xpto() {
		return "Index de livros";
	}
	
	@GetMapping("/livro")
	public ResponseEntity<Iterable<Livro>> getLivros() {
		Iterable<Livro> livros = repo.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(livros);
	}
	
	@GetMapping("/livro/{idlivro}")
	public ResponseEntity<Livro> getLivrosById(@PathVariable("idlivro") Long idlivro) {
		return ResponseEntity.status(HttpStatus.OK).body(repo.findById(idlivro).get());
	}
	
	@PostMapping("/livro")
	public ResponseEntity<Livro> saveLivro(@RequestBody Livro livro) { //pega o corpo da requisicao e guarda na variavel contato
		Livro liv = repo.save(livro);
		return ResponseEntity.status(HttpStatus.CREATED).body(liv);
	}
	
	@DeleteMapping("livro/{idlivro}")
	public ResponseEntity<Void> deleteLivro(@PathVariable("idlivro") Long idlivro) {
		repo.deleteById(idlivro);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("livro/{idlivro}")
	public ResponseEntity<Livro> alteraLivro(@PathVariable("idlivro") Long idlivro, @RequestBody Livro livro) {
		return ResponseEntity.ok(repo.save(livro));
	}
	

}
