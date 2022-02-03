package br.com.desafio.spring.desafiospring.model.entity;

import java.math.BigDecimal;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_departamento")
public class DepartamentoEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigDecimal id;
	
	@Column(name = "nome")
	private String nome;

	public DepartamentoEntity(String nome) {
		super();
		this.nome = nome;
	}
}
