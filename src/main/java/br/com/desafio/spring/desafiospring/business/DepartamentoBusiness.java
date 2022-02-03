package br.com.desafio.spring.desafiospring.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafio.spring.desafiospring.model.dto.Departamento;
import br.com.desafio.spring.desafiospring.model.dto.DepartamentoDTO;
import br.com.desafio.spring.desafiospring.service.DepartamentoService;

@Service
public class DepartamentoBusiness {
	
	@Autowired
	private DepartamentoService departamentoService;
	
	public void isExisteDepartamentoComMesmoNome(DepartamentoDTO departamentoDTO) throws Exception {
		List<Departamento> departamentos = departamentoService.listarDepartamentos();
		
		Boolean isContemMesmoNome = departamentos.stream().anyMatch(departamento -> departamento.getNome() == departamentoDTO.getNome());
		
		if(isContemMesmoNome) {
			throw new Exception("Já existe um departamento com esse nome");
		}
		
	}

}
