package com.entities;

import lombok.Builder;
import lombok.Value;

@Builder(toBuilder = true)
@Value
public class Funcionario implements Comparable<Funcionario>{
	
	  String codigo,cpf,cnpj,nit,funcao,id,chave,nome,numero;

	@Override
	public int compareTo(Funcionario o) {
		return id.compareTo(o.id);
	}
	  
}
