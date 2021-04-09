package com.entities;

import lombok.Builder;
import lombok.Value;

@Builder(toBuilder = true)
@Value
public class Funcionario implements Comparable<Funcionario>{
	
	  String codigo;
	  String cpf;
	  String cnpj;
	  String nit;
	  String funcao;
	  String id;
	  String chave;
	  String nome;
	  String numero;

	@Override
	public int compareTo(Funcionario o) {
		return id.compareTo(o.id);
	}
	  
}
