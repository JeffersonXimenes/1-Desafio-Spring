package br.com.desafio.spring.desafiospring.model.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Departamento {
	
	private BigDecimal id;
	private String nome;
}
