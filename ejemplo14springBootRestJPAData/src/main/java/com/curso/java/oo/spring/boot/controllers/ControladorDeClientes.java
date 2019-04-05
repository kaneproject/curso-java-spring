package com.curso.java.oo.spring.boot.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.java.oo.spring.boot.model.entities.Cliente;
import com.curso.java.oo.spring.boot.model.entities.ClienteRepository;

@RestController
public class ControladorDeClientes
{
	private final ClienteRepository repository;
	
	public ControladorDeClientes(ClienteRepository repository)
	{
		this.repository = repository;
	}
	
	@GetMapping("/Clientes")
	public List<Cliente> clientes()
	{
		return repository.findAll();
	}
	
	@PostMapping("/clientes")
	public Cliente nuevoCliente(@RequestBody Cliente cliente)
	{
		return repository.save(cliente);		
	}

	@GetMapping("/clientes/{id}")
	public Cliente cliente(@PathVariable Integer id)
	{
		return repository.findById(id).orElse(null);
	}
	
	@DeleteMapping("/clientes/{id}")
	public void borrarCliente(@PathVariable Integer id)
	{
		repository.deleteById(id);
	}
	
	@PutMapping("/clientes/{id}")
	public Cliente actualizarCliente(@RequestBody Cliente cliente, @PathVariable Integer id)
	{
		return repository.findById(id)
		.map(c ->{
			c.setNombre(cliente.getNombre());
			c.setValor(cliente.getValor());
			return repository.save(c);
		})
		.orElseGet(()->{
			cliente.setId(id);
			return repository.save(cliente);
		});
	}
}