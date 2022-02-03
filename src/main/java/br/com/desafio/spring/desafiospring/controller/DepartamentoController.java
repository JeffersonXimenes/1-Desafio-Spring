package br.com.desafio.spring.desafiospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.spring.desafiospring.model.dto.Departamento;
import br.com.desafio.spring.desafiospring.model.dto.DepartamentoDTO;
import br.com.desafio.spring.desafiospring.model.entity.DepartamentoEntity;
import br.com.desafio.spring.desafiospring.service.DepartamentoService;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
	
	@Autowired
	private DepartamentoService departamentoService;
	
	@PostMapping
	public ResponseEntity<DepartamentoEntity> criarDepartamento(@RequestBody DepartamentoDTO departamentoDTO) throws Exception {
		return ResponseEntity.status(HttpStatus.CREATED).body(departamentoService.salvarDepartamento(departamentoDTO));
	}
	
	@GetMapping
	public ResponseEntity<List<Departamento>> listarDepartamentos() {
		return ResponseEntity.ok().body(departamentoService.listarDepartamentos());
	}
}
