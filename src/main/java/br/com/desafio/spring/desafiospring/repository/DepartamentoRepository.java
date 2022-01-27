package br.com.desafio.spring.desafiospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafio.spring.desafiospring.entity.DepartamentoEntity;

public interface DepartamentoRepository extends JpaRepository<DepartamentoEntity, Long>{

}
