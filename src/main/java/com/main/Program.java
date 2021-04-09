package com.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		String path = "/home/andrebrandao/opt/techstone/Tarefas/extracaoMANAD/teste.txt";
		
		List<Funcionario> list = new ArrayList<Funcionario>();
	
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String linha = br.readLine();
			linha = br.readLine();
			
			while(linha != null) {
				String[] vetor = linha.split("\\|");
				String matricula = vetor[4];
				String nome = vetor[7];
				String cpf = vetor[5];
				
				Funcionario funcionario = new Funcionario(matricula, nome, cpf);
				list.add(funcionario);
				
				linha = br.readLine();
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
