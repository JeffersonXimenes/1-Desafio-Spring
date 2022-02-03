package br.com.desafio.spring.desafiospring.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafio.spring.desafiospring.business.DepartamentoBusiness;
import br.com.desafio.spring.desafiospring.model.dto.Departamento;
import br.com.desafio.spring.desafiospring.model.dto.DepartamentoDTO;
import br.com.desafio.spring.desafiospring.model.entity.DepartamentoEntity;
import br.com.desafio.spring.desafiospring.repository.DepartamentoRepository;

@Service
public class DepartamentoService extends DepartamentoBusiness {
	
	@Autowired
	private DepartamentoRepository departamentoRepository;
	
	public DepartamentoEntity salvarDepartamento(DepartamentoDTO departamentoDTO) throws Exception {
		isExisteDepartamentoComMesmoNome(departamentoDTO);
		DepartamentoEntity departamentoEntity = new DepartamentoEntity(departamentoDTO.getNome());
		
		return departamentoRepository.save(departamentoEntity);
	}
	
	public List<Departamento> listarDepartamentos() {
		List<DepartamentoEntity> departamentoEntity = departamentoRepository.findAll();
		return departamentoEntity
				.stream()
				.map(this::toResponseDepartamento)
				.collect(Collectors.toList());
	}
	
	private Departamento toResponseDepartamento(DepartamentoEntity departamentoEntity) {
		return new Departamento(departamentoEntity.getId(), departamentoEntity.getNome());
	}
}
