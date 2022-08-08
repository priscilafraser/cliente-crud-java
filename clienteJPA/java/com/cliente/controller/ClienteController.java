package com.cliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cliente.entidades.Cliente;
import com.cliente.repository.ClienteRepository;

@Controller
@RequestMapping("/")
public class ClienteController {
	@Autowired
	private ClienteRepository repo;
	
	@GetMapping
	public String index() {
		return "index";
	}
	
	@GetMapping("/cadastro")
	public String formCadastro() {
		return "cadastro";
	}
	
	@GetMapping("/consulta")
	public String formConsulta(Model model) {
		Iterable<Cliente> clientes = repo.findAll();
		model.addAttribute("clientes", clientes);
		return "consulta";
	}
	
	@GetMapping("/consulta/{idcliente}")
	public String formEditar(@PathVariable("idcliente") int id, Model model) {
		Cliente cliente = repo.findById(id).get();
		model.addAttribute("cliente", cliente);
		return "edicao";
	}
	
	@PostMapping("/cadastro")
	public String salvar(Cliente cliente) {
		repo.save(cliente);
		return "redirect:/consulta";
	}

	@GetMapping("/delete/{idcliente}")
	public String delete(@PathVariable("idcliente") int id) {
		repo.deleteById(id);
		return "redirect:/consulta";
	}
}
