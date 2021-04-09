package com.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.entities.Funcionario;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Program {

	public static void main(String[] args) throws IOException {

		String caminho = "/home/andrebrandao/opt/techstone/Tarefas/extracaoMANAD/TesteManad/Teste.txt";
		
		List<Funcionario> list = new ArrayList<Funcionario>();

		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){

			Funcionario funcionario = null;

			String linha = br.readLine();
			linha = br.readLine();

			while(linha != null) {
				
				String[] vetor = linha.split("\\|");
				String numero = vetor[0];
				String cnpj = vetor[1];
				String matricula = vetor[4];
				String nome = vetor[7];
				String cpf = vetor[5];
				String funcao = vetor[10];

				funcionario = Funcionario.builder().numero(numero).nome(nome).chave(matricula).cpf(cpf).cnpj(cnpj).funcao(funcao).codigo("").nit("").id(UUID.randomUUID().toString()).build(); 
				log.debug("Matrícula: {} Nome: {}, CPF: {}, Função: {}", matricula, nome, cpf, funcao);


					FileWriter fw = new FileWriter("/home/andrebrandao/opt/techstone/Tarefas/extracaoMANAD/TesteManad/Teste1.txt");
					PrintWriter pw = new PrintWriter(fw);
					pw.println("================================== Criando Funcionário ==================================");
					
					pw.println("Numero: " + numero);
					pw.println("CNPJ: " + cnpj);
					pw.println("Matrícula: " + matricula);
					pw.println("Nome: " + nome);
					pw.println("CPF: " + cpf);
					pw.println("Função: " + funcao);
					
					pw.println("================================== Funcionário criado ==================================");
					
					list.add(funcionario);
					linha = br.readLine();
					
					pw.close();
					fw.close();
				
			}

			System.out.println("Funcionários: ");
			for(Funcionario func : list) {
				System.out.println(func);
			}
		}
		catch (Exception e) {
			System.out.println("Error: " +e.getMessage());
		}

	}
}
