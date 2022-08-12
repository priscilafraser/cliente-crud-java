package com.api.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50, nullable = false)
	private String titulo;

	@Column(length = 50, nullable = false)
	private String autor;

	@Column(length = 25, nullable = false)
	private String formato;

	@Column(length = 10, nullable = false)
	private String condicao;

	@Column(nullable = false)
	private double preco;

	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public Livro(String titulo, String autor, String formato, String condicao, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.condicao = condicao;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
