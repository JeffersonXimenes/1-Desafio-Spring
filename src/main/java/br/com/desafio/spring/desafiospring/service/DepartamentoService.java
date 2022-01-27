package br.com.desafio.spring.desafiospring.service;

import java.util.ArrayList;
import java.util.List;

import br.com.desafio.spring.desafiospring.model.Departamento;

public class DepartamentoService {

	private final List<Departamento> departamentos = new ArrayList<>();
	
	public List<Departamento> listarDepartamentos() {
		return departamentos;
	}
	
	public void criarDepartamento(Departamento departamentoRequest) {
		Departamento departamento = new Departamento();
		departamento.setId(departamentoRequest.getId());
		departamento.setNome(departamentoRequest.getNome());
		
		departamentos.add(departamento);
	}
}
