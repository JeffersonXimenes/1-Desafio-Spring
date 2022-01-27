package br.com.desafio.spring.desafiospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.spring.desafiospring.entity.DepartamentoEntity;
import br.com.desafio.spring.desafiospring.model.Departamento;
import br.com.desafio.spring.desafiospring.repository.DepartamentoRepository;
import br.com.desafio.spring.desafiospring.service.DepartamentoService;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
	
	//@Autowired
	private DepartamentoService departamentoService;
	
	@Autowired
	private DepartamentoRepository departamentoRepository;
	
	@PostMapping
	public DepartamentoEntity criarDepartamento(@RequestBody Departamento departamentoRequest) {
		DepartamentoEntity departamentoEntity = new DepartamentoEntity(departamentoRequest.getId(), departamentoRequest.getNome());
		return this.departamentoRepository.save(departamentoEntity);
	}
	
	@GetMapping
	public List<Departamento> listarDepartamentos() {
		return departamentoService.listarDepartamentos();
	}
}
