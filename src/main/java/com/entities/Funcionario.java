package com.entities;

import java.io.Serializable;

public class Funcionario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String matricula;
	private String nome;
	private String cpf;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String matricula, String nome, String cpf) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Funcionario [Matrícula:" + matricula + ", Nome:" + nome + ", CPF:" + cpf + "]";
	}
	  
}
